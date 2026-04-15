package com.fz.vibeverse;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fz.vibeverse.mapper")
public class VibeVerseApplication {

    public static void main(String[] args) {
        SpringApplication.run(VibeVerseApplication.class, args);
        System.out.println("启动成功！");
    }

}
