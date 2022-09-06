package cn.dataorgregister.utils;

import com.alibaba.fastjson.JSONArray;
import com.google.common.collect.Lists;
import org.springframework.beans.BeanUtils;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.ServletRequest;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.constraints.NotNull;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Pattern;
import org.springframework.beans.BeanUtils;

public class CommonUtils {
    /**
     * 生成 UUID （过滤连接符 "-"）
     * 
     * @return String
     */
    public static String generateUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    public static Map<String, String> toMap(HttpServletRequest request) {
        Map<String, String> params = new HashMap<String, String>();
        Map<String, String[]> requestParams = request.getParameterMap();
        for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {
            String name = iter.next();
            String[] values = requestParams.get(name);
            String valueStr = "";
            for (int i = 0; i < values.length; i++) {
                valueStr = (i == values.length - 1) ? valueStr + values[i] : valueStr + values[i] + ",";
            }
            // 乱码解决，这段代码在出现乱码时使用。
            // valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
            params.put(name, valueStr);
        }
        return params;
    }

    public static <T> T toSdo(HttpServletRequest request, Class<T> clazz) {
        // 可以判断参数是否为空，如果为空抛出异常
        T obj = null;
        try {
            obj = BeanUtils.instantiateClass(clazz);
            Map<String, String[]> parameterMap = request.getParameterMap();
            org.apache.commons.beanutils.BeanUtils.populate(obj, parameterMap);
            // BeanUtils.copyProperties(parameterMap,obj);
        } catch (Exception e) {
            new RuntimeException("根据请求获取与实体类型获取实体错误");
        }
        return obj;
    }

    public static <T> T toObject(HttpServletRequest request, Class<T> clazz, String prefix) {
        // 可以判断参数是否为空，如果为空抛出异常
        T obj = null;
        try {
            obj = BeanUtils.instantiateClass(clazz);
            Map<String, Object> newMap = new HashMap<>();
            Map<String, String[]> parameterMap = request.getParameterMap();
            for (String s : parameterMap.keySet()) {
                if (s.startsWith(prefix)) {
                    newMap.put(s.substring(2).toLowerCase(), parameterMap.get(s));
                } else if (s.startsWith(change(prefix))) {
                    continue;
                }
                newMap.put(s, parameterMap.get(s));
            }
            org.apache.commons.beanutils.BeanUtils.populate(obj, newMap);
        } catch (Exception e) {
            new RuntimeException("根据请求获取与实体类型获取实体错误");
        }
        return obj;
    }

    public static String change(String lang) {
        if ("zh".equals(lang)) {
            return "en";
        } else {
            return "zh";
        }
    }

    /**
     * 获取请求参数名称集合
     *
     * @param request
     *            ServletRequest
     * @return List<String>
     */
    public final static List<String> getParameterNames(ServletRequest request) {
        List<String> names = new ArrayList<String>();
        Enumeration<String> en = request.getParameterNames();

        while (en.hasMoreElements())
            names.add(en.nextElement());

        return names;
    }

    /**
     * 获取请求真实Ip
     *
     * @param request
     *            ServletRequest
     * @return String
     */

    public static String getIpAddress(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_CLIENT_IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }


