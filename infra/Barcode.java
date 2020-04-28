package com.example.zaiko.infra;

import androidx.annotation.NonNull;
import androidx.room.Entity;

@Entity(tableName = "external_barcode", primaryKeys = {"equipment_id", "code"})
public class Barcode {
    String equipment_id;
    String code;

    Barcode(@NonNull String equipment_id, @NonNull String code) {
        this.equipment_id = equipment_id;
        this.code = code;
    }
}
