package cn.dataorgregister.service;

import cn.dataorgregister.entity.Result;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import java.util.Map;

/**
 * sciencedb 公共服务接口
 * 
 */
public interface CommonService {

    /**
     * 服务调用成功后返回数据
     *
     * @return Result
     */
    default <T> Result<T> success(T data) {
        Result Result = new Result();
        Result.setCode(HttpStatus.OK.value());
        Result.setMessage("success");
        Result.setData(data);
        return Result;
    }

    /**
     * 服务调用成功默认返回结果
     *
     * @return Result
     */
    default Result success() {
        Result Result = new Result();
        Result.setCode(HttpStatus.OK.value());
        Result.setMessage("success");
        return Result;
    }

    /**
     * 服务调用成功默认返回自定义的message
     * @return Result
     */
    default Result success(String message) {
        Result Result = new Result();
        Result.setCode(HttpStatus.OK.value());
        Result.setMessage(message);
        return Result;
    }

    /**
     * 服务调用失败默认返回结果
     *
     * @return Result
     */
    default Result fail() {
        Result Result = new Result();
        Result.setCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
        Result.setMessage("error");
        return Result;
    }

    /**
     * 服务调用失败默认返回401
     *
     * @return Result
     */
    default <T>Result<T> fail(String message,T data){
        Result result = new Result();
        result.setCode(HttpStatus.UNAUTHORIZED.value());
        result.setMessage(message);
        result.setData(data);
        return result;
    }

    /**
     * @param message 错误信息
     * 服务调用失败默认返回结果
     *
     * @return Result
     */
    default Result fail(String message) {
        Result Result = new Result();
        Result.setCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
        Result.setMessage(message);
        return Result;
    }

    /**
     * @param message 错误信息
     * 服务调用失败默认返回结果
     *
     * @return Result
     */
    default Result fail(int code,String message) {
        Result Result = new Result();
        Result.setCode(code);
        Result.setMessage(message);
        return Result;
    }

    /**
     * 找不到用户信息/用户没有登入
     *
     * @return Result
     */
    default Result userMessage(){
        Result Result = new Result();
        Result.setCode(401);
        Result.setMessage("You have not logged in yet. Please log in");
        return Result;
    }

//    /**
//     * Es的公共返回 NativeSearchQueryBuilder
//     *
//     * @return NativeSearchQueryBuilder
//     */
//    default NativeSearchQueryBuilder getSearchQuery(Map<String,Object> paramMap){
//        //建立QueryBuilder
//        NativeSearchQueryBuilder nativeSearchQueryBuilder = new NativeSearchQueryBuilder();
//        //加入分页
//        Object page= paramMap.get("page");
//        Object size= paramMap.get("size");
//        if(page!=null && !page.equals("") && size!=null &&  !size.equals("")) {
//            nativeSearchQueryBuilder.withPageable(PageRequest.of(Integer.parseInt(page.toString())-1, Integer.parseInt(size.toString())));
//        }
//        // 参数封装  构建查询
////        BoolQueryBuilder boolQuery = ExtractionMethod.getNativeQuery(paramMap);
//        QueryBuilder query = ExtractionMethod.getNativeQuery(paramMap);
//        nativeSearchQueryBuilder.withQuery(query);
//        //聚合
//        return nativeSearchQueryBuilder;
//    }
//
//
//
//
//    /**
//     * 服务调用成功后返回数据
//     *
//     * @return ShareDataResult
//     */
//    default ShareDataResult successSDR(Object data) {
//        ShareDataResult shareDataResult = new ShareDataResult();
//        shareDataResult.setCode(HttpStatus.OK.value());
//        shareDataResult.setMessage("success");
//        shareDataResult.setData(data);
//        return shareDataResult;
//    }
//
//    /**
//     * @param message 错误信息
//     * 服务调用失败默认返回结果
//     *
//     * @return ShareDataResult
//     */
//    default ShareDataResult failSDR(int code,String message) {
//        ShareDataResult shareDataResult = new ShareDataResult();
//        shareDataResult.setCode(code);
//        shareDataResult.setMessage(message);
//        return shareDataResult;
//    }
}
