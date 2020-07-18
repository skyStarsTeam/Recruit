package com.yhtos.recruit.service.impl;

import com.yhtos.recruit.bean.User;
import com.yhtos.recruit.service.IUserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Title: UserServicImpl.java
 * 功能：用户账号service实现
 * author: sky
 * Creation time: 2020/7/17 17:30
 * Modification time：
 * version： V1.0
 */
public class UserServicImpl implements IUserService {

    Logger logger = LogManager.getLogger(UserServicImpl.class);

    @Override
    public boolean sava(User user) {
        logger.info("*****保存信息service");
        return false;
    }
}
