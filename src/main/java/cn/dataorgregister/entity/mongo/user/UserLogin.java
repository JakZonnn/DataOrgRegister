package cn.dataorgregister.entity.mongo.user;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * @author ZJ
 * @description 用户登录记录
 * @Create by 2022/9/14 10:02
 */
@Data
@Document(collection = "userlogin")
public class UserLogin {
    @Id
    private String id;

    @ApiModelProperty(value = "邮箱",required = true)
    @Pattern(regexp = "[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+", message = "邮箱格式不正确")
    @NotBlank(message = "邮箱不能为空")
    private String email;

    @ApiModelProperty(value = "用户密码",required = true)
    @NotBlank(message = "密码不能为空")
    private String password;
}
