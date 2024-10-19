package com.aston;

import com.aston.service.Authorized;
import com.aston.service.Greeting;
import com.aston.service.Registration;

import java.util.HashMap;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        HashMap<String,Double> hashMap = null;
        Authorized authorized = new Authorized();
        Registration registration = new Registration();
        Greeting greeting = new Greeting(hashMap,registration,authorized);
        greeting.greetingMetod();
    }
}


