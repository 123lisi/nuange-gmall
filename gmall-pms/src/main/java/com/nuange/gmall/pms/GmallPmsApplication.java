package com.nuange.gmall.pms;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import groovy.util.logging.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
  *1、整合dubbo
  * 2、配置mybatisPlus
  *
  *
  * Logstash整合
  * 到jar包
  * 导日志配置
 */
@EnableDubbo
@MapperScan(basePackages = "com.nuange.gmall.pms.mapper")
@SpringBootApplication
public class GmallPmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallPmsApplication.class, args);
    }

}
