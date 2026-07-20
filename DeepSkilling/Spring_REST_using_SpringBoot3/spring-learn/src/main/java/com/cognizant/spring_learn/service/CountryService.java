package com.cognizant.spring_learn.service;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.spring_learn.Country;

@Service
public class CountryService {

    public Country getCountry(String code) {

        ClassPathXmlApplicationContext cont =
                new ClassPathXmlApplicationContext("country.xml");

        List<Country> countryList =
                cont.getBean("countryList", List.class);

        for (Country coun : countryList) {
            if (coun.getCode().equalsIgnoreCase(code)) {
                cont.close();
                return coun;
            }
        }

        cont.close();
        return null;
    }
}