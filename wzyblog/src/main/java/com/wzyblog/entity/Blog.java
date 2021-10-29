package com.wzyblog.entity;/*
 *@Auther: wzy
 *@Date:2021/10/29 -10-29
 *@Descreption: com.wzyblog.entity
 *@Version: 1.0
 */

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity(name = "t_blog")
public class Blog {

    @Id
    @GeneratedValue
    private Long id;
//    文章的标识id
    private String title;
//    文章标题
    private String content;
//    文章内容
    private String firstPicture;
//    文章图片
    private String flag;
//    文章标记
    private Integer views;
//    浏览次数
    private boolean appreciation;
//    开启赞赏功能
    private boolean shareStatement;
//    允许转载
    private boolean commentOrNot;
//    允许评论
    private boolean published;
//    是否发表
    private boolean recommend;
//    是否推荐

    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;
//    创建时间

    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTime;
//    更新时间

    @ManyToOne
    private Type type;
//    一个type可收录多篇blog

    @ManyToMany(cascade = CascadeType.PERSIST)
    private List<Tag> tags=new ArrayList<>();
//    一篇blog对应多个tags，同时一个tag也可以标记多个blogs

    @OneToMany(mappedBy = "blog")
    private List<Comment> comments=new ArrayList<>();

    @ManyToOne
    private User user;
//    一个作者对应多篇blogs

    public Blog() {
    }


    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFirstPicture() {
        return firstPicture;
    }

    public void setFirstPicture(String firstPicture) {
        this.firstPicture = firstPicture;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public boolean isAppreciation() {
        return appreciation;
    }

    public void setAppreciation(boolean appreciation) {
        this.appreciation = appreciation;
    }

    public boolean isShareStatement() {
        return shareStatement;
    }

    public void setShareStatement(boolean shareStatement) {
        this.shareStatement = shareStatement;
    }

    public boolean isCommentOrNot() {
        return commentOrNot;
    }

    public void setCommentOrNot(boolean commentOrNot) {
        this.commentOrNot = commentOrNot;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public boolean isRecommend() {
        return recommend;
    }

    public void setRecommend(boolean recommend) {
        this.recommend = recommend;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
