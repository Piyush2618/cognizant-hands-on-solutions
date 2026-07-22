package com.library;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.service.BookSer;

public class MainApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        BookSer libraryService =
                ctx.getBean("serviceBean", BookSer.class);

        System.out.println(" Library Management System ");

        libraryService.issueBook();

        System.out.println("DI completed successfully.");

        ctx.close();
    }
}