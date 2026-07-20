package com.cognizant.spring_learn.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.spring_learn.Country;

@RestController
public class CountryController {

    @RequestMapping("/country")
    public Country getCountryIndia() {

        ClassPathXmlApplicationContext cont =
                new ClassPathXmlApplicationContext("country.xml");

        Country coun = cont.getBean("country", Country.class);

        cont.close();

        return coun;
    }
}