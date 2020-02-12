package com.ola.kino;


import java.io.*;


public class bookingDetails {

    public static void generateDetails() throws FileNotFoundException {

        PrintStream o = new PrintStream(new File("C:\\bilet.txt"));

        PrintStream console = System.out;


        if(Login.login()==null||bookTickets.movie_choice()==null||bookTickets.theater_choice()==null)
        {
            System.out.println("Brak rezerwacji. \t Bilet nie został zakupiony !");
        }
        else
        {

            System.setOut(o);
            System.out.println("================================================ ");
            System.out.println("\t\t\tTwoje dane rezerwacji :");
            System.out.println("================================================ ");
            System.out.println("IMIĘ :\t\t\t\t" + Registration.firstName());
            System.out.println("Nazwisko :\t\t\t" + Registration.lastName());
            System.out.println("FILM ZAREZERWOWANY : " + bookTickets.movie_choice());
            System.out.println("TEATR :\t\t\t\t" + bookTickets.theater_choice());
            System.out.println("NUMER MIEJSCA :\t" + bookTickets.ticket_qty());
            System.out.println("__________________________________________________ ");
            System.out.println("\t\t\t\tCAŁKOWITA KWOTA :");
            System.out.println("\t\t\t\t\t"+ bookTickets.amount());

            System.setOut(console);
            System.out.println("________________________________________________ ");
            System.out.println("\t\t\tTwoje dane rezerwacji :");
            System.out.println("________________________________________________ ");
            System.out.println("IMIĘ :\t\t\t\t\t" + Registration.firstName());
            System.out.println("Nazwisko :\t\t\t\t" + Registration.lastName());
            System.out.println("FILM ZAREZERWOWANY :\t" + bookTickets.movie_choice());
            System.out.println("TEATR :\t\t\t\t\t" + bookTickets.theater_choice());
            System.out.println("NUMER MIEJSCA : \t\t" + bookTickets.ticket_qty());
            System.out.println("________________________________________________ ");
            System.out.println("\t\t\t\tCAŁKOWITA KWOTA :");
            System.out.println("\t\t\t\t\t"+ bookTickets.amount()+"\tzł");
    }
    }

}
