package com.example.bicyclecatalog;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Bicycle.class}, version = 1)
public abstract class BicycleDatabase extends RoomDatabase {

    private static BicycleDatabase instance;

    public abstract BicycleDao bicycleDao();

    public static synchronized BicycleDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                            BicycleDatabase.class, "bicycle_database")
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return instance;
    }
}
