package com.example.bicyclecatalog;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class BicycleAdapter extends RecyclerView.Adapter<BicycleAdapter.BicycleViewHolder> {

    private List<Bicycle> bicycles;

    // Konstruktor adaptera, przyjmuje listę rowerów
    public BicycleAdapter(List<Bicycle> bicycles) {
        this.bicycles = bicycles;
    }

    @NonNull
    @Override
    public BicycleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflating bicycle_item layout
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.bicycle_item, parent, false);
        return new BicycleViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull BicycleViewHolder holder, int position) {
        // Pobieranie roweru z listy na podstawie pozycji
        Bicycle currentBicycle = bicycles.get(position);

        // Ustawienie danych w widokach
        holder.tvBicycleName.setText(currentBicycle.getName());
        holder.tvBicycleType.setText(currentBicycle.getType());
    }

    @Override
    public int getItemCount() {
        return bicycles.size();
    }

    // ViewHolder - przechowuje referencje do widoków w layoucie bicycle_item
    public static class BicycleViewHolder extends RecyclerView.ViewHolder {
        public TextView tvBicycleName;
        public TextView tvBicycleType;

        public BicycleViewHolder(@NonNull View itemView) {
            super(itemView);
            tvBicycleName = itemView.findViewById(R.id.tvBicycleName);
            tvBicycleType = itemView.findViewById(R.id.tvBicycleType);
        }
    }
}
