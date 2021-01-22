package com.qx.ipl.rent.config.mybatis;

/**
 * @Description: 字段策略枚举类
 * @Author liufei
 * @Date: 2021-1-21 0021$ 20:45$
 * @Version 1.0
 */
public enum FieldStrategy {
    /**
     * 忽略判断
     */
    IGNORED,

    /**
     * 非NULL判断
     */
    NOT_NULL,

    /**
     * 非空判断
     */
    NOT_EMPTY
}
