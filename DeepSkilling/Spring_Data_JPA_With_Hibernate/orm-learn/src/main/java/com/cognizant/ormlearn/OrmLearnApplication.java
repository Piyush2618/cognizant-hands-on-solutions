package com.cognizant.ormlearn;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;

@SpringBootApplication
public class OrmLearnApplication {

    private static final Logger LOG = LoggerFactory.getLogger(OrmLearnApplication.class);

    private static CountryService countryService;

    public static void main(String[] args) {
        ApplicationContext con = SpringApplication.run(OrmLearnApplication.class, args);
        LOG.info("Inside main");
        countryService = con.getBean(CountryService.class);
        fetch();
    }

    private static void fetch() {
        LOG.info("Start");

        List<Country> countries = countryService.getAllCountries();

        LOG.debug("Number of countries retrieved: {}", countries.size());

for (Country country : countries) {
    LOG.debug("Country Details -> {}", country);
}

        LOG.info("End");
    }
}