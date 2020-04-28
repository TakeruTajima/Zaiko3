package com.example.zaiko.domain.inhouse.orderSlip;

import androidx.annotation.NonNull;

import com.example.zaiko.domain.inhouse.user.UserId;
import com.example.zaiko.domain.outside.commodity.CommodityId;

import java.time.ZonedDateTime;

public final class Arrival extends BuyRequest {
    public Arrival(@NonNull CommodityId commodityId, int quantity, @NonNull UserId userId, @NonNull String note) {
        super(commodityId, quantity, userId, note);
    }

    public Arrival(@NonNull CommodityId commodityId, int quantity, @NonNull UserId userId, @NonNull ZonedDateTime createdAt, @NonNull String note) {
        super(commodityId, quantity, userId, createdAt, note);
    }
}
