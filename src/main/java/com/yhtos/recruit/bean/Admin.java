package com.yhtos.recruit.bean;

import java.io.Serializable;
import java.util.Date;

/**
 *  类名：User
 *  功能：管理员信息表
 *  创建人：小圣
 *  创建时间：2020/7/14
 *  修改时间：
 * */
public class Admin implements Serializable {
    private Integer id;
    private String username;
    private String name;
    private String phone;
    private boolean status;     //状态 1开启，0关闭
    private Date creatTime;
    private Date modifyTime;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public boolean isStatus() {
        return status;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", status=" + status +
                ", creatTime=" + creatTime +
                ", modifyTime=" + modifyTime +
                '}';
    }

}
