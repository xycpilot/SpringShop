package com.xyc.shop.entity;

import java.io.Serializable;

/**
 * Created by xiangyuchao on 2020/3/13.
 */
public class goodsAttr implements Serializable {

    private Integer attrId;

    private Integer goodsId;

    private Integer colorId;

    private Integer versionId;

    private Double attrPrice;

    private String colorPicture;//此颜色图片路径

    public Integer getAttrId() {
        return attrId;
    }

    public void setAttrId(Integer attrId) {
        this.attrId = attrId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getColorId() {
        return colorId;
    }

    public void setColorId(Integer colorId) {
        this.colorId = colorId;
    }

    public Integer getVersionId() {
        return versionId;
    }

    public void setVersionId(Integer versionId) {
        this.versionId = versionId;
    }

    public Double getAttrPrice() {
        return attrPrice;
    }

    public void setAttrPrice(Double attrPrice) {
        this.attrPrice = attrPrice;
    }

    public String getColorPicture() {
        return colorPicture;
    }

    public void setColorPicture(String colorPicture) {
        this.colorPicture = colorPicture;
    }
}
