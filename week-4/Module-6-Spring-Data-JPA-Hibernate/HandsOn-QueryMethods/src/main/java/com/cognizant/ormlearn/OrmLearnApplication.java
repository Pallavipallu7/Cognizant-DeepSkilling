package com.cognizant.ormlearn;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;

@SpringBootApplication
public class OrmLearnApplication {

    private static CountryService countryService;

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(OrmLearnApplication.class, args);

        countryService = context.getBean(CountryService.class);

        testQueryMethods();
    }

    private static void testQueryMethods() {

        System.out.println("Countries containing 'ou'");
        List<Country> list1 = countryService.searchCountries("ou");
        list1.forEach(System.out::println);

        System.out.println("\nCountries containing 'ou' in ascending order");
        List<Country> list2 = countryService.searchCountriesSorted("ou");
        list2.forEach(System.out::println);

        System.out.println("\nCountries starting with 'Z'");
        List<Country> list3 = countryService.getCountriesStartingWith("Z");
        list3.forEach(System.out::println);
    }
}
