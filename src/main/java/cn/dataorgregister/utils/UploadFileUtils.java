package cn.dataorgregister.utils;

import com.sun.org.apache.regexp.internal.RE;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import javax.validation.constraints.NotNull;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author ZJ
 * @description
 * @Create by 2022/9/16 10:25
 */
public class UploadFileUtils {
    /**
     上传图片方法,返回存放图片的路径
     */
    public static Map uploadImage(MultipartFile multipartFile, String dataName, @NotNull String path){
        Map<String, Object> result = new HashMap<>();
        result.put("code",200);
        if(null == multipartFile || multipartFile.getSize() <= 0){
            result.put("code",500);
            result.put("msg","请上传文件");
            return result;
        }
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        String nowTime = sdf.format(date);
        String suffixFile = multipartFile.getOriginalFilename().substring(multipartFile.getOriginalFilename().lastIndexOf("."));
        String suffix = suffixFile.toLowerCase();
        if (suffix.equals(".jpg") || suffix.equals(".png") || suffix.equals(".jpeg")){
            try {
                String fileName = dataName + nowTime + suffix;  //存储的图像名称 数据库/数据中心中文名+时间+后缀
                File filePath = new File(path);
                if (!filePath.exists()){
                    filePath.mkdirs();
                }
                //保存图像，将multipartFile对象装入image文件中
                String imagePath = filePath + File.separator + fileName;
                multipartFile.transferTo(new File(imagePath));
                result.put("path",imagePath);
                return result;
            } catch (IOException e) {
                e.printStackTrace();
                result.put("code",500);
                result.put("msg",e.toString());
                return result;
            }
        }
        result.put("code",500);
        result.put("msg","图片仅支持jpg,jpeg和png格式");
        return result;
    }



    /**
     上传文档方法,返回存放文档的路径,要做成map返回，考虑文件A上传成功，B上传不成功的情况，需要用for校验
     */
//    public static List<> uploadDocu(MultipartFile[] files, String dataName, @NotNull String path){
//        if (null == files || files.length <= 0 ){
//            return "请上传文件";
//        }
//        Date date = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        String nowTime = sdf.format(date);
//        for (MultipartFile multipartFile : files) {
//            String suffixFile = multipartFile.getOriginalFilename().substring(multipartFile.getOriginalFilename().lastIndexOf("."));
//            String suffix = suffixFile.toLowerCase();
//            if (suffix.equals(".doc") || suffix.equals(".docx") || suffix.equals(".pdf")){
//                try {
//                    String fileName = dataName + nowTime + suffix;  //存储的文件名称
//                    File filePath = new File(path);
//                    if (!filePath.exists()){
//                        filePath.mkdirs();
//                    }
//                    //保存图像，将multipartFile对象装入image文件中
//                    String imagePath = filePath + File.separator + fileName;
//                    multipartFile.transferTo(new File(imagePath));
//                    return imagePath;
//                } catch (IOException e) {
//                    e.printStackTrace();
//                    return e.toString();
//                }
//            }
//        }
//
//        return "图片仅支持word和pdf文件";
//    }



    public ResponseEntity<?> updateLoadImage(MultipartFile multipartFile, HttpSession session) {
        Map<String, Object> objectMap = new HashMap<>(3);

        String fileSavePath = "/home" + projectImgPath;
        if (null == multipartFile || multipartFile.getSize() <= 0) {
            objectMap.put("code", 400);
            objectMap.put("msg", "请选择上传文件");
            return new ResponseEntity<>(objectMap, HttpStatus.OK);
        }
        Long userId = (Long) session.getAttribute("userId");//获得userId
        Date date = new Date();//获得系统时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");// 系统时间Format
        String nowTime = sdf.format(date);

        //文件名处理
        // String originalName = multipartFile.getOriginalFilename();
        String[] splits = multipartFile.getOriginalFilename().toLowerCase().split("\\.");

        String fileName = UUID.randomUUID().toString().replace("-", "");
        String picNewName = fileName + userId + nowTime + "." + splits[splits.length - 1];//文件名
        String imgRealPath = fileSavePath + picNewName;//文件路径+文件名
        String imageSavePath = "/homePath" + projectImgPath + picNewName;// 数据库存储的url

        try {
            File filePath = new File(fileSavePath);
            if (!filePath.exists()) {
                filePath.mkdirs();
            }
            //保存图片-将multipartFile对象装入image文件中
            File imageFile = new File(imgRealPath);
            multipartFile.transferTo(imageFile);
        } catch (Exception e) {
            objectMap.put("msg", e.getCause().getMessage());
            return new ResponseEntity<>(objectMap, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        objectMap.put("msg", "上传成功");
        objectMap.put("code", 200);
        //objectMap.put("imageDataPath", picNewName);
        objectMap.put("imageDataPath", imageSavePath);
        return new ResponseEntity<>(objectMap, HttpStatus.OK);
    }

    /**
     上传文件方法,返回存放图片的路径
     */
}
