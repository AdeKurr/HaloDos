package com.juaracoding.halodos;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;

import java.util.ArrayList;
import java.util.Locale;

public class ConsultingUserListActivity extends AppCompatActivity {

    Button startTime, endTime;
    int hour, minute;

    private RecyclerView recyclerViewUpcoming, recyclerViewFinished;
    private ConsultationAdapter consultationAdapterUpcoming, consultationAdapterFinished;
    private ArrayList<ConsultationData> upcomingConsultingUserArrayList, finishedConsultingUserDataArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consulting_user_list);

        //Toolbar starts
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);
        //Toolbar finishes

        //RecyclerView buat upcoming user - start
        getDataUpcomingConsultingUserList();

        recyclerViewUpcoming = findViewById(R.id.upcomingUserList);
        consultationAdapterUpcoming = new ConsultationAdapter(upcomingConsultingUserArrayList);

        RecyclerView.LayoutManager layoutManagerUpcoming = new LinearLayoutManager(ConsultingUserListActivity.this);

        recyclerViewUpcoming.setLayoutManager(layoutManagerUpcoming);
        recyclerViewUpcoming.setAdapter(consultationAdapterUpcoming);
        //RecyclerView buat upcoming user - finish

        //RecyclerView buat finished user - start
        getDataFinishedConsultingUserList();

        recyclerViewFinished = findViewById(R.id.finishedConsultingUserList);
        consultationAdapterFinished = new ConsultationAdapter(finishedConsultingUserDataArrayList);

        RecyclerView.LayoutManager layoutManagerFinished = new LinearLayoutManager(ConsultingUserListActivity.this);

        recyclerViewFinished.setLayoutManager(layoutManagerFinished);
        recyclerViewFinished.setAdapter(consultationAdapterFinished);
        //RecyclerView buat finished user - finish

        //time button start
        startTime = findViewById(R.id.startTime);
        endTime = findViewById(R.id.endTime);
        //time button finish
    }

    public void getDataUpcomingConsultingUserList() {
        upcomingConsultingUserArrayList = new ArrayList<>();
        upcomingConsultingUserArrayList.add(new ConsultationData(R.drawable.spiderman, "Abang Tali Jemuran", "31 Januari 2022", "4 PM - 5 PM"));
    }

    public void getDataFinishedConsultingUserList() {
        finishedConsultingUserDataArrayList = new ArrayList<>();
        finishedConsultingUserDataArrayList.add(new ConsultationData(R.drawable.ironman, "Tukang Setrika", "10 Desember 2012", "4 PM - 5 PM"));
        finishedConsultingUserDataArrayList.add(new ConsultationData(R.drawable.thor, "Kuli Bangunan", "31 Februari 1942", "1 AM - 2 AM"));
        finishedConsultingUserDataArrayList.add(new ConsultationData(R.drawable.widow, "Janda", "1 Muharram 1443 H", "10 AM - 11 AM"));
    }

    public void startTimePicker (View view){
        TimePickerDialog.OnTimeSetListener onTimeSetListener = new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
                hour = selectedHour;
                minute = selectedMinute;
                startTime.setText(String.format(Locale.getDefault(), "%02d:%02d", hour, minute));
            }
        };

        TimePickerDialog timePickerDialog = new TimePickerDialog(this, onTimeSetListener, hour, minute, true);

        timePickerDialog.setTitle("Select Time");
        timePickerDialog.show();
    }

    public void endTimePicker (View view){
        TimePickerDialog.OnTimeSetListener onTimeSetListener = new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
                hour = selectedHour;
                minute = selectedMinute;
                endTime.setText(String.format(Locale.getDefault(), "%02d:%02d", hour, minute));
            }
        };

        TimePickerDialog timePickerDialog = new TimePickerDialog(this, onTimeSetListener, hour, minute, true);

        timePickerDialog.setTitle("Select Time");
        timePickerDialog.show();
    }
}