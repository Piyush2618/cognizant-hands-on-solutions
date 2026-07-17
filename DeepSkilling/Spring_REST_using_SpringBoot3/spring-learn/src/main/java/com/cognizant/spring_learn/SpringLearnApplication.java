package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLearnApplication {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(SpringLearnApplication.class);

    public static void main(String[] args) {

        display();

    }

    public static void display() {

        ApplicationContext con =
                new ClassPathXmlApplicationContext("country.xml");

        Country coun =
                con.getBean("country", Country.class);

       System.out.println("Country : " + coun);

    }

}