    /**
     * @description: 获取IP地址
     * @methodName: getIpAddr
     * @param: [request]
     * @return: java.lang.String
     * @author: Zhangtd
     * @date: 2021-05-25 19:46:17
     */
    public static String getIpAddr(HttpServletRequest request) {
        try {
            String ip = request.getHeader("X-Forwarded-For");

            if (ip == null || ip.length() == 0
                    || "unknown".equalsIgnoreCase(ip)) {
                ip = request.getHeader("Proxy-Client-IP");
            }
            if (ip == null || ip.length() == 0
                    || "unknown".equalsIgnoreCase(ip)) {
                ip = request.getHeader("WL-Proxy-Client-IP");
            }
            if (ip == null || ip.length() == 0
                    || "unknown".equalsIgnoreCase(ip)) {
                ip = request.getRemoteAddr();
                if (ip.equals("127.0.0.1") || ip.equals("0:0:0:0:0:0:0:1")) {
                    // 根据网卡取本机配置的IP
                    InetAddress inet = InetAddress.getLocalHost();
                    ip = inet.getHostAddress();

                    // 对于通过多个代理的情况，第一个IP为客户端真实IP,多个IP按照','分割
                    if (ip != null && ip.length() > 15) { // "***.***.***.***".length()
                        // = 15
                        if (ip.indexOf(",") > 0) {
                            ip = ip.substring(0, ip.indexOf(","));
                        }
                    }
                }
            }
            if (ip != null && ip.length() > 15) { // "***.***.***.***".length()
                // = 15
                if (ip.indexOf(",") > 0) {
                    ip = ip.substring(0, ip.indexOf(","));
                }
            }
            return ip;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * @description: 获取请求链接来源（百度？谷歌？）
     * @methodName: getHttpReferer
     * @param: [request]
     * @return: {@link String}
     * @author: Zhangtd
     * @date: 2021-05-25 19:46:17
     */
    public static String getHttpReferer(HttpServletRequest request) {
        try {
            String referer = "";
            if (null != request.getHeader("Http-Referer")) {
                referer = request.getHeader("Http-Referer");
            }
            return referer;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * @description: 获取用户访问平台（Windows/Android）
     * @methodName: getUserAgent
     * @param: [request]
     * @return: {@link String}
     * @author: Zhangtd
     * @date: 2021-05-25 19:46:17
     */
    public static String getUserAgent(HttpServletRequest request) {
        try {
            String agent = "";
            if (null != request.getHeader("User-Agent")) {
                agent = request.getHeader("User-Agent");
            }
            return agent;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    public static String getEnTime(Date time){
        if(time != null) {
            SimpleDateFormat format2 = new SimpleDateFormat("d MMM yyyy",
                    Locale.ENGLISH);
            return format2.format(time);
        }else {
            return null;
        }
    }

    public static Date getTime(String date){
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");
        Date dateTime=null;
        try {
         dateTime= format2.parse(date);
        }catch (Exception e){
        }
        return dateTime;
    }

    public static List<Integer> getYearList(Integer yearNumber){
        List<Integer> yearList=  Lists.newArrayList();
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy");
        Integer yy = Integer.valueOf(format2.format(new Date()));
        for(int i=yearNumber;i>=0;i--){
            yearList.add(yy-i);
        }
        return yearList;
    }

    public static List<String> getTopList(List<String> tops,String topName,String newTopName){
        List<String> topList= new ArrayList<String>();
        for (String top : tops) {
            if(top.equals(topName)){
                top=newTopName;
            }
            topList.add(top);
        }
        return topList;
    }

    public static String getFilePath(String location){
        String path="";
        if(location!=null && !location.equals("")) {
            int i = location.lastIndexOf("/");
            String path3 = location.substring(i + 1, location.length());
            String dir = location.substring(0, i);
            String path2 = dir.substring(dir.lastIndexOf("/") + 1, dir.length());
            String path1 = dir.substring(0, dir.lastIndexOf("/") + 1);
            path3 = path3.replace(" ", "%20");
            path3 = path3.replace("&", "%26");
            path2 = path2.replace(" ", "%20");
            path2 = path2.replace("&", "%26");
           path = path1 + path2 + "/" + path3;
        }
       return path;
    }

    public static String addDesp(String introduction){
        String desp = "";
        if(introduction!=null && !introduction.equals("")) {
            List<Map<String, Object>> mm= (List<Map<String, Object>>) JSONArray.parse(introduction);
            for (Map<String, Object> stringObjectMap : mm) {
                desp += stringObjectMap.get("value") + " ";
            }
        }
        return desp;
    }

    /**
     * cookie获取用户Id
     *
     * @param request
     *            ServletRequest
     * @return String
     */

    public static String getUserId(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        if(cookies!=null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("user")) {
                    String value = cookie.getValue();
                    return value.substring(0, value.indexOf("+"));
                }
            }
        }
        return null;
    }

    /*
    * 获取Cookie
    * */
    public static Cookie getCookie(String name,String value,int time,int version){
        Cookie cookie = new Cookie(name, value);
        cookie.setMaxAge(time);//-1：没有有效期；0：即时失效
        cookie.setVersion(version);
        //cookie有效路径是网站根目录
        cookie.setPath("/");
        return cookie;
    }

    /**
     * 判断对象是否为NotEmpty(!null或元素大于0)
     * 实用于对如下对象做判断:String Collection及其子类 Map及其子类
     *
     * @param pObj 待检查对象
     *
     * @return boolean 返回的布尔值
     */
    public static boolean isNotEmpty(Object pObj) {
        if (pObj == null) {
            return false;
        }
        if ("".equals(pObj)) {
            return false;
        }
        if (pObj instanceof String) {
            return ((String) pObj).length() != 0;
        } else if (pObj instanceof Collection) {
            return !((Collection) pObj).isEmpty();
        } else if (pObj instanceof Map) {
            return ((Map) pObj).size() != 0;
        }
        return true;
    }

    /*
     * 获取服务器ip
     * */
    public static String getServerIP(){
        try {
            return InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return "Error Acquiring Server IP";
    }

    public static boolean judgeMapId(List<Map<String, Object>> nodes, Map<String, Object> refNode) {
        for (Map<String, Object> stringObjectMap : nodes) {
            if (stringObjectMap.containsValue(refNode.get("id")))
                return false;
        }
        return true;
    }

    /**
     * 生成字母验证码
     * @return 验证码的内容
     */
    public static String generateRandomLetters() {
        String[] abc = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "q", "r", "s", "t", "u", "v", "o", "p", "w", "x", "z", "y", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "Q", "R", "S", "T", "U", "V", "O", "P", "W", "X", "Y", "Z"};
        Random rd = new Random();
        int index = rd.nextInt(abc.length);
        String one = abc[index];
        index = rd.nextInt(abc.length);
        String two = abc[index];
        index = rd.nextInt(abc.length);
        String three = abc[index];
        index = rd.nextInt(abc.length);
        String four = abc[index];
        String str = one + two + three + four;
        return str;
    }

    /**
     * @Description: 判断用户是否登录状态，如果登录状态可以获取到userId
     * @MethodName: isLoginStatus
     * @Param request:
     * @Return java.lang.String
     * @Date 2019/11/19 19:37
     */
    public static String isLoginStatus(HttpServletRequest request){
        return CommonUtils.getUserId(request);
    }

    /**
     * @Description: 判断用户是否登录状态，如果登录状态可以获取到userId
     * @MethodName: isLoginStatus
     * @Param response:
     * @Param request:
     * @Return java.lang.String
     * @Date 2019/11/19 19:37
     */
    public static String isLoginStatus(HttpServletResponse response,HttpServletRequest request){
        String userId = CommonUtils.getUserId(request);
        if(userId==null || userId.equals("")){
            try {
                response.sendError(401, "You have not logged in yet. Please log in!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return userId;
    }

    /**
     * @description: 验证是否是URL  http://www.slf4j.org/codes.html#multiple_bindings->true
     * @methodName: isUrl
     * @Param url:
     * @return boolean
     * @author Zhangtd
     * @date 2020/10/13 14:44
     */
    public static boolean isUrl(@NotNull String url){
        boolean flag = false;
        if (null != url && !url.isEmpty()) {
            //String regex = "^([hH][tT]{2}[pP]:/*|[hH][tT]{2}[pP][sS]:/*|[fF][tT][pP]:/*)(([A-Za-z0-9-~]+).)+([A-Za-z0-9-~\\/])+(\\?{0,1}(([A-Za-z0-9-~]+\\={0,1})([A-Za-z0-9-~]*)\\&{0,1})*)$";
            String regex = "[a-zA-z]+://[^\\s]*";
            Pattern pattern = Pattern.compile(regex);
            flag = pattern.matcher(url).matches();
        }
        return flag;
    }

    public static boolean isIp(@NotNull String ip){
        boolean flag = false;
        if (null != ip && !ip.isEmpty()) {
            String regex = "\\b((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\b";
            Pattern pattern = Pattern.compile(regex);
            flag = pattern.matcher(ip).matches(); //验证IP地址有效性
        }
        return flag;
    }

    //处理转义字符<--""&lt;";  >--"&gt;"
    public static String handleEscapeChar(String str){
        return str
                .replaceAll("%20", " ");
    }

    /**
     * 获取request
     */
    public static HttpServletRequest getRequest()
    {
        return getRequestAttributes().getRequest();
    }

    /**
     * 获取response
     */
    public static HttpServletResponse getResponse()
    {
        return getRequestAttributes().getResponse();
    }

    /**
     * 获取session
     */
    public static HttpSession getSession()
    {
        return getRequest().getSession();
    }

    public static ServletRequestAttributes getRequestAttributes()
    {
        RequestAttributes attributes = RequestContextHolder.getRequestAttributes();
        return (ServletRequestAttributes) attributes;
    }

    /**
     * 转换文件大小  参数为xxB
     */
    public static String convertSizeToString(String strSize) {
        long size = Long.valueOf(strSize);
        DecimalFormat df=new DecimalFormat("0.00");

        if (size < 0) {
            size = 0;
        }
        return size >= 1024 ? size / 1024 >= 1024 ? size / 1024 / 1024 >= 1024 ? df.format((float)size / 1024 / 1024 / 1024) + "GB" : df.format((float)size / 1024 / 1024) + "MB" : df.format((float)size / 1024) + "KB" : size + "B";
    }

    /**
     * @description: 随机生成时间戳，并且在第8、3位各插入一个随机数字，返回字符串
     * @methodName: addRandomNum
     * @param: []
     * @return: java.lang.String
     * @author: Zhangtd
     * @date: 2021-08-03 10:09:51
     */
    public static String addRandomNum(@NotNull String str){
        if (str.length() >= 8) {
            Random random = new Random();
            int i1 = random.nextInt(10);
            int i2 = random.nextInt(10);
            StringBuffer stringBuffer = new StringBuffer();
            //在第3、8位添加随机数
            str = str.substring(0,2) + i1 + str.substring(2,7) + i2 + str.substring(7) + "";
        }
        return str;
    }

    /**
     * @description: 将字符串的第3、9位的字符去掉，返回结果
     * @methodName: removeRandomNum
     * @param: [str]
     * @return: java.lang.String
     * @author: Zhangtd
     * @date: 2021-08-03 10:11:07
     */
    public static String removeRandomNum(@NotNull String str){
        if (str.length() >= 9) {
            str = str.substring(0,2) + str.substring(3,8) + str.substring(9) + "";
        }
        return str;
    }

    /**
     * @description: 将带有0时区的字符串时间（2021-09-22T03:00:00.000Z），准换为东八区时间（yyyy-MM-dd HH:mm:ss）
     * @methodName: method
     * @param: [time]
     * @return:
     * @author: Zhangtd
     * @date: 2021-09-22 17:12:57
     */
    public static String convertTime2GMT08(String time) {
        //时间格式自己定义
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:sszzz");
        TimeZone tz;

        // 设置时区为"GMT+08:00"（需要输出时间的时区 ）
        tz = TimeZone.getTimeZone("GMT+08:00");

        // 后面的+0000为国际时间，其它时区请自行更换 （如GMT+08:00 为+0800）
        Date date = null;
        try {
            date = df.parse(time.replace("T"," ").replace(".000Z", "") + "+0000");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // 获取默认的DateFormat，用于格式化Date
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // 设置时区为tz
        sdf.setTimeZone(tz);
        // 获取格式化后的字符串
        String str = sdf.format(date);
        return str;
    }

    /**
     * @description: 创建一个包含${num}个值为0的集合
     * @methodName: creatZeroList
     * @param: [num] 若num <= 0,返回空集合
     * @return: [0,0,0,0,0,0,0...]
     * @author: Zhangtd
     * @date: 2021-09-23 10:16:33
     */
    public static ArrayList<Long> creatZeroList(int num){
        ArrayList<Long> resultList = new ArrayList<>();
        if (num > 0) {
            for (int i = 0; i < num; i++) {
                resultList.add(0L);
            }
        }
        return resultList;
    }

    /**
     * @description: 生成一天的24小时字符串集合
     * @methodName: getOneDayHours
     * @param: []
     * @return:
     * @author: Zhangtd
     * @date: 2021-09-25 17:03:08
     */
    public static List<String> getOneDayHours(){
        List<String> oneDayHours = Arrays.asList("01:00","02:00","03:00","04:00","05:00","06:00","07:00","08:00","09:00","10:00","11:00",
                "12:00","13:00","14:00","15:00","16:00","17:00","18:00","19:00","20:00","21:00","22:00","23:00","24:00");
        return oneDayHours;
    }

    /**
     * @description: 生成｛开始时间--结束时间｝这段时间内的日期（包括开始、结束这两天）
     * @methodName: getDayListByTimeMillis
     * @param: [starTime, endTime]
     * @return:  [2001-02-23, 2001-02-24, 2001-02-25, 2001-02-26, 2001-02-27, 2001-02-28, 2001-03-01]
     * @author: Zhangtd
     * @date: 2021-09-24 16:58:38
     */
    public static List<String> getDayListByTimeMillis(long starTime, long endTime){
        List<String> resultList = new ArrayList<>();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        long diff = (endTime - starTime) / (86400 * 1000);
        System.out.println("diff = " + diff);

        Date sb = null;
        Date se = null;
        if(diff == 0){
            sb = new Date(starTime);
            resultList.add(format.format(sb));
        }else {
            int i = 0;
            while (i <= diff) {
                if (i == 0) {
                    sb = new Date(starTime);
                } else if (i == diff) {
                    sb = new Date(endTime);
                } else {
                    se = new Date(starTime + i * 24 * 60 * 60 * 1000);
                    sb = se;
                }
                resultList.add(format.format(sb));
                i++;
            }
        }
        //System.out.println(resultList);
        return resultList;
    }


    /**
     * @description: 根据传入的时间戳，获取到时间戳当天的开始、结束时间戳
     * @methodName: getTodayStartEndTime
     * @param: [nowTimestamp]  时间戳：1629889746578L--对应的时间：2021-08-25 19:09:06
     * @return:  List<Long>  [1629820800000（2021-08-25 00:00:00）, 1629907199000（2021-08-25 23:59:59）]
     * @author: Zhangtd
     * @date: 2021-09-28 19:41:53
     */
    public static List<Long> getTodayStartEndTimestamp(long nowTimestamp){
        List<Long> resultList = new ArrayList<>();

        //先从时间戳中获取今天的年-月-日
        Date date = new Date(nowTimestamp);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sdf.format(date);

        String day = format.substring(0, 10);
        String todayStartTimeStr = day + " 00:00:00";
        String todayEndTimeStr = day + " 23:59:59";
        long todayStartTime = 0L;
        long todayEndTime = 0L;
        try {
            todayStartTime = sdf.parse(todayStartTimeStr).getTime();
            todayEndTime = sdf.parse(todayEndTimeStr).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        resultList.add(todayStartTime);
        resultList.add(todayEndTime);
        return resultList;
    }



    /**
     * @description: 根据传入的时间戳，转化为yyyy-MM-dd HH:mm:ss 格式
     * @methodName: convertTimestamp2DateFormat
     * @param: [Timestamp]  时间戳：1633252158000L
     * @return:  2021-10-03 17:09:18
     * @author: Zhangtd
     * @date: 2021-09-28 19:41:53
     */
    public static String convertTimestamp2DateFormat(long timestamp){

        //先从时间戳中获取今天的年-月-日
        Date date = new Date(timestamp);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }

}
