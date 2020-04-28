package com.example.zaiko.domain.outside.commodity;

import com.example.zaiko.domain.outside.product.ProductId;

public interface CommodityRepository {
    Commodity get(ProductId productId);
    //会社IDから商品を取得する
}
