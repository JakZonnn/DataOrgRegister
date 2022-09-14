package cn.dataorgregister.utils;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * CaffeineUtil
 *
 * @author jmal
 */
@Component
public class CaffeineUtil {

    /***
     * ftp 缓存
     */
    private final static Cache<String, String> FTP_USERID = Caffeine.newBuilder().expireAfterWrite(1,TimeUnit.DAYS).build();

    private final static Cache<String, Map<String,String>> short_chain = Caffeine.newBuilder().expireAfterWrite(1,TimeUnit.DAYS).build();

    private static Cache<String,String> tokenCache;    //用户token

    private static Cache<String, List<String>> emailToken; //用户+token

    private static Cache<String,String> privateLink;    //预览地址缓存

    private static Cache<String, Map<String,String>> publicOrgUrl;   //发布机构路径

    private static Cache<String,String> publicModel;       // 发布模板

    private static Cache<String,String> SCIENCE_DATA;          //scidb token缓存

    private  static Cache<String, String> SPACE_INVITE;          // 空间邀请

    private  static Cache<String, String> THIRD_PARTY;       //第三方信息缓存

    private static Cache<String,String>  CHECK;          //短时间内操作校验

    private static Cache<String,Integer> ERROR_PWD;     //密码错误次数校验

    private static Cache<String,String> disable;

    private static Cache<String,String> EMAIL_SEND;   // 邮箱时间判断

    private static Cache<String,List<String>> APPLY_SPACE;  //空间申请记录

    private static Cache<String,Object> SPACE_STATISTIC;   //空间下载量、访问量等

    private static Cache<String,Object> config;         //系统其他配置



    public static void setShortChain(String username, Map<String,String> authorities) {
        short_chain.put(username, authorities);
    }

    public static Map<String,String> getShortChain(String username){
        return short_chain.getIfPresent(username);
    }

    @PostConstruct
    public void initCache(){
        initMyCache();
    }

    public static void initMyCache(){
        if(tokenCache == null){
            tokenCache = Caffeine.newBuilder().expireAfterAccess(3, TimeUnit.HOURS).build();
        }

        if(emailToken == null){
            emailToken = Caffeine.newBuilder().expireAfterAccess(3, TimeUnit.HOURS).build();
        }

        if(privateLink == null){
            privateLink = Caffeine.newBuilder().expireAfterWrite(1, TimeUnit.DAYS).build();
        }
        if(publicOrgUrl == null){
            publicOrgUrl = Caffeine.newBuilder().build();
        }
        if(publicModel == null){
            publicModel = Caffeine.newBuilder().build();
        }
        if(SCIENCE_DATA == null){
            SCIENCE_DATA = Caffeine.newBuilder().expireAfterWrite(30, TimeUnit.MINUTES).build();
        }
        if(THIRD_PARTY == null){
            THIRD_PARTY = Caffeine.newBuilder().expireAfterAccess(3, TimeUnit.HOURS).build();
        }
        if(SPACE_INVITE == null){
            SPACE_INVITE = Caffeine.newBuilder().expireAfterWrite(1, TimeUnit.DAYS).build();
        }
        if(config == null){
            config = Caffeine.newBuilder().expireAfterWrite(7, TimeUnit.DAYS).build();
        }
        if(CHECK == null){
            CHECK = Caffeine.newBuilder().expireAfterWrite(1, TimeUnit.DAYS).build();
        }
        if(EMAIL_SEND == null){
            EMAIL_SEND = Caffeine.newBuilder().expireAfterWrite(1,TimeUnit.MINUTES).build();
        }
    }


    public static Cache<String, String> getTokenCache(){
        if(tokenCache == null){
            initMyCache();
        }
        return tokenCache;
    }

    public static Cache<String, List<String>> getEmailToken (){
        if(emailToken == null){
            initMyCache();
        }
        return emailToken;
    }

    public static Cache<String, String> getPrivateLink(){
        if(privateLink == null){
            initMyCache();
        }
        return privateLink;
    }

    public static Cache<String, Map<String,String>> getPublicOrgUrl(){
        if(publicOrgUrl == null){
            initMyCache();
        }
        return publicOrgUrl;
    }

    public static Cache<String, String> getPublicModel(){
        if(publicModel == null){
            initMyCache();
        }
        return publicModel;
    }

    public static Cache<String,String> getScienceData(){
        if(SCIENCE_DATA == null){
            initMyCache();
        }
        return SCIENCE_DATA;
    }

    public static Cache<String,String> getThirdParty(){
        if(THIRD_PARTY == null){
            initMyCache();
        }
        return THIRD_PARTY;
    }

    public static Cache<String,String> getSpaceInvite(){
        if(SPACE_INVITE == null){
            initMyCache();
        }
        return SPACE_INVITE;
    }

    public static Cache<String,Object> getConfig(){
        if(config == null){
            initMyCache();
        }
        return config;
    }

    public static Cache<String,String> getCHECK(){
        if(CHECK == null){
            initMyCache();
        }
        return CHECK;
    }

    public static Cache<String,String> getEmailSend(){
        if(EMAIL_SEND == null){
            initMyCache();
        }
        return EMAIL_SEND;
    }

    public static Cache<String,Integer> getErrorPwd(){
        if(ERROR_PWD == null){
            ERROR_PWD = Caffeine.newBuilder().expireAfterWrite(1,TimeUnit.HOURS).build();
        }
        return ERROR_PWD;
    }

    public static Cache<String,String> getDisable(){
        if(disable == null){
            disable = Caffeine.newBuilder().expireAfterWrite(1,TimeUnit.DAYS).build();
        }
        return disable;
    }


    public static Cache<String,List<String>> getApplySpace(){
        if(APPLY_SPACE == null){
            APPLY_SPACE = Caffeine.newBuilder().expireAfterWrite(4,TimeUnit.HOURS).build();
        }
        return APPLY_SPACE;
    }


    public static Cache<String,Object> getSpaceStatistic(){
        if(SPACE_STATISTIC == null){
            SPACE_STATISTIC = Caffeine.newBuilder().expireAfterWrite(30,TimeUnit.DAYS).build();
        }
        return SPACE_STATISTIC;
    }


    public static void setSpaceFull(String username,String userId) {
        FTP_USERID.put(username, userId);
    }

    public static String getSpaceFull(String username){
        return   FTP_USERID.getIfPresent(username);
    }

    public static boolean spaceFull(String userId) {
        return FTP_USERID.getIfPresent(userId) != null;
    }


    public static void clearFtpUserId(){
         FTP_USERID.cleanUp();
    }

    public static void clearFtpShor (){
         short_chain.cleanUp();
    }
}
