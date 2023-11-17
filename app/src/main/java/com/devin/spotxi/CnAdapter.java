package com.devin.spotxi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class CnAdapter extends FirebaseRecyclerAdapter<CustomAdapter,CnAdapter.myViewHolder> {
    public CnAdapter(@NonNull FirebaseRecyclerOptions<CustomAdapter> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myViewHolder holder, int position, @NonNull CustomAdapter model) {
        holder.teamA.setText(model.getTeamA());
        holder.teamB.setText(model.getTeamB());
        holder.place.setText(model.getPlace());
        holder.time.setText(model.getTime());
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cr,parent,false);
       return new myViewHolder(view);
    }

    class myViewHolder extends RecyclerView.ViewHolder{
        ImageView imgA,imgB;
        TextView teamA,teamB,place,time;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            imgA=(ImageView)itemView.findViewById(R.id.img_a);
            imgB=(ImageView)itemView.findViewById(R.id.img_b);

            teamA=(TextView) itemView.findViewById(R.id.team_a);
            teamB=(TextView) itemView.findViewById(R.id.team_b);

            place=(TextView) itemView.findViewById(R.id.location);
            time=(TextView) itemView.findViewById(R.id.time_tv);
        }
    }


}
