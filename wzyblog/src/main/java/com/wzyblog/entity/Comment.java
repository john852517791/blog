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

@Entity(name = "t_comment")
public class Comment {

    @Id
    @GeneratedValue
    private Long id;

    private String nickName;
//    昵称
    private String email;
//    邮箱
    private String content;
//    评论内容
    private String avatar;
//    评论者头像
    @Temporal(TemporalType.TIMESTAMP)
    private Date creatTime;
//    评论时间

    @ManyToOne
    private Blog blog;
//    一篇blog可有多个评论

//    评论中分楼层，被评论的评论为parentcomment
//    一条parentcomment可以被多人回复，即可对应多个replycomment
    @OneToMany(mappedBy = "parentComment")
    private List<Comment> replyComments=new ArrayList<>();
    @ManyToOne
    private Comment parentComment;

    public Comment() {
    }


    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    public List<Comment> getReplyComments() {
        return replyComments;
    }

    public void setReplyComments(List<Comment> replyComments) {
        this.replyComments = replyComments;
    }

    public Comment getParentComment() {
        return parentComment;
    }

    public void setParentComment(Comment parentComment) {
        this.parentComment = parentComment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }
}
