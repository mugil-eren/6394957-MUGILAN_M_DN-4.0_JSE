package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

    public static void main(String[] args) {
        System.out.println("Starting Application...");
        displayCountry();
    }

    public static void displayCountry() {
        try {
            ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
            Country country = (Country) context.getBean("country", Country.class);

            // Logging and fallback console output
            LOGGER.debug("Country : {}", country.toString());
            System.out.println("Country from XML: " + country.toString());

        } catch (Exception e) {
            System.out.println("An error occurred while loading country bean:");
            e.printStackTrace();
        }
    }
}
