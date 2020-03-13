package com.xyc.shop.entity;

import java.io.Serializable;

/**
 * Created by xiangyuchao on 2020/3/13.
 * 关键词表
 */
public class keyword  implements Serializable {

    private  Integer id;

    private  String name;

    private  Integer keywordTypeId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getKeywordTypeId() {
        return keywordTypeId;
    }

    public void setKeywordTypeId(Integer keywordTypeId) {
        this.keywordTypeId = keywordTypeId;
    }
}
