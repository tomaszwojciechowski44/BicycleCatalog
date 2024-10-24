package com.example.bicyclecatalog;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

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
