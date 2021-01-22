package com.qx.ipl.rent;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Description: SpringBoot启动类
 * @Author: liufei
 * @Date: 2021-1-21 0021
 * @param
 * @return: null
 **/
@SpringBootApplication
@MapperScan("com.qx.ipl.rent.dao")
@EnableSwagger2
public class RentApplication {

    public static void main(String[] args) {
        SpringApplication.run(RentApplication.class, args);
    }

}
