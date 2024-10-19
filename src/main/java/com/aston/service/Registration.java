package com.aston.service;

import java.util.HashMap;
import java.util.Scanner;

public class Registration {

    public HashMap<String,Double> registrationMethod() {
        HashMap<String, Double> hashMap = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        Double bonus = 5000d;
        String fullName;
        System.out.println("введите имя и фамилию");
        while (true) {
            //ввод имени
            fullName = scan.nextLine().trim();
            System.out.println("Это ваше имя? ---------" + fullName);
            System.out.println("ведите 'да' если верно, иначе введите 'нет':");

            while (true) {
                //ввод да или нет
                String response = scan.nextLine().toLowerCase().trim();
                if (response.equalsIgnoreCase("да")) {
                    System.out.println("ФИО подтверждено: " + fullName);
                    System.out.println("Поздравляю! Вы получаете бонус за регистрацию 5000 у.е.");
                    hashMap.put(fullName, bonus);
                    return hashMap;
                } else if (response.equalsIgnoreCase("нет")) {
                    System.out.println("введите снова имя и фамилию");
                    break;
                } else {
                    System.out.println("Вы ввели не верное значение, попробуйте снова");
                }
            }
        }
    }

    private void waiting(){
        try {
            // Ожидание 1000 миллисекунд
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

