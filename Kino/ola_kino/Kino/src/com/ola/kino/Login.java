package com.ola.kino;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Login {

    public static int login_flag =0;
    public static String login;
    public static void log_In()
    {

        Scanner sc = new Scanner(System.in);
        String password;
        System.out.println("Podaj login :");
        login = sc.nextLine();
        System.out.println("Podaj hasło :");
        password = sc.nextLine();

        ArrayList<String> login_ar_temp = new ArrayList<String>(Registration.login_ar());
        ArrayList<String> password_ar_temp = new ArrayList<String>(Registration.password_ar());


        for(int i = 0; i< login_ar_temp.size(); i++)
            if((login.equals(login_ar_temp.get(i))==true)&&(password.equals(password_ar_temp.get(i))==true))
            {
                login_flag = 1;
            }
        System.out.println("Trwa logowanie...\n\n");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if(login_flag==1)
            System.out.println("***Jesteś zalogowany.***");
        else
            System.out.println("Nazwa użytkownika i hasło nie zgadzają się!!\nNajpierw zarejestruj swoje konto.\n\n ");
    }
    public static int checklogin()
    {
        return login_flag;
    }
    public static String login()
    {
        return login;
    }


}
