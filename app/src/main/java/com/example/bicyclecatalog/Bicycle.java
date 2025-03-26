package com.example.bicyclecatalog;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

/*Diese Klasse definiert eine Entität namens Bicycle für die Room-Datenbank in einer
Android-Anwendung. Sie wird verwendet, um Fahrräder mit bestimmten
Eigenschaften (wie Name, Typ, Beschreibung und Datum der Hinzufügung) zu speichern.
https://chatgpt.com/c/671a1d45-8ad4-8005-a239-de4d2bd38745*/

@Entity(tableName = "bicycle_table")
public class Bicycle {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String name;
    private String type;
    private String description;
    private String dateAdded;

    public Bicycle(String name, String type, String description, String dateAdded) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.dateAdded = dateAdded;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public String getDateAdded() {
        return dateAdded;
    }
}
