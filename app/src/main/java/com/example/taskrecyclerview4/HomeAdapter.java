package com.example.taskrecyclerview4;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyViewHolder> {
    Context context;
    String[] namaClub;
    String[] asalClub;
    String[] ketCLub;
    int[] logoClub;
    public HomeAdapter(Context context, String[] namaClub, int[] logoClub, String[] asalClub, String[] ketClub) {
        this.asalClub = asalClub;
        this.context = context;
        this.namaClub = namaClub;
        this.logoClub = logoClub;
        this.ketCLub = ketClub;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(context).inflate(R.layout.fragment_untukditempelin, null);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, final int i) {
            myViewHolder.textView.setText(namaClub[i]);
            myViewHolder.textView2.setText(asalClub[i]);
            myViewHolder.imageView.setImageResource(logoClub[i]);
            myViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, PindahActivity.class);
                    intent.putExtra("namaClub", namaClub[i]);
                    intent.putExtra("logoClub", logoClub[i]);
                    intent.putExtra("ketClub", ketCLub[i]);
                    context.startActivity(intent);

                }
            });

    }

    @Override
    public int getItemCount() {
        return namaClub.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        TextView textView2;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.Logo);
            textView = itemView.findViewById(R.id.NamaClub);
            textView2 = itemView.findViewById(R.id.AsalClub);
        }
    }
}
