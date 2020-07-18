package com.yhtos.recruit.service;

import com.yhtos.recruit.bean.User;

/**
 * Title: IUserService
 * 功能：用户账号service接口
 * author: sky
 * Creation time: 2020/7/17 17:30
 * Modification time：
 * version： V1.0
 */
public interface IUserService {

    /**
     * 保存
     * @param user
     * @return
     */
    boolean sava(User user);
}
