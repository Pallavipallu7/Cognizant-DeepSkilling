package com.cognizant.ormlearn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    @Autowired
    private CountryService service;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    public void run(String... args) {

        System.out.println("Find Country:");
        System.out.println(service.getCountry("IN"));

        Country country = new Country("NP", "Nepal");
        service.addCountry(country);

        country.setName("Federal Democratic Republic of Nepal");
        service.updateCountry(country);

        List<Country> list = service.searchCountry("Ind");

        System.out.println("Search Result:");
        list.forEach(System.out::println);

        service.deleteCountry("NP");

        System.out.println("Country Deleted Successfully");
    }
}
