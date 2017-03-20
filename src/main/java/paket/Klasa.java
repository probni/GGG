package paket;

import java.util.Scanner;


public class Klasa {

    public static void main(String[]args){


        Scanner unos = new Scanner(System.in);

        System.out.println("Unesite ime i prezime a zatim pritisnite enter");

        String imeIPrezime = unos.nextLine();

        System.out.println("Zdravo " + imeIPrezime + " Dobrodošli u svijet Jave!");
    }
}
