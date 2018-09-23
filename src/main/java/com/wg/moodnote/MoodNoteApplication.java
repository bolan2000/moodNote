package com.wg.moodnote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wanggang
 */
@SpringBootApplication
@RestController
public class MoodNoteApplication {

    public static void main(String[] args) {
        SpringApplication.run(MoodNoteApplication.class, args);
    }

    @RequestMapping("/")
    public String test() {
        return "hello mood note";
    }

}
