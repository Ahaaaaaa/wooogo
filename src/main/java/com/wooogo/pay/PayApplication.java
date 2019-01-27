package com.wooogo.pay;
import com.wooogo.pay.controller.OrderController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
// 定义 JPA 接口扫描包路径
@EnableJpaRepositories(basePackages = "com.wooogo.pay.dao")
// 定义实体 Bean 扫描包路径
@EntityScan(basePackages = "com.wooogo.pay.pojo")
@EnableJpaAuditing
public class PayApplication {
    public static void main(String[] args){
        SpringApplication.run(PayApplication.class,args);
    }
}

