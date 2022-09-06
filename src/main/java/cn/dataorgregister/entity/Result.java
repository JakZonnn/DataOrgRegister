package cn.dataorgregister.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@Data
public class Result<T> {

    private int code;// 编码

    private String message;// 返回信息

    private T data;


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
    public Result data(T data) {
        this.setData(data);
        return this;
    }

}
