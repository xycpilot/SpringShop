package com.xyc.shop.entity;

import java.io.Serializable;

/**
 * Created by xiangyuchao on 2020/3/13.
 * 问题分类表
 */
public class questionType implements Serializable {

    private static Integer id;

    private static Integer title;

    public static Integer getId() {
        return id;
    }

    public static void setId(Integer id) {
        questionType.id = id;
    }

    public static Integer getTitle() {
        return title;
    }

    public static void setTitle(Integer title) {
        questionType.title = title;
    }
}
