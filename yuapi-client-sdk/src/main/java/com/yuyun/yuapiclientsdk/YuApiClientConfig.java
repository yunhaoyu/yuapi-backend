package com.yuyun.yuapiclientsdk;


import com.yuyun.yuapiclientsdk.client.YuApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("yuapi.client")
@ComponentScan
@Data
public class YuApiClientConfig {

    private String accessKey;

    private String secretKey;

    @Bean
    public YuApiClient yuApiClient(){
        return new YuApiClient(accessKey, secretKey);
    }
}
