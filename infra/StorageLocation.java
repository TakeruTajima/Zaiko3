package com.example.zaiko.infra;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(tableName = "storage_locations",
        indices = {@Index(value = {"equipment_id", "name"}, unique = true)})
public class StorageLocation {
    @PrimaryKey
    String _id;
    String equipment_id;
    String name;
    int quantity;
    String condition;

    StorageLocation(@NonNull String _id, @NonNull String equipment_id, @NonNull String name, int quantity, @NonNull String condition) {
        this._id = _id;
        this.equipment_id = equipment_id;
        this.name = name;
        this.quantity = quantity;
        this.condition = condition;
    }
}
