package com.example.bicyclecatalog;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

/*
Diese Klasse BicycleDatabase ist eine abstrakte Klasse, die eine Room-Datenbank in
einer Android-Anwendung verwaltet. Room ist eine Abstraktionsschicht über SQLite,
die die Arbeit mit Datenbanken in Android-Anwendungen erleichtert. Die Klasse stellt
eine Singleton-Instanz der Datenbank zur Verfügung, sodass nur eine Instanz der Datenbank
für die gesamte Anwendung erstellt wird
 */
/*
Ta klasa BicycleDatabase jest klasą abstrakcyjną, która zarządza bazą danych Room w
aplikacji na Androida. Room to warstwa abstrakcji na SQLite, która ułatwia pracę z
bazami danych w aplikacjach na Androida. Klasa udostępnia pojedynczą instancję bazy danych,
dzięki czemu tworzona jest tylko jedna instancja bazy danych dla całej aplikacji.*/

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
