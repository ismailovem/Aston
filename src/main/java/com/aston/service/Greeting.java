package com.aston.service;

import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class Greeting {
    private HashMap<String,Double> hashMap;
    private Registration registration;
    private Authorized authorized;

    private void waiting() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Greeting(HashMap<String, Double> hashMap, Registration registration, Authorized authorized) {
        this.hashMap = hashMap;
        this.registration = registration;
        this.authorized = authorized;
    }

    public void greetingMetod(){
        Scanner scanner = new Scanner(System.in);
        String line;
        boolean flag = true;
        while(flag) {
            System.out.println("Добрый день!\n " +
                    "Выберите нужный вариант.\n" +
                    "Напишите 1, если Вы хотите зарегистрироваться\n" +
                    "Нажмите 2, если Вы уже наш клиент\n" +
                    "Нажмите 0, чтобы завершить работу программы");
            line = scanner.nextLine();
            switch (line) {
                case "0":
                    System.out.println(line);
                    System.out.println("Благодарим за визит. До свидания");
                    break;
                case "1":
                    System.out.println("Запускаю процесс регистрации");
                    waiting();
                    hashMap = registration.registrationMethod();
                    flag = false;
                    break;
                case "2":
                    System.out.println("Пожалуйста авторизуйтесь:");
                    //запись коллекции должна идти в файл
                    //и после того считываться из файла и идти в авторизацию
                    authorized.autorizationMethod(hashMap);
                    waiting();
                    break;
                default:
                    System.out.println("Неизвестная команда. Попробуйте '1', '2' или '0'.");
                    break;
            }//switch
        scanner.close();
        }//while
    System.out.println(hashMap);
    }
}
