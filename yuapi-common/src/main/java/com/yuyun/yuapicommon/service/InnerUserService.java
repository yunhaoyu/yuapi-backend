package com.yuyun.yuapicommon.service;

import com.yuyun.yuapicommon.model.entity.User;


/**
 * 用户服务
 *
 * @author yuyun
 */
public interface InnerUserService {

    /**
     * 数据库中查是否已分配给用户秘钥（accessKey）
     * @param accessKey
     * @return
     */
    User getInvokeUser(String accessKey,String secretKey);
}
