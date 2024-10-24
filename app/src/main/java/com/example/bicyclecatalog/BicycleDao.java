package com.example.bicyclecatalog;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface BicycleDao {

    @Insert
    void insert(Bicycle bicycle);

    @Update
    void update(Bicycle bicycle);

    @Delete
    void delete(Bicycle bicycle);

    @Query("SELECT * FROM bicycle_table")
    List<Bicycle> getAllBicycles();
}
