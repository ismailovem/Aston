package com.aston.service;

import com.aston.entities.Account;
import com.aston.entities.User;
import com.aston.util.ReadFromWriteToUsersFileUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Registration {
    private HashMap<String, Double> hashMap;


    public Registration(HashMap<String, Double> hashMap) {
        this.hashMap = hashMap;
    }
    /*public Registration(User user) {
        this.user = user;
    }*/

    public void registrationMethod() { //HashMap<String,Double>
        Scanner scan = new Scanner(System.in);
        //Double bonus = 5000d;
        System.out.println("введите имя и фамилию");
        while (true) {
            //ввод имени
            String userName = scan.nextLine().trim();
            System.out.println("Это ваше имя? ---------" + userName);
            System.out.println("ведите 'да' если верно, иначе введите 'нет':");

            while (true) {
                //ввод да или нет
                String response = scan.nextLine().toLowerCase().trim();
                if (response.equalsIgnoreCase("да")) {
                    //проверяем возможно он есть в базе
                    //если он есть меняем респонз на false
                    User user = new User(userName);
                    System.out.println("ФИО подтверждено: " + user.getName());
                    user.setAmount(5000);
                    System.out.println("Поздравляем! Вам начислен бонус за регистрацию 5000 у.е.");
                    //Читаем из файла-базы всех сохраненных юзеров и записываем в коллекцию
                    ReadFromWriteToUsersFileUtil.readFromFileUsersMethod();

                    //если такого юзера нет то регистрируем -> пишем юзера в файл
                    ArrayList<User> userList = new ArrayList<>();
                    userList.add(user);
                    ReadFromWriteToUsersFileUtil.writeToFileUsersMethod(userList);


                    //!!!!!!!!!!!!!!!!!!!!!! - нужно запись в файл
                    //hashMap.put(user.getName(), bonus);
                    /*WriteToFile writeToFile = new WriteToFile(hashMap);
                    writeToFile.writeToFileMethod();*/
                    //return hashMap;
                } else if (response.equalsIgnoreCase("нет")) {
                    System.out.println("введите снова имя и фамилию");
                    break;
                } else if (response.equalsIgnoreCase("false")) {
                    System.out.println("Вы уже есть в базе, пожалуйста авторизуйтесь");
                } else {
                    System.out.println("Вы ввели не верное значение, попробуйте снова");
                }
            }
        }
    }
}

