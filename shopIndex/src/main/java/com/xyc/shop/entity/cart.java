package com.xyc.shop.entity;

import java.io.Serializable;

/**
 * Created by xiangyuchao on 2020/3/13.
 * 购物车表
 */
public class cart implements Serializable {

    private Integer id;

    private Integer userId;

    private String goodsSn;//商品签名，用于放到缓存里面的时候可以快速查找到该购物车里的内容

    private String goodsId;

    private Integer goodsAttrId;//商品属性ID对应goodsAttr表里面的attrId

    private Integer goodsNum;//商品数量

    private Long addTime;//添加到购物车时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getGoodsSn() {
        return goodsSn;
    }

    public void setGoodsSn(String goodsSn) {
        this.goodsSn = goodsSn;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getGoodsAttrId() {
        return goodsAttrId;
    }

    public void setGoodsAttrId(Integer goodsAttrId) {
        this.goodsAttrId = goodsAttrId;
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    public Long getAddTime() {
        return addTime;
    }

    public void setAddTime(Long addTime) {
        this.addTime = addTime;
    }
}
