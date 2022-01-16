package com.juaracoding.halodos;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class AdvisorListActivity extends AppCompatActivity {

    private RecyclerView recyclerViewUpcoming, recyclerViewFinished;
    private ConsultationAdapter consultationAdapterUpcoming, consultationAdapterFinished;
    private ArrayList<ConsultationData> consultationDataArrayList, finishedAdvisorDataArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advisor_list);

        //Toolbar starts
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);
        //Toolbar finishes

        //RecyclerView buat upcoming dosen - start
        getDataUpcomingAdvisorList();

        recyclerViewUpcoming = findViewById(R.id.upcomingadvisorlist);
        consultationAdapterUpcoming = new ConsultationAdapter(consultationDataArrayList);

        RecyclerView.LayoutManager layoutManagerUpcoming = new LinearLayoutManager(AdvisorListActivity.this);

        recyclerViewUpcoming.setLayoutManager(layoutManagerUpcoming);
        recyclerViewUpcoming.setAdapter(consultationAdapterUpcoming);
        //RecyclerView buat upcoming dosen - finish

        //RecyclerView buat finished dosen - start
        getDataFinishedAdvisorList();

        recyclerViewFinished = findViewById(R.id.recyclerfinishedadvisorlist);
        consultationAdapterFinished = new ConsultationAdapter(finishedAdvisorDataArrayList);

        RecyclerView.LayoutManager layoutManagerFinished = new LinearLayoutManager(AdvisorListActivity.this);

        recyclerViewFinished.setLayoutManager(layoutManagerFinished);
        recyclerViewFinished.setAdapter(consultationAdapterFinished);
        //RecyclerView buat finished dosen - start
    }

    public void getDataUpcomingAdvisorList(){
        consultationDataArrayList = new ArrayList<>();
        consultationDataArrayList.add(new ConsultationData(R.drawable.splash, "Bapack Quiz", "31 Januari 2022", "4 PM - 5 PM"));
        consultationDataArrayList.add(new ConsultationData(R.drawable.pfpadvisor,"Jono Sujono", "32 Januari 2022", "1 AM - 2 AM"));
        consultationDataArrayList.add(new ConsultationData(R.drawable.pepe, "Kodok", "33 Januari 2022", "10 AM - 11 AM"));
    }

    public void getDataFinishedAdvisorList() {
        finishedAdvisorDataArrayList = new ArrayList<>();
        finishedAdvisorDataArrayList.add(new ConsultationData(R.drawable.tessy_srimulat, "Tessy Wahyuni Riwayati Hartatik", "10 Desember 2012", "4 PM - 5 PM"));
        finishedAdvisorDataArrayList.add(new ConsultationData(R.drawable.gogon, "Gogon", "31 Februari 1942", "1 AM - 2 AM"));
        finishedAdvisorDataArrayList.add(new ConsultationData(R.drawable.tukul, "Tukul", "1 Muharram 1443 H", "10 AM - 11 AM"));
    }
}