package com.yuyun.yuapi.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 通用请求（接口发布与下线）
 *
 * @author yuyun
 * 
 */
@Data
public class IdRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}