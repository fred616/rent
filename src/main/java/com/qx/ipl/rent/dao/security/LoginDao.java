package com.qx.ipl.rent.dao.security;

import com.alibaba.fastjson.JSONObject;
import org.apache.ibatis.annotations.Param;

/**
 * @Description: 登录相关dao
 * @Author liufei
 * @Date: 2021-1-21 0021
 * @Version 1.0
 */
public interface LoginDao {
	/**
	 * 根据用户名和密码查询对应的用户
	 */
	JSONObject getUser(@Param("username") String username, @Param("password") String password);
}
