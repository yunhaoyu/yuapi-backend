package com.yuyun.yuapi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yuyun.yuapicommon.model.entity.UserInterfaceInfo;

/**
* @author yuyunhao
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2023-06-12 11:40:23
*/
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {
    void validUserInterfaceInfo(UserInterfaceInfo userinterfaceInfo, boolean add);


    /**
     * 调用接口统计
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);
}
