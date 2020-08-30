package com.hkl.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Description:
 * @Author: HuangKL
 * @Date: 2020/06/09 21:11
 */
@Configuration
public class ApplicationContextConfig {
    //applicationContext.xml   <bean id=""  class="" />
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
