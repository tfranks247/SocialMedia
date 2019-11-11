package com.company;

import java.util.Scanner;

public class Facebook extends SocialMedia {

    public void facebookLogin(){

        String name;
        String password;

        Scanner key = new Scanner(System.in);

        System.out.println("Enter your username: ");
        name = key.nextLine();

        System.out.println("Enter your password: ");
        password = key.nextLine();


    }

}
