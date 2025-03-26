package com.example.bicyclecatalog;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.bicyclecatalog.Bicycle;
import com.example.bicyclecatalog.BicycleDatabase;

public class BicycleFormFragment extends Fragment {

    private EditText editTextName;
    private EditText editTextType;
    private EditText editTextDescription;
    private Button buttonAddBicycle;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bicycle_form, container, false);

        // Inicjalizacja pól formularza
        editTextName = view.findViewById(R.id.editTextName);
        editTextType = view.findViewById(R.id.editTextType);
        editTextDescription = view.findViewById(R.id.editTextDescription);
        buttonAddBicycle = view.findViewById(R.id.buttonAddBicycle);

        // Obsługa kliknięcia przycisku "Add New Bicycle"
        buttonAddBicycle.setOnClickListener(v -> {
            String name = editTextName.getText().toString();
            String type = editTextType.getText().toString();
            String description = editTextDescription.getText().toString();

            if (!name.isEmpty() && !type.isEmpty() && !description.isEmpty()) {
                Bicycle newBicycle = new Bicycle(name, type, description, "");
                BicycleDatabase.getInstance(getContext()).bicycleDao().insert(newBicycle);
            }
        });

        return view;
    }
}
