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
        View view = inflater.inflate(R.layout.fragment_bicycle_list, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerViewBicycles);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        BicycleDatabase db = BicycleDatabase.getInstance(getContext());
        List<Bicycle> bicycleList = db.bicycleDao().getAllBicycles();

        BicycleAdapter adapter = new BicycleAdapter(bicycleList);
        recyclerView.setAdapter(adapter);

        return view;
    }
}
