package com.hc.mall.service.impl;


import com.hc.mall.common.service.HelloService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * Created by hc on 2017/3/7.
 */
@DubboService
public class DubboHelloServiceImpl implements HelloService {

    @Override
    public String hello(String name) {
        return "Dubbo Hello From World! " + name;
    }
}

