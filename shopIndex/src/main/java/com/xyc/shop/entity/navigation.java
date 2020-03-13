package com.xyc.shop.entity;

import java.io.Serializable;

/**
 * Created by xiangyuchao on 2020/3/13.
 */
public class navigation  implements Serializable {

    private  Integer id;

    private  Integer parentId;

    private  String name;//导航名称

    private  String isShow;//是否展示

    private  String url;//链接地址

    private  String type;//导航类型

    private  Integer openNew;//是否打开新窗口

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsShow() {
        return isShow;
    }

    public void setIsShow(String isShow) {
        this.isShow = isShow;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getOpenNew() {
        return openNew;
    }

    public void setOpenNew(Integer openNew) {
        this.openNew = openNew;
    }
}
