package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootTest
class DemoApplicationTests {


    @Autowired
    private MongoTemplate mongoTemplate;

    @Test
    void contextLoads() {
        students student = new students();
        student.setName("wzy");
        student.setPsw("222");
        student.setAge(22);

        mongoTemplate.insert(student,"names");

    }

}
