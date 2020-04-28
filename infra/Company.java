package com.example.zaiko.infra;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "companies")
public class Company {
    @PrimaryKey
    String _id;
    String name;

    Company(@NonNull String _id, @NonNull String name) {
        this._id = _id;
        this.name = name;
    }
}
