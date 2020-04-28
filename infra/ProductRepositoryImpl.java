package com.example.zaiko.infra;

import com.example.zaiko.domain.outside.company.CompanyId;
import com.example.zaiko.domain.outside.product.Model;
import com.example.zaiko.domain.outside.product.Name;
import com.example.zaiko.domain.outside.product.Price;
import com.example.zaiko.domain.outside.product.Product;
import com.example.zaiko.domain.outside.product.ProductId;
import com.example.zaiko.domain.outside.product.ProductRepository;
import com.example.zaiko.domain.outside.product.Unit;

import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {

    ProductDao dao;

    public ProductRepositoryImpl(ProductDao dao) {
        this.dao = dao;
    }

    @Override
    public void save(Product product) {
        com.example.zaiko.infra.Product roomEntity = new com.example.zaiko.infra.Product(
                product.productId().id(),
                product.companyId().id(),
                product.model().model(),
                product.name().name(),
                product.price().value(),
                product.price().currencyUnit(),
                product.unit().name(),
                product.unmutatedVersion()
        );
        List<com.example.zaiko.infra.Product> productList = dao.findById(roomEntity._id);
        if (productList.isEmpty()) dao.insert(roomEntity);
        dao.update(roomEntity);
    }

    @Override
    public Product findOne(ProductId productId) {
        List<com.example.zaiko.infra.Product> productList = dao.findById(productId.id());
        if (1 < productList.size()) throw new IllegalStateException();
        if (productList.isEmpty()) return null;
        com.example.zaiko.infra.Product p = productList.get(0);
        return new Product(
                p.unmutated_version,
                new CompanyId(p.company_id),
                new ProductId(p._id),
                new Model(p.model),
                new Name(p.name),
                new Unit(p.unit),
                new Price(p.price_value, p.price_name));
    }
}
