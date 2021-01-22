package com.qx.ipl.rent.controller.security;

import com.alibaba.fastjson.JSONObject;
import com.qx.ipl.rent.service.security.UserService;
import com.qx.ipl.rent.utils.constants.CommonUtil;
import io.swagger.annotations.Api;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @Description: SwagerTestController$
 * @Author liufei
 * @Date: 2021-1-21 0021$ 21:00$
 * @Version 1.0
 */
@RestController
@RequestMapping("/swagerr")
@Api(description = "管理员用户模块业务接口",tags = "管理员用户模块接口")
public class SwagerTestController {

    @Resource
    private UserService userService;

    /**
     * 查询用户列表
     */
    @RequiresPermissions("user:list")
    @GetMapping("/list")
    public JSONObject listUser(HttpServletRequest request) {
        return userService.listUser(CommonUtil.request2Json(request));
    }

}
