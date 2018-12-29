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

        Map<String,Object> map3 = new HashMap<>();

        map.put("id",1);
        map.put("name","abd");

        map1.put("id",2);
        map1.put("name","abd");

        map3.put("id",4);
        map3.put("name","aaaaa");

        Map<String,Object> map4 = new HashMap<>();
        map4.put("id",4);
        map4.put("name","aaaaa");

        Map<String,Object> map5 = new HashMap<>();
        map5.put("id",10);
        map5.put("name","aaaasas");

        List<Map<String,Object>> list = new ArrayList<>();
        list.add(map);
        list.add(map1);
        list.add(map3);
        list.add(map4);
        list.add(map5);

        Set<Map<String,Object>> list1 = new HashSet<>();

        for (int i = 0 ; i < list.size();i++){

            for (int j =list.size()-1 ; j>i ;j--){
                Map<String,Object> map2 = new HashMap<>();

                if (list.get(i).get("name").equals(list.get(j).get("name"))){

                    map2.put("id",3);
                    map2.put("name",list.get(j).get("name"));

                }else {
                    map2.put("id",list.get(j).get("id"));
                    map2.put("name",list.get(j).get("name"));
                }
                list1.add(map2);

            }

        }


        String a = "010100110";

        String b = "100101110";

        Integer aaa = Integer.valueOf(a,2);
        Integer bbb = Integer.valueOf(b,2);


        int ab = aaa|bbb;

        System.out.println(Integer.toBinaryString(ab));

//      //  list1.forEach(System.out::println);
//
//
//
//        int l = 6;
//        int w = l << 2;
//
//
//        System.out.println(w);
//
//
//        System.out.println(222 | 333);

    }
}
