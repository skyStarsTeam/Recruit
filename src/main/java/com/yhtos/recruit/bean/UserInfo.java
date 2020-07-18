package com.yhtos.recruit.bean;

import java.io.Serializable;
import java.util.Date;
/**
 *  类名：User
 *  功能：用户信息表
 *  创建人：小圣
 *  创建时间：2020/7/14
 *  修改时间：
 * */
public class UserInfo implements Serializable {
    private Integer id;
    private String username;
    private String studentId;
    private String name;
    private boolean sex;        //性别 1男 0女
    private String birthday;
    private String nation;
    private String political;
    private String qq;
    private String interest;
    private String reason;
    private String evaluate;    //审核评语
    private boolean status;     //审核状态 0未审核 1审核成功 2审核不成功
    private Date createTime;
    private Date modifyTime;
    private String wechat;
    private String phone;
    private String avatar;      //照片路径
    private String introduce;
    private String special;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public void setPolitical(String political) {
        this.political = political;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setEvaluate(String evaluate) {
        this.evaluate = evaluate;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public boolean isSex() {
        return sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getNation() {
        return nation;
    }

    public String getPolitical() {
        return political;
    }

    public String getQq() {
        return qq;
    }

    public String getWechat() {
        return wechat;
    }

    public String getPhone() {
        return phone;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getIntroduce() {
        return introduce;
    }

    public String getSpecial() {
        return special;
    }

    public String getInterest() {
        return interest;
    }

    public String getReason() {
        return reason;
    }

    public String getEvaluate() {
        return evaluate;
    }

    public boolean isStatus() {
        return status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", studentId='" + studentId + '\'' +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", birthday='" + birthday + '\'' +
                ", nation='" + nation + '\'' +
                ", political='" + political + '\'' +
                ", qq='" + qq + '\'' +
                ", wechat='" + wechat + '\'' +
                ", phone='" + phone + '\'' +
                ", avatar='" + avatar + '\'' +
                ", introduce='" + introduce + '\'' +
                ", special='" + special + '\'' +
                ", interest='" + interest + '\'' +
                ", reason='" + reason + '\'' +
                ", evaluate='" + evaluate + '\'' +
                ", status=" + status +
                ", createTime=" + createTime +
                ", modifyTime=" + modifyTime +
                '}';
    }

}
