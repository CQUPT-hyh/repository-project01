package com.itheima.ssm.service;

import com.itheima.ssm.domain.Orders;
import jdk.nashorn.internal.runtime.ECMAException;

import java.util.List;

public interface IOrdersService {
    //查询所有订单
    List<Orders> findAll(int page,int size) throws Exception;
    //根据ID查询订单
    Orders findById(String ordersId) throws Exception;
}
