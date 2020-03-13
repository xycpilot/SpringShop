package com.xyc.shop.entity;

import java.io.Serializable;

/**
 * Created by xiangyuchao on 2020/3/12.
 * 商品评价表
 */
public class goodsEvaluation  implements Serializable {

    private static Integer id;

    private static Integer goodsId;

    private static Integer evaluationTypeId;//针对什么类型进行评价 1:手感 2：外观 3：屏幕 4：拍照 5：性能 6：其他(包括)

    private static String content;

    private static String picture;

    private static String score;//评分 1：商品分数(满分5) 2：服务态度(满分5) 3：物流(满分5) 全5分属于好评 3-4分属于一般/中等 3分以下属于差评

    private static Integer userId;//评论人ID

    private static Long creatTime;//评价时间

    private static Boolean isDeleted;//是否已删除

    public static Integer getId() {
        return id;
    }

    public static void setId(Integer id) {
        goodsEvaluation.id = id;
    }

    public static Integer getGoodsId() {
        return goodsId;
    }

    public static void setGoodsId(Integer goodsId) {
        goodsEvaluation.goodsId = goodsId;
    }

    public static Integer getEvaluationTypeId() {
        return evaluationTypeId;
    }

    public static void setEvaluationTypeId(Integer evaluationTypeId) {
        goodsEvaluation.evaluationTypeId = evaluationTypeId;
    }

    public static String getContent() {
        return content;
    }

    public static void setContent(String content) {
        goodsEvaluation.content = content;
    }

    public static String getPicture() {
        return picture;
    }

    public static void setPicture(String picture) {
        goodsEvaluation.picture = picture;
    }

    public static String getScore() {
        return score;
    }

    public static void setScore(String score) {
        goodsEvaluation.score = score;
    }

    public static Integer getUserId() {
        return userId;
    }

    public static void setUserId(Integer userId) {
        goodsEvaluation.userId = userId;
    }

    public static Long getCreatTime() {
        return creatTime;
    }

    public static void setCreatTime(Long creatTime) {
        goodsEvaluation.creatTime = creatTime;
    }

    public static Boolean getIsDeleted() {
        return isDeleted;
    }

    public static void setIsDeleted(Boolean isDeleted) {
        goodsEvaluation.isDeleted = isDeleted;
    }
}
