package com.aston.service;

import java.util.HashMap;
import java.util.Scanner;

public class Authorized {

    public String autorizationMethod(HashMap<String,Double> hashMap){
        Scanner scan = new Scanner(System.in);
        String fullName;

        System.out.println("введите ваше имя и фамилию");
        while(true){
            fullName = scan.nextLine().trim();
            if(hashMap.containsKey(fullName)) {
                System.out.println(hashMap.get(fullName));
                return hashMap.toString();
            }else{
                System.out.println("ваше имя не найдено в базе");
            }
        }
           /* String response = scan.nextLine();
            if (response.equalsIgnoreCase("да")) {
                System.out.println("ФИО подтверждено: " + fullName);
                System.out.println("Поздравляю! Вы получаете бонус за регистрацию 5000 у.е.");

                hashMap.put(fullName,bonus);
                return hashMap;
                //break; // Выходим из цикла, если имя подтверждено
            } else if (response.equalsIgnoreCase("нет")) {
                System.out.println("Попробуйте ввести его снова.");
            } else {
                System.out.println("Пожалуйста, введите 'да' или 'нет'.");
            }
        }*/

    }
}
