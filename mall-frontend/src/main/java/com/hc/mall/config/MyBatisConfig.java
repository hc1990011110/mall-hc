package com.hc.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis相关配置
 * Created by hc on 2019/4/8.
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.hc.mall.mapper","com.hc.mall.dao"})
public class MyBatisConfig {
}
