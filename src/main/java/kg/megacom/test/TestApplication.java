package kg.megacom.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.TreeMap;

@SpringBootApplication
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
        HashMap map = new HashMap();
//        map.

        TreeMap treeMap = new TreeMap(map);
//        treeMap.
    }

}
