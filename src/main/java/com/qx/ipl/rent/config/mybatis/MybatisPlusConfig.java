package com.qx.ipl.rent.config.mybatis;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:  MybatisPlus配置类
 * @Author liufei
 * @Date: 2021-1-21 0021$ 20:42$
 * @Version 1.0
 */
@Configuration
public class MybatisPlusConfig {
    /**
     * mybatis-plus SQL执行效率插件【生产环境可以关闭】
     */
    //@Bean
    //public PerformanceInterceptor performanceInterceptor() {
    //    return new PerformanceInterceptor();
    //}
    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

}
