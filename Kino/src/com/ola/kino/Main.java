package com.ola.kino;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws NumberFormatException, IOException
    {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
        int ch;

        do
        {
            System.out.println("\n\n-----------------------------------------------------------");
            System.out.println("-----------------------------------------------------------");
            System.out.println("\t\t\t\tWpisz swój wybór:");
            System.out.println("-----------------------------------------------------------\n\n");
            System.out.println("1.LOGOWANIE");
            System.out.println("2.REJESTRACJA");
            System.out.println("3.REZERWUJ BILETY");
            System.out.println("4.SZCZEGÓŁY REZERWACJI");
            System.out.println("5.WYJŚCIE\n\n\n");
            System.out.println("-----------------------------------------------------------");
            System.out.println("-----------------------------------------------------------");

            ch = Integer.parseInt(br.readLine());
            switch(ch)
            {
                case 1:
                     if(Login.checklogin()==1)
                {
                    System.out.println("Już jesteś zalogowany");
                    break;
                }
                else
                {
                    Login.log_In(); break;
                }
                case 2: Registration.register_Me(); break;
                case 3:
                    if(Login.checklogin()==2)
                    {
                        System.out.println("Zaloguj się najpierw, aby zarezerwować bilety.");
                        break;
                    }
                    else
                    {
                        Login.login_flag = 0;
                        bookTickets.movieSelect(); break;
                    }

                case 4: bookingDetails.generateDetails(); break;
                case 5:System.out.println("...Zakończ pomyślnie.");
                    System.exit(0); break;
                default:System.out.println("Nieprawidłowy wybór.");break;
            }
        }while(true);
    }

}
