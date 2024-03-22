package com.solt.componantscan;

import com.solt.componantscan.extraservice.ServiceB;
import com.solt.componantscan.service.ServiceA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ComponantScanApplication implements CommandLineRunner {
    @Autowired
    private ServiceA serviceA;
    @Autowired
    private ServiceB serviceB;

    public static void main(String[] args) {
        SpringApplication.run(ComponantScanApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(serviceA.sayHello());
    }
}
