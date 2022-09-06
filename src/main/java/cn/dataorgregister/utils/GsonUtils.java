package cn.dataorgregister.utils;



import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.util.Map;

/**
 * @author ZJ
 * @description
 * @Create by 2022/9/6 9:31
 */
public class GsonUtils {
    /**
     * @Description: json字符串转成map的
     * @Param: [gsonString]
     * @return: java.util.Map<java.lang.String,T>
     * @Author: 韵子豪
     * @Date: 2022/3/7  10:51
     */

    private static Gson gson = new GsonBuilder().create();
    public static <T> Map<String, T> gsonToMaps(String gsonString) {
        Map<String, T> map = null;
        if (gson != null) {
            map = gson.fromJson(gsonString, new TypeToken<Map<String, T>>() {
            }.getType());
        }
        return map;
    }
}
