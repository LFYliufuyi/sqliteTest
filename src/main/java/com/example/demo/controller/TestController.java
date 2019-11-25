package com.example.demo.controller;

import com.example.demo.db.SqliteHelper;
import com.example.demo.entity.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.teasoft.bee.osql.Suid;
import org.teasoft.honey.osql.core.BeeFactory;

import java.sql.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @PackageName: com.example.demo.controller
 * @ClassName: TestController
 * @Description: 测试
 * @Author: Raw
 * @Date: 2019/11/25
 */
@RestController
public class TestController {

    @GetMapping("/get")
    public Object index() {
        return "";

    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
//        Class.forName("org.sqlite.JDBC");
//        //建立一个数据库名zieckey.db的连接，如果不存在就在当前目录下创建之
//        Connection conn = DriverManager.getConnection("jdbc:sqlite:test.db");
//        Statement stat = conn.createStatement();
//        stat.executeUpdate( "create table person(name varchar(20), id int);" );//创建一个表，两列
//        conn.close(); //结束数据库的连接
                SqliteHelper sqliteHelper = new SqliteHelper("test.db");
        //insert
//        Map<String, Object> map = new HashMap<String, Object>();
//
//        map.put("id", 21);
//        map.put("name", "haha");
//        sqliteHelper.executeInsert("person", map);
//
//
//        // 取list
//        List<Person> demoList = sqliteHelper.executeQueryList("select id, name from person", Person.class);
//        System.out.println("打印列表********?");
//        for (Person result : demoList) {
//            System.out.println(result.getId());
//            System.out.println(result.getName());
//        }
//        System.out.println("打印列表********?");
//
//        //update
//        StringBuffer updSql = new StringBuffer();
//        updSql.append("UPDATE ");
//        updSql.append("person");
//        updSql.append(" SET ");
//        updSql.append(" name = '");
//        updSql.append("改个栗子");
//        updSql.append("'");
//        sqliteHelper.executeUpdate(updSql.toString());

        // 取单条
        List<Person> demoList = sqliteHelper.executeQueryList("select id, name from person where id = 21", Person.class);
        Person demoResult = demoList.get(0);
        System.out.println("打印单条********?");
        System.out.println(demoResult.getId());
        System.out.println(demoResult.getName());
        System.out.println("打印单条********?");


        sqliteHelper.destroyed();
    }

}
