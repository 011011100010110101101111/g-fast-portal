package org.gitor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GFastPortalApplicationTests {

	@Test
	public void contextLoads() {


        Map<String, Object> map = new HashMap<>();
        Map<String, Object> map1 = new HashMap<>();

        map.put("id",1);
        map.put("name","abd");

        map1.put("id",2);
        map1.put("name","abd");

        List<Map<String,Object>> list = new ArrayList<>();
        list.add(map);
        list.add(map1);


        Map<String,Object> map2 = new HashMap<>();


        for (Map<String,Object> l : list){

            for (int i = 0;i<list.size() ;i++){
                map2.put("name",l.get("name"));
                if (l.get("name").equals(list.get(i).get("name"))){
                    map2.put("id",3);
                }

            }

        }

        List<Map<String,Object>> list1 = new ArrayList<>();
        list1.add(map2);

        list1.forEach(System.out::println);

    }
}
