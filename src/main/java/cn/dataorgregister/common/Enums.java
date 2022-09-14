package cn.dataorgregister.common;

import lombok.Data;
import lombok.Getter;


public enum Enums {
    //用户枚举类
    USER401001(401001, "Current user doesn't exist."),
    USER401(401, "You have not logged in yet. Please log in!."),

    NORMALCODE(200, "正常返回数据"),
    PARAM_EXCEP(99100, "参数异常"),
    ILLEGALACCESS_EXCEP(99200, "访问受限"),
    UNDECLAREDTHROWABLE_EXCEP(99300, "没有访问权限"),
    BUSINESS_EXCEP(99410, "业务异常"),
    SERVER_ERROR(99500, "异常"),
    ;

    private Integer code;
    private String msg;

    Enums(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String msg() {
        return msg;
    }

    public Integer code() {
        return code;
    }

}
