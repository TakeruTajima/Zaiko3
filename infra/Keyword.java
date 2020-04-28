package com.example.zaiko.infra;

import androidx.annotation.NonNull;
import androidx.room.Entity;

@Entity(tableName = "keywords", primaryKeys = {"equipment_id","word"})
public class Keyword {
    String equipment_id;
    String word;

    Keyword(@NonNull String equipment_id, @NonNull String word) {
        this.equipment_id = equipment_id;
        this.word = word;
    }
}
