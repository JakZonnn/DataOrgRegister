package cn.dataorgregister;

import cn.dataorgregister.entity.mongo.Location;
import cn.dataorgregister.repository.mongo.LocationRepository;
import cn.dataorgregister.utils.GsonUtils;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SpringBootTest
class DataOrgRegisterApplicationTests {

    @Test
    void contextLoads() {
    }


    /*
    解析国家/省份/区的json文件，写入mongodb中
     */
    @Autowired
    LocationRepository locationRepository;
    @SneakyThrows
    @Test
    public void readJson(){
        FileInputStream inputStream = new FileInputStream("D:\\大数据实验室工作\\体系组登录功能20220901\\location.json");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder builder = new StringBuilder();
        String str = null;
        while((str = bufferedReader.readLine()) != null)
        {
            builder.append(str);
        }
        Map<String,Object> map = GsonUtils.gsonToMaps(builder.toString());

//        List<Map<String,Object>> data =(List<Map<String,Object>>) map.get("data");
//        List<Location> lo = new ArrayList<>();
//        for (Map<String,Object> m :data){
//            List<Map<String,Object>> cityMap = (List<Map<String,Object>>) m.get("clist");
//            if (null != cityMap && cityMap.size() > 0){
//                for (Map<String,Object> cm: cityMap){
//                    List<Map<String,Object>> area = (List<Map<String,Object>>) cm.get("pchilds");
//                    if (null != area && area.size() > 0){
//                        for (Map<String,Object> ar: area){
//                            Location l = new Location();
//                            l.setCountry(m.get("name").toString());
//                            l.setCountryCode(m.get("code").toString());
//                            l.setCityCode(cm.get("code").toString());
//                            l.setCity(cm.get("name").toString());
////                    List<Map<String,Object>> areaMap =(List<Map<String,Object>>) cm.get("pchilds");
//                            l.setArea(ar.get("name").toString());
//                            l.setAreaCode(ar.get("code").toString());
//                            lo.add(l);
//                        }
//
//                    }
//
//                }
//            }
//        }
        List<Map<String,Object>> data =(List<Map<String,Object>>) map.get("data");
        List<Location> lo = new ArrayList<>();
        for (Map<String,Object> m :data){
            List<Map<String,Object>> cityMap = (List<Map<String,Object>>) m.get("clist");
            if (null != cityMap && cityMap.size() > 0){
                for (Map<String,Object> cm: cityMap){
                    Location l = new Location();
                    l.setCountry(m.get("name").toString());
                    l.setCountryCode(m.get("code").toString());
                    l.setCityCode(cm.get("code").toString());
                    l.setCity(cm.get("name").toString());
                    List<Map<String,Object>> areaMap =(List<Map<String,Object>>) cm.get("pchilds");
                    l.setCchilds(areaMap);
                    lo.add(l);
                }
            }
        }

        locationRepository.saveAll(lo);

        System.out.println(lo.size());

        for (int i = 0; i < lo.size() ;i++){

            System.out.println(lo.get(i).toString());

        }


    }

}
