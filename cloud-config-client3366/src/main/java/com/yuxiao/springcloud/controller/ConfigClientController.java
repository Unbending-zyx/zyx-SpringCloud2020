package com.yuxiao.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigClientController {


    @Value("${my.addr}")
    private String configInfo;
    @Value("${server.port}")
    private String serverPort;


    @GetMapping(value = "/configInfo")
    public String getConfigInfo(){
        return "获取配置文件信息："+configInfo+"  serverPort:"+serverPort;
    }

}
