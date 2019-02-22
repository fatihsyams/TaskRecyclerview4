package com.example.taskrecyclerview4;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    RecyclerView rvHome;
    HomeAdapter adapter;
    String[] ketClub = {"Arsenal", "Barcelona", "Juventus", "lazio", "Napoli", "Sevilla", "Valencia", "Villareal"};
    String[] namaClub = {"Arsenal", "Barcelona", "Juventus", "lazio", "Napoli", "Sevilla", "Valencia", "Villareal"};
    int[] logoClub = {R.drawable.arsenal, R.drawable.barcelona, R.drawable.juventus, R.drawable.lazio, R.drawable.napoli, R.drawable.sevilla, R.drawable.valencia, R.drawable.villarreal};
    String[] asalClub = {"England", "Spain", "Italia", "Italia", "Italia", "Spain", "Spain", "Spain"};
    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_home, container, false);
        rvHome = v.findViewById(R.id.rvHome);
        adapter = new HomeAdapter(getActivity(), namaClub, logoClub, asalClub, ketClub);
        rvHome.setAdapter(adapter);


        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        rvHome.setLayoutManager(new GridLayoutManager(getActivity(),  2));
    }
}
