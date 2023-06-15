package com.yuyun.yuapiinterface;

import com.yuyun.yuapiclientsdk.client.YuApiClient;
import com.yuyun.yuapiclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class YuapiInterfaceApplicationTests {

    @Resource
    private YuApiClient yuApiClient;

    @Test
    void contextLoads() {
        User user = new User();
        user.setUsername("yuyun");
        String result1 = yuApiClient.getNameByGet("yuyun");
        String result2 = yuApiClient.getNameByPost("yuyun");
        String result3 = yuApiClient.getUsernameByPost(user);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }

}
