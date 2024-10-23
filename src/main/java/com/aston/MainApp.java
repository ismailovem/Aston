package com.aston;

import com.aston.entities.Account;
import com.aston.entities.User;
import com.aston.service.Authorized;
import com.aston.service.Greeting;
import com.aston.service.Registration;

import java.util.HashMap;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        HashMap<String,Double> hashMap = new HashMap<>();
        //Authorized authorized = new Authorized(hashMap);
        Registration registration = new Registration(hashMap);
        Greeting greeting = new Greeting(registration);//(hashMap,,authorized);
        greeting.greetingMetod();

        // /*User roman = new User("Roman");
        //        roman.setAmount(100);
        //        System.out.println(roman);
        //
        //        User ivan = new User("Ivan");
        //        System.out.println(ivan);*/
    }
}


