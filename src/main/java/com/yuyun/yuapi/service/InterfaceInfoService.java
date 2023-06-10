package com.yuyun.yuapi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yuyun.yuapi.model.entity.InterfaceInfo;

/**
* @author yuyun
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-05-28 19:01:41
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
