package com.xyc.shop.entity;

import java.io.Serializable;

/**
 * Created by xiangyuchao on 2020/3/12.
 */
public class orderExchage implements Serializable {

    private  Integer id;

    private  String orderId;

    private  String logisticsId;//物流订单ID

    private  Integer userId;

    private  Integer deliveryId;//收货地址ID

    private  String goodsId;//同一个订单多个物品

    private  String goodsAttributeId;//属性串

    private  String color;//购买颜色

    private  Integer status;//状态 0:订单失效 1：订单创建成功 2：支付中 3：支付完成 4：订单已收货确认

    private  Long createTime;//订单创建时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getLogisticsId() {
        return logisticsId;
    }

    public void setLogisticsId(String logisticsId) {
        this.logisticsId = logisticsId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(Integer deliveryId) {
        this.deliveryId = deliveryId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsAttributeId() {
        return goodsAttributeId;
    }

    public void setGoodsAttributeId(String goodsAttributeId) {
        this.goodsAttributeId = goodsAttributeId;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}
