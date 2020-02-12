package com.ola.kino;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Registration {
    public static ArrayList<String> login_ar = new ArrayList<String>();
    public static ArrayList<String> password_ar = new ArrayList<String>();
    public static ArrayList<String> firstName_ar = new ArrayList<String>();
    public static ArrayList<String> lastName_ar = new ArrayList<String>();
    public static ArrayList<String> age_ar = new ArrayList<String>();
    public static ArrayList<String> mail_ar = new ArrayList<String>();
    public static String login = null;
    public static String password = null;
    public static String firstName = null;
    public static String lastName = null;
    public static String age = null;
    public static String mail = null;

    public static void register_Me()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Wpisz swoj login :");
        login = sc.nextLine();
        login_ar.add(login);
        System.out.println("Wpisz swoje hasło :");
        password = sc.nextLine();
        password_ar.add(password);

        System.out.println("Wpisz swoje Imię :");
        firstName = sc.nextLine();
        firstName_ar.add(firstName);
        System.out.println("Wpisz swoje Nazwisko :");
        lastName = sc.nextLine();
        lastName_ar.add(lastName);
        System.out.println("Wpisz swoj wiek :");
        age = sc.nextLine();
        age_ar.add(age);
        System.out.println("Wpisz swoj mail :");
        mail = sc.nextLine();
        mail_ar.add(mail);
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("***Rejestracja powiodła się!***");



    }
    public static String login()
    {
        return login;
    }
    public static String lastName()
    {
        return lastName;
    }
    public static String firstName()
    {
        return firstName;
    }




    public static ArrayList<String> login_ar()
    {
        return login_ar;
    }
    public static ArrayList<String> password_ar()
    {
        return password_ar;
    }
    public static ArrayList<String> firstName_ar()
    {
        return firstName_ar;
    }
    public static ArrayList<String> lastName_ar(){  return lastName_ar;
    }
}
