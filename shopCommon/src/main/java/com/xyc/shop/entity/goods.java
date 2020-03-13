package com.xyc.shop.entity;

import java.io.Serializable;

/**
 * Created by xiangyuchao on 2020/3/12.
 * 商品表
 */
public class goods  implements Serializable {

    private  String id;

    private  String goodsName;

    private  String goodsTile;

    private  String color;//颜色 因为做的是手机商城 所以这里多了一个颜色 如果是其他商品的话 此字段可以不用设置

    private  Integer brandId;//商品品牌

    private  Integer goodsType;//商品类型

    private  String version;//版本或者型号

    private  Boolean isDiscount;//是否打折

    private  Float discountPer;//打几折

    private  Integer goodsNum;//商品数量

    private  Integer saleNum;//已销售数量

    private  Integer logisticsNum;//库存数量

    private  Integer cancelNum;//退货数量

    private  String describe;//商品文字描述

    private  String attribute;//商品属性 {"cpu":"***","memory":"***"....}

    private  String salesServiceId;//售后服务ID，多服务id以逗号分隔

    private  String thumb;

    private  String picture;

    private  Integer evaluationId;//商品评价内容ID

    private  Boolean isShelves;//是否下架

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsTile() {
        return goodsTile;
    }

    public void setGoodsTile(String goodsTile) {
        this.goodsTile = goodsTile;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(Integer goodsType) {
        this.goodsType = goodsType;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Boolean getDiscount() {
        return isDiscount;
    }

    public void setDiscount(Boolean discount) {
        isDiscount = discount;
    }

    public Float getDiscountPer() {
        return discountPer;
    }

    public void setDiscountPer(Float discountPer) {
        this.discountPer = discountPer;
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    public Integer getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(Integer saleNum) {
        this.saleNum = saleNum;
    }

    public Integer getLogisticsNum() {
        return logisticsNum;
    }

    public void setLogisticsNum(Integer logisticsNum) {
        this.logisticsNum = logisticsNum;
    }

    public Integer getCancelNum() {
        return cancelNum;
    }

    public void setCancelNum(Integer cancelNum) {
        this.cancelNum = cancelNum;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getSalesServiceId() {
        return salesServiceId;
    }

    public void setSalesServiceId(String salesServiceId) {
        this.salesServiceId = salesServiceId;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Integer getEvaluationId() {
        return evaluationId;
    }

    public void setEvaluationId(Integer evaluationId) {
        this.evaluationId = evaluationId;
    }

    public Boolean getShelves() {
        return isShelves;
    }

    public void setShelves(Boolean shelves) {
        isShelves = shelves;
    }
}
