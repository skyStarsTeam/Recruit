package com.yhtos.recruit.bean;

import java.io.Serializable;
import java.util.Date;

/**
 *  类名：User
 *  功能：用户登录信息表
 *  创建人：小圣
 *  创建时间：2020/7/14
 *  修改时间：
 * */

public class User{
    private Integer id; //用户ID
    private String username;   //用户名
    private String password;    //密码
    private Integer role;       //用户角色，1普通用户，2管理员，3超级管理员
    private Date createTime;
    private Date modifyTime;

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Integer getRole() {
        return role;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                ", createTime=" + createTime +
                ", modifyTime=" + modifyTime +
                '}';
    }
}
