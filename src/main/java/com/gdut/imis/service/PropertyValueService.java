package com.gdut.imis.service;

import com.gdut.imis.pojo.Product;
import com.gdut.imis.pojo.PropertyValue;

import java.util.List;

public interface PropertyValueService {
    void init(Product p);
    void update(PropertyValue pv);

    PropertyValue get(int ptid, int pid);
    List<PropertyValue> list(int pid);
}
