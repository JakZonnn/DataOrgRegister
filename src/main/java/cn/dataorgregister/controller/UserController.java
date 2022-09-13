package cn.dataorgregister.controller;

import cn.dataorgregister.entity.Result;
//import cn.dataorgregister.entity.mongo.dictionarytable.DataTypeEnum;
import cn.dataorgregister.entity.mongo.orgregister.DataBase;
import cn.dataorgregister.entity.mongo.orgregister.DataCenter;
import cn.dataorgregister.entity.mongo.user.User;
import cn.dataorgregister.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;

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
    @ApiOperation("用户注册")
    @PostMapping("/register")
    public Result register(@Valid User user){
        Result register = userService.register(user);
        return register;
    }

    @ApiOperation("用户注册发送验证码")
    @PostMapping("/sendcode")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "email",value = "用户邮箱",paramType = "String",required = true)
    })
    public Result sendCode(@RequestParam("eamil") String email){
        return userService.sendCode(email);
    }



    @ApiOperation("数据库注册")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "DataBase", required = true, value = "数据库注册")
    })
    @PostMapping("/registerDatabase")
    public Result registerDb(@RequestBody DataBase dataBase, MultipartFile file) {
        return userService.registerDb(dataBase,file);
    }

    @ApiOperation("数据中心注册")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "DataCenter", required = true, value = "数据中心注册")
    })
    @PostMapping("/registerDataCenter")
    public Result registerDc(@RequestBody DataCenter dataCenter, MultipartFile file) {
        return userService.registerDc(dataCenter,file);
    }

    // TODO: 2022/9/9 需考虑
    @ApiOperation("查看学科分类")
    @GetMapping("/getSubject")
    public Result getSubject(){
        return userService.getSubject();
    }

    // TODO: 2022/9/9 需考虑
    @ApiOperation("查看地点")
    @GetMapping("/getLocation")
    public Result getLocation(){
        return userService.getlocation();
    }


    @ApiOperation("查看Apis类型")
    @GetMapping("/getApisType")
    public Result getApisType(){
        return userService.getApisType();
    }

    @ApiOperation("查看数据库访问权限")
    @GetMapping("/getAuthority")
    public Result getAuthority(){
        return userService.getAuthority();
    }

    @ApiOperation("查看认证与收录")
    @GetMapping("/getCertification")
    public Result getCertification(){
        return userService.getCertification();
    }

    @ApiOperation("查看数据中心类型")
    @GetMapping("/getDatacenterType")
    public Result getDatacenterType(){
        return userService.getDatacenterType();
    }

    @ApiOperation("查看数据许可证")
    @GetMapping("/getDataLicense")
    public Result getDataLicense(){
        return userService.getDataLicense();
    }

    @ApiOperation("查看数据类型")
    @GetMapping("/getDataTypes")
    public Result getDataTypes(){
        return userService.getDataTypes();
    }

    @ApiOperation("查看数据库许可证书")
    @GetMapping("/getLicenseDb")
    public Result getLicenseDb(){
        return userService.getLicenseDb();
    }

    @ApiOperation("查看访问限制类型")
    @GetMapping("/getLimitType")
    public Result getLimitType(){
        return userService.getLimitType();
    }

    @ApiOperation("查看元数据标准名称")
    @GetMapping("/getMetaStandardName")
    public Result getMetaStandardName(){
        return userService.getMetaStandardName();
    }

    @ApiOperation("查看网络安全等保级别")
    @GetMapping("/getSecurityLevel")
    public Result getSecurityLevel(){
        return userService.getSecurityLevel();
    }

    @ApiOperation("查看服务类型")
    @GetMapping("/getServiceType")
    public Result getServiceType(){
        return userService.getServiceType();
    }

    @ApiOperation("查看唯一标识")
    @GetMapping("/getUniIdentifier")
    public Result getUniIdentifier(){
        return userService.getUniIdentifier();
    }

    @ApiOperation("查看支持的唯一标识符系统")
    @GetMapping("/getUniIdentifierSystem")
    public Result getUniIdentifierSystem(){
        return userService.getUniIdentifierSystem();
    }


//    @RequestMapping("/writeDataType")
//    public void writeDataType(UniIdentifierSystem uniIdentifierSystem){
//        userService.writeDataType(uniIdentifierSystem);


//    @GetMapping("/datatype")
//    public Result datatype(){
////        EnumSet<DataTypeEnum> dataTypeEnums = EnumSet.allOf(DataTypeEnum.class);
//        ArrayList<DataTypeEnum> dataTypeEnumList = new ArrayList<>(Arrays.asList(DataTypeEnum.values()));
//        ArrayList data = new ArrayList<>();
//        for (DataTypeEnum dataTypeEnum: dataTypeEnumList) {
//            Integer code = dataTypeEnum.code();
//            String msg = dataTypeEnum.msg();
//            HashMap map = new HashMap();
//            map.put();
//        }
//        return
//    }

//    @ApiOperation("登录")
//    @PostMapping("/register")
//    public Result login(HttpServletRequest request){
//        return userService.login();
//    }

}