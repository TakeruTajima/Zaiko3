package com.example.zaiko.domain.common;

import com.example.zaiko.domain.outside.company.CompanyId;
import com.example.zaiko.domain.outside.product.Model;
import com.example.zaiko.domain.outside.product.Name;
import com.example.zaiko.domain.outside.product.Price;
import com.example.zaiko.domain.outside.product.Product;
import com.example.zaiko.domain.outside.product.Unit;

import java.util.HashMap;
import java.util.Map;

/**
 * 値オブジェクトや色々な場所から参照されるエンティティのインスタンスを重複させずに
 * メモリを節約する方法考えて作ってはみたものの運用のコストでかくね？ってなったやーつ
 * 参照渡し自体はできてるけど見なくなったやつもそのまんまだしまとめて削除するのも忘れそう
 * とりあえず放置
 * ///これただのコレクションラッパークラスじゃね？
 */
public class TestProductHolder {
    private static Map<String, Product> s = new HashMap<>();

    private TestProductHolder() {}

    public static Product get(String key, String str){
        if (null != s && !s.isEmpty() && s.containsKey(key)) return s.get(key);

        s.put(key, new Product(new CompanyId(), new Model(str), new Name("name"), new Unit("unit"), new Price(0, "price")));
        return s.get(key);
    }
}
