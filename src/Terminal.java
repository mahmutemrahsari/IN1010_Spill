/*
* Klassen Terminal (6 poeng, MÅ SKRIVES) som kommuniserer med en menneskelig bruker
* med et kommandobasert grensesnitt i terminalvinduet ved hjelp av klassen Scanner
* fra Javas bibliotek (dette er slik du alltid har kommunisert med brukere før
* GUI ble introdusert). Klassen skal ha et Scanner-objekt som parameter til konstruktøren.
* */


import java.util.Scanner;

public class Terminal implements Brukergrensesnitt{
    private Scanner scanner;
    public Terminal(Scanner scanner){
        this.scanner=scanner;
    }


    @Override
    public void giStatus(String status) {

    }

    @Override
    public int beOmKommando(String spoersmaal, String[] alternativer) {
        return 0;
    }
}
