package cn.dataorgregister.controller;

import cn.dataorgregister.entity.Result;
import cn.dataorgregister.entity.mongo.DataBase;
import cn.dataorgregister.entity.mongo.DataCenter;
import cn.dataorgregister.service.UserService;
import cn.dataorgregister.utils.GetDataFromRequest;
import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @author ZJ
 * @description
 * @Create by 2022/9/2 9:38
 */
@Api(value = "注册/登录")
@Controller
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

//    @ApiOperation("登录方法")
//    @PostMapping("/login")
//    public Result login(HttpServletRequest request,
//                        @RequestBody DataBase dataBase,
//                        @RequestBody DataCenter dataCenter) {
//        return userService.login(request,dataBase,dataCenter);
//    }
//
//    @ApiOperation("注册")
//    @PostMapping("/register")
//    public Result register(HttpServletRequest request,
//                           @RequestBody DataBase dataBase,
//                           @RequestBody DataCenter dataCenter) {
//        return userService.register(request,dataBase,dataCenter);
//    }


    @ApiOperation("数据库注册")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "DataBase", required = true, value = "数据库注册")
    })
    @PostMapping("/registerDatabase")
    public Result registerDb(@RequestBody DataBase dataBase) {
        return userService.registerDb(dataBase);
    }

    @ApiOperation("数据中心注册")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "DataCenter", required = true, value = "数据中心注册")
    })
    @PostMapping("/registerDataCenter")
    public Result registerDc(@RequestBody DataCenter dataCenter) {
        return userService.registerDc(dataCenter);
    }

//    @ApiOperation("登录")
//    @PostMapping("/register")
//    public Result login(HttpServletRequest request){
//        return userService.login();
//    }

}