package com.aston.service;

import com.aston.entities.User;

import java.util.HashMap;
import java.util.Scanner;

public class Greeting {
    private HashMap<String,Double> hashMap;
    private Registration registration;
    private Authorized authorized;
    //private User user;


    private void waiting() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Greeting(Registration registration) {
        this.registration = registration;
    }

    public Greeting(HashMap<String, Double> hashMap, Registration registration, Authorized authorized) {
        this.hashMap = hashMap;
        this.registration = registration;
        this.authorized = authorized;
    }

    public void greetingMetod(){
        Scanner scanner = new Scanner(System.in);
        String response;
        //выбираем варианты
        System.out.println("Добрый день!");
        boolean flag = true;
        while(flag) {
            System.out.println("Выберите нужный вариант" +
                    "\n-------------------------------------------------------" +
                    "\nвведите 1, если хотите зарегистрироваться в системе" +
                    "\nвведите 2, если уже регистрировалиь" +
                    "\nвведите 0, чтобы завершить работу программы");
            response = scanner.nextLine();
            switch (response) {
                case "0":
                    System.out.println("Благодарим Вас за визит. До свидания");
                    flag = false;
                    break;
                case "1":
                    System.out.println("Запускаю процесс регистрации");
                    waiting();
                    registration.registrationMethod();
                    //hashMap = registration.registrationMethod();
                    break;
                case "2":
                    System.out.println("Пожалуйста авторизуйтесь:");
                    //запись коллекции должна идти в файл
                    //и после того считываться из файла и идти в авторизацию
                    //authorized.autorizationMethod();
                    waiting();
                    break;
                default:
                    System.out.println("Неизвестная команда. Попробуйте '1', '2' или '0'.");
            }//switch
            //System.out.println(hashMap);
        }//while
    }
}
