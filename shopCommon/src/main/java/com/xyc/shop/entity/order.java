package com.xyc.shop.entity;

import java.io.Serializable;

/**
 * Created by xiangyuchao on 2020/3/12.
 * 订单表
 */
public class order  implements Serializable {

    private  Integer id;

    private  String orderId;

    private  String logisticsId;//物流订单ID

    private  Integer userId;

    private  Integer deliveryId;//收货地址ID

    private  String goodsId;//同一个订单多个物品

    private  String goodsAttributeId;//属性串

    private  String color;//购买颜色

    private String insuranceId;//保险ID 多个保险内容用逗号分隔

    private  Double amountPayAble;//应付金额

    private  Double amountRealPay;//实付金额

    private  Long createTime;//订单创建时间

    private  Long payTime;//支付时间

    private  Integer cancelExchange;//退换货 0:未退换 1:退货 2:换货

    private  Integer exchangeId;//退换ID

    private  Integer status;//状态 0:订单失效 1：订单创建成功 2：支付中 3：支付完成 4：订单已收货确认

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

    public String getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(String insuranceId) {
        this.insuranceId = insuranceId;
    }

    public Double getAmountPayAble() {
        return amountPayAble;
    }

    public void setAmountPayAble(Double amountPayAble) {
        this.amountPayAble = amountPayAble;
    }

    public Double getAmountRealPay() {
        return amountRealPay;
    }

    public void setAmountRealPay(Double amountRealPay) {
        this.amountRealPay = amountRealPay;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getPayTime() {
        return payTime;
    }

    public void setPayTime(Long payTime) {
        this.payTime = payTime;
    }

    public Integer getCancelExchange() {
        return cancelExchange;
    }

    public void setCancelExchange(Integer cancelExchange) {
        this.cancelExchange = cancelExchange;
    }

    public Integer getExchangeId() {
        return exchangeId;
    }

    public void setExchangeId(Integer exchangeId) {
        this.exchangeId = exchangeId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
