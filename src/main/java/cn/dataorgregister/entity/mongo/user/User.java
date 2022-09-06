package cn.dataorgregister.entity.mongo.user;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

/**
 * @author ZJ
 * @description 用户实体类
 * @Create by 2022/9/9 15:48
 */

@Data
@Document(collection = "用户")
public class User implements Serializable {
    @Id
    private String id;

    private String userId;

    @ApiModelProperty(value = "真实姓名", required = true)
    @NotBlank(message = "真实姓名不能为空")
    private String userName;

    @ApiModelProperty(value = "单位", required = true)
    @NotBlank(message = "单位不能为空")
    private String org;

    @ApiModelProperty(value = "邮箱", required = true)
    @Pattern(regexp = "[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+", message = "邮箱格式不正确")
    @NotBlank(message = "邮箱不能为空")
    private String email;

    @ApiModelProperty(value = "密码", required = true)
    @NotBlank(message = "密码不能为空")
    private String password;

    @ApiModelProperty(value = "确认密码", required = true)
    @NotBlank(message = "确认密码不能为空")
    private String repeatPassword;




}
