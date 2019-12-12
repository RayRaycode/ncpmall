package com.gdut.imis.service;

import com.gdut.imis.pojo.Product;
import com.gdut.imis.pojo.Category;
import java.util.List;

public interface ProductService {
    void add(Product p);
    void delete(int id);
    void update(Product p);
    Product get(int id);
    List list(int cid);
    void setFirstProductImage(Product p);
    void fill(List<Category> cs);

    void fill(Category c);

    void fillByRow(List<Category> cs);
    void setSaleAndReviewNumber(Product p);

    void setSaleAndReviewNumber(List<Product> ps);
    List<Product> search(String keyword);
}

