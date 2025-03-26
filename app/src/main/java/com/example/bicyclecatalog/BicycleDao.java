package com.example.bicyclecatalog;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

/*
Diese Klasse ist ein DAO (Data Access Object) für die Verwaltung der Datenbankinteraktionen
in der BicycleCatalog-App. Das DAO ermöglicht den Zugriff auf
die Datenbank (in diesem Fall eine Tabelle für Fahrräder) und
definiert Methoden für das Einfügen, Aktualisieren, Löschen und Abfragen von Daten.
https://chatgpt.com/c/671a1fe1-8c20-8005-beed-c7864d0554dc*/

/*Ta klasa to DAO (Data Access Object) do zarządzania interakcjami z bazą danych w
/aplikacji BicycleCatalog. DAO zapewnia dostęp do bazy danych (w tym przypadku tabeli dla rowerów)
 i definiuje metody wstawiania, aktualizowania, usuwania i odpytywania danych.*/

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
