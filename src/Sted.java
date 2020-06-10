/*
Skriv klassen Sted. Konstruktøren til Sted skal ta en parameter String med beskrivelse av stedet
(som i filen «steder.txt»). Klassen trenger en metode som plasserer en skattkiste med gjenstander
på stedet og en metode som returnerer en referanse til skattkisten til en spiller
(slik at spilleren kan bruke skattkisten). Objekter av klassen Sted har bare en utgang i oppgave 2,
men det må finnes en metode for å gå videre, som returnerer en referanse til neste sted.
 */

public class Sted {
    protected String steder;
    public Sted(String steder){
        this.steder=steder;
    }
}
