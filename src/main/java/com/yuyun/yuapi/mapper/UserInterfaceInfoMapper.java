package com.yuyun.yuapi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yuyun.yuapicommon.model.entity.UserInterfaceInfo;

import java.util.List;

/**
* @author yuyunhao
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Mapper
* @createDate 2023-06-12 11:40:23
* @Entity com.yuyun.yuapi.model.entity.UserInterfaceInfo
*/
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {

    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);
}




