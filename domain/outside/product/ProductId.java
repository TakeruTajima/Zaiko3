package com.example.zaiko.domain.outside.product;

import com.example.zaiko.domain.common.Identity;

public class ProductId extends Identity {
    protected ProductId() {
        super();
    }

    public ProductId(String uuid) {
        super(uuid);
    }
}
