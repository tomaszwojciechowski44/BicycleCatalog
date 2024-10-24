package com.example.bicyclecatalog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class BicycleListFragment extends Fragment {

    private RecyclerView recyclerView;
    private BicycleAdapter adapter;
    private List<Bicycle> bicycleList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate layout fragment_bicycle_list
        View view = inflater.inflate(R.layout.fragment_bicycle_list, container, false);

        // Znalezienie RecyclerView w layoucie
        recyclerView = view.findViewById(R.id.recyclerViewBicycles);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        // Tymczasowe dane testowe
        bicycleList = new ArrayList<>();
        bicycleList.add(new Bicycle("Mountain Bike", "Off-Road", "Good for mountain riding", "2023-10-10"));
        bicycleList.add(new Bicycle("Road Bike", "Road", "Lightweight and fast", "2023-09-20"));

        // Inicjalizacja adaptera i połączenie go z RecyclerView
        adapter = new BicycleAdapter(bicycleList);
        recyclerView.setAdapter(adapter);

        return view;
    }
}
