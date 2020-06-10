/*
Skriv klassen Gjenstand med en konstruktør som gir verdier til alle instansvariablene,
og med metoder for å lese dem av. Du må selv velge hvor i programmet ditt verdiene til gjenstandene
skal leses inn fra filen «gjenstander.txt». Denne filen inneholder et navn og en verdi for
en gjenstand på hver linje. Om det skulle være for få linjer på filen til å lage alle gjenstandene du skal bruke,
kan du gjerne gjenbruke noen navn og verdier.
* */

import java.util.HashMap;

public class Gjenstand {
    //TODO
    //Maa fylles med gjenstander!
    protected HashMap<Integer,String> gjenstander = new HashMap<>();

    protected String navn;
    protected int verdi;

    public Gjenstand(String navn, int verdi){
        this.navn=navn;
        this.verdi=verdi;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getVerdi() {
        return verdi;
    }

    public void setVerdi(int verdi) {
        this.verdi = verdi;
    }

    //Returnerer true om det er nok gjentander igjen!
    public boolean nokGjenstand(int paakrevdGjenstand) throws IndexOutOfBoundsException{
        if(paakrevdGjenstand>gjenstander.size()){
            throw new IndexOutOfBoundsException();
        }else{
            return paakrevdGjenstand <= gjenstander.size();
        }
    }

    //TODO
    //Les fra fil gjenstander.txt fra en annen omraade f.e. naa vi danner spillet
    //da kan leses fra main prog.

}
