import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class TestMain {
    HashMap<String,String> gjenstanderHashMap = new HashMap<String, String>();
    public static void main(String[] args) {

        Gjenstand gjn = new Gjenstand();
        gjn.lesFraFil();
        System.out.println("Verdien av avis er: " + gjn.giGjenstandVerdi("avis"));
    }

    public void lesFraFil(){
        try{
            File minObj = new File("src/gjenstander.txt");
            Scanner minLeser = new Scanner(minObj);

            while (minLeser.hasNextLine()){
                String data = minLeser.nextLine();
                String navn = data.split(" ")[0];
                String verdi = data.split(" ")[1];
                gjenstanderHashMap.put(navn,verdi);
                System.out.println(data);
                System.out.println("Gjenstander hashMap size: " + gjenstanderHashMap.size());
            }

            minLeser.close();
        }catch (FileNotFoundException e){
            System.out.println("An error occurred!");
            e.printStackTrace();
        }
    }
}
