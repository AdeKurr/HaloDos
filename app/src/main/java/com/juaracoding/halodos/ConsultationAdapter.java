package com.juaracoding.halodos;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ConsultationAdapter extends RecyclerView.Adapter<ConsultationAdapter.AdvisorsViewHolder>{

    private ArrayList<ConsultationData> listAdvisors;

    public ConsultationAdapter(ArrayList<ConsultationData> listAdvisors) {
        this.listAdvisors = listAdvisors;
    }

    @NonNull
    @Override
    public ConsultationAdapter.AdvisorsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.activity_cardview_advisor_list, parent, false);
        return new AdvisorsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ConsultationAdapter.AdvisorsViewHolder holder, int position) {
        holder.pfpAdvisor.setImageResource(listAdvisors.get(position).getImageResourceId());
        holder.tvNama.setText(listAdvisors.get(position).getNama());
        holder.tvTanggal.setText(listAdvisors.get(position).getTanggal());
        holder.tvJam.setText(listAdvisors.get(position).getJam());
    }

    @Override
    public int getItemCount() {
        return (listAdvisors!=null) ? listAdvisors.size() : 0;
    }

    public class AdvisorsViewHolder extends RecyclerView.ViewHolder{

        private ImageView pfpAdvisor;
        private TextView tvNama, tvTanggal, tvJam;

        public  AdvisorsViewHolder (View view){
            super(view);

            pfpAdvisor = view.findViewById(R.id.pfpadvisor);
            tvNama = view.findViewById(R.id.advisorname);
            tvTanggal = view.findViewById(R.id.consultdate);
            tvJam = view.findViewById(R.id.consulttime);
        }
    }
}
