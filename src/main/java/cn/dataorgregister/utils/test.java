//package cn.dataorgregister.utils;
//
//import java.io.File;
//import java.io.IOException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
///**
// * @author ZJ
// * @description
// * @Create by 2022/9/16 14:12
// */
//public class test {
//    public static void main(String[] args) throws IOException {
//        String fileN = "12323423.png";
//        String substring = fileN.substring(fileN.lastIndexOf("."));
//        System.out.println(substring);
//        Date date = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        String nowTime = sdf.format(date);
//        String fileName =nowTime + substring;
//        String fileP = "C:\\Users\\zhaoj\\Desktop\\1";
//        String s = fileP + File.separator + fileName;
//        System.out.println(s);
//
//
//    }
//}
