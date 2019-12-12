package com.gdut.imis.service;

import com.gdut.imis.pojo.Order;
import com.gdut.imis.pojo.OrderItem;

import java.util.List;

public interface OrderService {
    String waitPay = "waitPay";
    String waitDelivery = "waitDelivery";
    String waitConfirm = "waitConfirm";
    String waitReview = "waitReview";
    String finish = "finish";
    String delete = "delete";

    void add(Order c);

    void delete(int id);
    void update(Order c);
    Order get(int id);
    List list();
    float add(Order c,List<OrderItem> ois);
    List list(int uid, String excludedStatus);

}
