/*Skriv klassen Skattkiste som inneholder gjenstander. Du må selv velge hvordan skattkistene skal fylles opp
ved starten av spillet og hvor mange gjenstander det skal være i hver kiste. En skattkiste skal ha metoder
som gjør at en gjenstand kan tas ut av den og en gjenstand kan legges ned i den. Skattkisten er magisk,
derfor velges gjenstanden som tas ut tilfeldig blant de som er i kisten. Når en gjenstand legges ned av en spiller
(selges) returneres en pris (som spilleren får for gjenstanden), og siden skattkisten er magisk skal denne prisen
variere litt tilfeldig i forhold til den verdien som ligger i gjenstanden.
* */

public class Skattekiste {
    private Gjenstand gjenstand;

    public Skattekiste(Gjenstand gjenstand){
        this.gjenstand=gjenstand;
    }


}
