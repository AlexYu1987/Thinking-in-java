package org.yzj.thinking.json;

import com.alibaba.fastjson.JSON;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

/**
 * Created by yuzhoujun on 2017/2/8.
 */
public class JSONPractise {

    public static void main(String... args) {
        try {
            String fileName = JSONPractise.class.getResource("").getPath() + "data.json";
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            StringBuilder sb = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }

            RouteTable routeTable = JSON.parseObject(sb.toString(), RouteTable.class);
            System.out.println(routeTable);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

}
