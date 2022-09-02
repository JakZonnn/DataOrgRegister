package cn.dataorgregister.controller;

import cn.dataorgregister.entity.mongo.DataBase;
import cn.dataorgregister.service.UserService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping("/writeData")
    public void writeData(DataBase registerDb){
        userService.writeData(registerDb);

    }



}
