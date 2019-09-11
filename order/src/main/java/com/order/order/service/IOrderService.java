package com.order.order.service;

import com.order.order.entity.Order;

import java.util.List;

/**
 * ******************************************************************************************************************
 * CreateDate             Author             TaskManage             Descriptions
 * 2019-08-28              @author LP           后台管理模块设计           积分controller
 * ******************************************************************************************************************
 */
public interface IOrderService {
    List<Order> getOrderList();

    Integer saveOrder(Order order);

    Integer updateOrder(Order order);

}