package com.yuyun.yuapi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yuyun.yuapi.common.ErrorCode;
import com.yuyun.yuapi.exception.BusinessException;
import com.yuyun.yuapi.mapper.UserMapper;
import com.yuyun.yuapicommon.model.entity.InterfaceInfo;
import com.yuyun.yuapicommon.model.entity.User;
import com.yuyun.yuapicommon.service.InnerUserService;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

@DubboService
public class InnerUserServiceImpl implements InnerUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User getInvokeUser(String accessKey, String secretKey) {
        if (StringUtils.isAnyBlank(accessKey, secretKey)){
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("accessKey",accessKey);
        queryWrapper.eq("secretKey",secretKey);
        return userMapper.selectOne(queryWrapper);
    }
}
