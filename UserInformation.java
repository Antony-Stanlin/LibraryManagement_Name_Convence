package com.gnmuthu.newlibrarymanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInformation {

    List<User> users = new ArrayList<>();

    public List<User> getUsers() {
        return users;
    }

    void userEntry() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter User's Name");
        String userName = scanner.nextLine();
        System.out.println("Enter User's Gender");
        String gender = scanner.nextLine();
        System.out.println("Enter Department");
        String department = scanner.nextLine();
        System.out.println("Enter User Id");
        String userId = scanner.nextLine();

        User userEntry = new User(userName, gender, department, userId);
        users.add(userEntry);
        System.out.println("List of Available users");

        for (User user : users) {
            System.out.println(user.getUserName());
        }
       // scanner.close();
    }
}

class User {

    private String userName, gender, department, userId;

    User(String userName, String gender, String department, String userId) {
        this.userName = userName;
        this.gender = gender;
        this.department = department;
        this.userId = userId;
    }

   public String getDepartment() {
       return department;
   }
   public String getGender() {
       return gender;
   }
   public String getUserId() {
       return userId;
   }
   public String getUserName() {
       return userName;
   }

    
}