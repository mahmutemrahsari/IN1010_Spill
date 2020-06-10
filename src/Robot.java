/*
Klassen Robot (4 poeng) som simulerer en robot ved å trekke et tilfeldig valg blant alternativene.
Du kan skrive ut status og valg om du ønsker, for å gjøre det morsommere å senere spille mot roboter
(dette gir ikke ekstra poeng).
 */


import java.util.Random;
import java.util.Scanner;

public class Robot implements Brukergrensesnitt {

    public Robot(){

    }

    @Override
    public void giStatus(String status) {

    }

    @Override
    public int beOmKommando(String spoersmaal, String[] alternativer) {
        //Utveier??
        return (int) ((int) 10*Math.random());
    }
}
