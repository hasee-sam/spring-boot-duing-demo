package com.duing;

import com.duing.config.FoodConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @EnableConfigurationProperties({FoodConfig.class})
 * 告诉主程序入口类  要自动引入配置文件
 * 配置文件对应的类作为它的参数
 */
@SpringBootApplication
@EnableConfigurationProperties({FoodConfig.class})
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class,args);
    }
}
