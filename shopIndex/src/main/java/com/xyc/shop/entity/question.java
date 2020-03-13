package com.xyc.shop.entity;

import java.io.Serializable;

/**
 * Created by xiangyuchao on 2020/3/13.
 * 常见问题表
 */
public class question  implements Serializable {

    private  Integer id;

    private  String title;//标题

    private  String question;//问题

    private  String answer;//问题回答/答案

    private  Integer typeId;//问题分类Id

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }
}
