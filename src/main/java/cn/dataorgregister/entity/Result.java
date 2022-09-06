package cn.dataorgregister.entity;

import lombok.Data;

import java.util.Map;

@Data
public class Result {

    private int code;// 编码

    private String message;// 返回信息

    private Map<String, Object> data;

    public Result() {
    }

    /**
     * Instantiates a new wrapper.
     *
     * @param code    the code
     * @param message the message
     * @param data  the data
     */
    Result(int code, String message, Map data) {
        super();
        this.code(code).message(message).data(data);
    }



    /**
     * Instantiates a new wrapper.
     *
     * @param code    the code
     * @param message the message
     */
    Result(int code, String message) {
        this(code, message, null);
    }


    /**
     * Sets the 编号 , 返回自身的引用.
     *
     */
    private Result code(int code) {
        this.setCode(code);
        return this;
    }

    /**
     * Sets the 信息 , 返回自身的引用.
     *
     */
    private Result message(String message) {
        this.setMessage(message);
        return this;
    }

    /**
     * Sets the 结果数据 , 返回自身的引用.
     *
     */
    public Result data(Map data) {
        this.setData(data);
        return this;
    }

}
