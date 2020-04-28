package com.example.zaiko.domain.inhouse.storageLocation;

public interface StorageLocationRepository {
    StorageLocation get(StorageLocationId storageLocationId);

    boolean save(StorageLocation storageLocation);
}
