

package com.ola.kino;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class bookTickets {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLACK = "\u001B[0m";

    public static int ch2;
    public static int ch4;

    public static int ch3;
    public static int amount;

    public static int ticket_qty;
    private static void printSeats(char[][] seats) {
        for (int i = 0; i < seats.length; i++) {
            System.out.println((i + 1) + "   " +
                    seats[i][0] + "\t"+seats[i][1] + "\t"+ seats[i][2] + " " + "\t"+
                    seats[i][3] +  "\t"+seats[i][4] +  "\t"+seats[i][5]);
        }
        System.out.println("Wybierz rzond i miejsce miejsce.");
    }
    //    public static int available_tickets = 25;
    public static void movieSelect() throws NumberFormatException, IOException
    {

        Scanner sc = new Scanner(System.in);
        BufferedReader br2 = new  BufferedReader(new InputStreamReader(System.in));

        System.out.println("\t\t\t::::KINO::::\n\n");
        System.out.println("1. POKÉMON DETEKTYW PIKACHU\t\t\t\t\t");
        System.out.println("2. ALADYN\t\t\t\t\t");
        System.out.println("3. ROCKETMAN\t\t");
        System.out.println("4. AGENT KOT\t\t\t\t\t");
        System.out.println("5. JOHN WICK 3\t\t\t");
        System.out.println("\n***Wybierz film.***");
        ch2 = Integer.parseInt(br2.readLine());
        if(ch2>5)
        {
            System.out.println("Nieprawidłowy wybór!");
        }
        else
        {
            Theater(ch2);
        }
    }
    public static void Theater(int ch2)
    {
        System.out.println("\t\t\t::::TEATR::::\n\n");
        System.out.println("1. Multikino");
        System.out.println("2. OH-KINO");
        System.out.println("3. Cinema City");
        System.out.println("4. Kino Mikro");
        System.out.println("5. Lend City");
        Scanner sc2 = new Scanner(System.in);
        System.out.println("\n***Wybierz teatr.***");
        ch3 = sc2.nextInt();
        if(ch3>5)
        {
            System.out.println("Nieprawidłowy wybór");
        }
        else
        {
            ulga(ch2);
        }
    }

    public static void ulga(int ch2)
    {
        System.out.println("\t\t\t::::Wybież Bilet::::\n\n");
        System.out.println("\t\t:Rodaj Biletów:\t\t\t:Cena::\n\n");

        System.out.println("1.\t\t\tULGOWY\t\t\t\t20 zł");
        System.out.println("2.\t\t\tNORMALNY\t\t\t40 zł");

        Scanner sc2 = new Scanner(System.in);
        System.out.println("\n***Wybierz***");
        ch4 = sc2.nextInt();
        if(ch4>1)
        {
            normalTickets();
        }
        else
        {
            studiedTickets();

        }
    }
    public static void normalTickets()
    {

        char[][] seats = new char[8][6];
        ArrayList<String> reservedSeats = new ArrayList<>();

        for (int i=0;i<8;i++){
            seats[i][0] = '1';
            seats[i][1] = '2';
            seats[i][2] = '3';
            seats[i][3] = '4';
            seats[i][4] = '5';
            seats[i][5] = '6';
        }
        Scanner console = new Scanner(System.in);
        int filled = 0;
        printSeats(seats);

        int prices= 40;

        amount = prices;

        String input = console.nextLine();

        while ((filled <48) &&(input.length() >0)) {
            int row = input.charAt(0) - '1';
            int col = input.charAt(1) - '1';
            if (row<0 || row>8 || col<0 || col>6) {
                System.out.println("Mejsce jest zajęnte , " +
                        "lub podane nie prawidlowy nymer miejsca .");
                input = console.nextLine();

                int left_tickets = ticket_qty;
            } else {
                if (seats[row][col] != 'X') {
                    seats[row][col] = 'X';
                    filled++;
                    System.out.println(".....Wybrany miejsce " + input + " .");
                }
                if (seats[row][col] != 'X') {
                    seats[row][col] = 'X';
                    filled++;
                }

            }try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("***Rezerwacja zakończona sukcesem !!***");
            System.exit(0);
        }






//        if(available_tickets < ticket_qty)
//        {
//            System.out.println("Przepraszamy, ale nie ma dostępnych biletów");
//            System.exit(0);
//        }




    }

    public static void studiedTickets()
    {System.out.println("Wiebież   :");
        Scanner sc = new Scanner(System.in);

        int prices= 20;


        System.out.println("Wiebież miejsce :");
        System.out.println("                                      ");
        System.out.println(ANSI_BLACK + "----"+ANSI_GREEN+"|1||2||3||4||5||6||7||8||9|"+ANSI_BLACK+"----");
        System.out.println( ANSI_BLACK+"-----------------------------------");
        System.out.println(ANSI_GREEN+"--|10|11||12||13||14||15||16||8|"+ANSI_BLACK+"--");
        System.out.println(ANSI_GREEN+"-----------------------------------");
        System.out.println(ANSI_GREEN+"|17||18||19||20||21||22||23||24||25|"+ANSI_BLACK);
        System.out.println("-----------------------------------"+ ANSI_BLACK);
        System.out.println(ANSI_RED +  "Ξ"+"  "+ANSI_RED+ANSI_BLACK+"Zajęte miejsce");
        System.out.println(ANSI_GREEN +"Ξ"+"  "+ANSI_GREEN+"Wolne miejsce"+ ANSI_BLACK);

        System.out.println("Wybież miejsce :");
        ticket_qty =sc.nextInt();
        if(ticket_qty < ticket_qty)
        {
            System.out.println("Przepraszamy, ale nie ma dostępnych biletów");
            System.exit(0);
        }

        int left_tickets = ticket_qty- ticket_qty;

        amount = prices;

        System.out.println(".....Wybrany numer bileta  " + ticket_qty + ".");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        System.out.println("***Rezerwacja zakończona sukcesem !!***");



    }

    public static String movie_choice()
    {
        String mov = null;
        switch(ch2)
        {
            case 1: mov = "POKÉMON DETEKTYW PIKACHU" ;break;
            case 2: mov = "ALADYN" ;break;
            case 3: mov = "ROCKETMAN" ;break;
            case 4: mov = "AGENT KOT" ;break;
            case 5: mov = "JOHN WICK 3" ;break;
        }
        return mov;
    }
    public static String theater_choice()
    {
        String theat = null;
        switch(ch3)
        {
            case 1: theat = "Multikino" ;break;
            case 2: theat = "OH-KINO" ;break;
            case 3: theat = "Cinema City" ;break;
            case 4: theat = "Kino Mikro" ;break;
            case 5: theat = "Lend City" ;break;

        }
        return theat;
    }
    public static int amount()
    {
        return amount;
    }

    public static int ticket_qty()
    {
        return ticket_qty;
    }



}

