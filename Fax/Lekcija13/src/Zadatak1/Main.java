package Zadatak1;

import Zadatak1.Osoba;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        Scanner unos = new Scanner(System.in);
        System.out.println("Unesi ime");
        String ime = unos.nextLine();
        System.out.println("Unesi prezime");
        String prezime = unos.nextLine();
        System.out.println("Unesi godine");
        int godine = unos.nextInt();

        Osoba osoba = new Osoba(ime, prezime, godine);
        if (osoba.isPunoletan()) {

            System.out.println("Punoletan");
        } else {
            System.out.println("Nije punoletan.");
        }
    }
}
