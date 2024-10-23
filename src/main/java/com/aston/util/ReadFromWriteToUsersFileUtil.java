package com.aston.util;

import com.aston.entities.User;
import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


public class ReadFromWriteToUsersFileUtil {
    private static final String usersPathFile = "src/main/resources/usersFile.txt";
    private HashMap<String, Double> hashMap;
    private ArrayList<User> usersListFromUsersFile = new ArrayList<>();
    private static User user = new User();

    private ReadFromWriteToUsersFileUtil() {  //(HashMap<String, Double> hashMap)
                                //this.hashMap = hashMap;
    }

    //метод для чтения user из файла
    public static void readFromFileUsersMethod(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(usersPathFile));
            String readerFromFile = "";
            //Set set = new HashSet();
            System.out.println(reader.readLine());
            while(reader.readLine() != null){
                // Разделяем строку на части по ";"
                String[] parts = readerFromFile.split(";");
                if (parts.length >= 3) { // Убедимся, что есть все необходимые данные
                    System.out.println(parts);
                    /*int id = Integer.valueOf(parts[0]); // Преобразуем ID в int
                    String name = parts[1]; // Имя
                    int amount = Integer.valueOf(parts[2]); // Зарплата
                    user.setId(id);
                    user.setUserName(name);
                    user.setAmount(amount);*/
                }
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                //System.out.println(user);
            }
            //!!!!!!!!!!!!!!!!! как вытащить юзера из файла
            System.out.println(readerFromFile);
            reader.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    //метод для записи user в файл
    public static void writeToFileUsersMethod(ArrayList<User> userArrayList) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(usersPathFile))) {
            User lastAddedUser = userArrayList.getLast();
            // System.out.println(lastAddedUser.toString());
            String value = lastAddedUser + ";";
            writer.write(value);
            writer.newLine();
            writer.close();
            /*for (HashMap.Entry<String, Double> entry : hashMap.entrySet()) {
                writer.write(entry.getKey() + "=" + entry.getValue() + ";" );
                writer.newLine(); // Переход на новую строку
            }
            System.out.println("HashMap записан в файл " + usersPathFile);*/
            waiting();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void waiting() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

