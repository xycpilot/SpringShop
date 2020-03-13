package com.xyc.shop.entity;

import java.io.Serializable;

/**
 * Created by xiangyuchao on 2020/3/13.
 * 文章/公告
 */
public class article  implements Serializable {

    private  Integer id;

    private  String title;

    private  String aTypeId;//文章类型 1:普通文章 2：公告

    private  Integer authorId;//创建者ID-管理员ID

    private  String content;

    private  String description;//描述、备注

    private  String file_url;//图片地址

    private  Long createTime;//创建时间

    private  Long failureTime;//失效时间

    private  Long isFailure;//是否失效

    private  Long isShow;//是否展示

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

    public String getaTypeId() {
        return aTypeId;
    }

    public void setaTypeId(String aTypeId) {
        this.aTypeId = aTypeId;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFile_url() {
        return file_url;
    }

    public void setFile_url(String file_url) {
        this.file_url = file_url;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getFailureTime() {
        return failureTime;
    }

    public void setFailureTime(Long failureTime) {
        this.failureTime = failureTime;
    }

    public Long getIsFailure() {
        return isFailure;
    }

    public void setIsFailure(Long isFailure) {
        this.isFailure = isFailure;
    }

    public Long getIsShow() {
        return isShow;
    }

    public void setIsShow(Long isShow) {
        this.isShow = isShow;
    }
}
