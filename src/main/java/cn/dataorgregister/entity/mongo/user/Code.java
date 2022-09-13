package cn.dataorgregister.entity.mongo.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: ZJ
 * @create: 2022-09-12 22:26
 * @Description: uservo
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Code implements Serializable {
    @Id
    private String id;
    private String email;
    private String emailCode;

    @DateTimeFormat(pattern = "yyyy-MM-dd HHmmss")
    private Date createTime;
}
