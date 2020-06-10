/*Skriv klassen Skattkiste som inneholder gjenstander. Du må selv velge hvordan skattkistene skal fylles opp
ved starten av spillet og hvor mange gjenstander det skal være i hver kiste. En skattkiste skal ha metoder
som gjør at en gjenstand kan tas ut av den og en gjenstand kan legges ned i den. Skattkisten er magisk,
derfor velges gjenstanden som tas ut tilfeldig blant de som er i kisten. Når en gjenstand legges ned av en spiller
(selges) returneres en pris (som spilleren får for gjenstanden), og siden skattkisten er magisk skal denne prisen
variere litt tilfeldig i forhold til den verdien som ligger i gjenstanden.
* */

import java.util.ArrayList;

public class Skattkiste {
    protected ArrayList<Gjenstand> skattekiste = new ArrayList<>();

    //Naar en gjenstand legges ned av en spiller
    //(selges) returneres en pris (som spilleren faar for gjenstanden),
    // og siden skattkisten er magisk skal denne prisen
    //variere litt tilfeldig i forhold til den verdien som ligger i gjenstanden.
    public int settInn(Gjenstand gjenstand){ //Setter inn gjenstander i skattksite (selges av spilleren)
        skattekiste.add(gjenstand);
        return (int) (gjenstand.verdi - Math.random()*(gjenstand.verdi));
    }

    //Tas ut tilfeldig gjenstand blant de som er i kisten
    public void taUt(){
        //Danner en value mellom null og size of arrayet
       int tattUt = (int) (Math.random() * (skattekiste.size() + 1));
        skattekiste.remove(tattUt);
    }

    public int getAntallGjenstander(){
        return this.skattekiste.size();
    }

    //TODO
    //Legg solgt gjenstand verdien til spilleren konto!


}
