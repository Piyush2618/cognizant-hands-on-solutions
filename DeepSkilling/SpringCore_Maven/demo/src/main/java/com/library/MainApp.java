package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.repository.Bookrepo;
import com.library.service.Bookservice;

public class MainApp {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Bookservice ser = context.getBean("bookservice", Bookservice.class);
        Bookrepo repo = context.getBean("bookrepo", Bookrepo.class);

        ser.displaySer();
        repo.displayrepo();

        ((ClassPathXmlApplicationContext) context).close();
    }
}