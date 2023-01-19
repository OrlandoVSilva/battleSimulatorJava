import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Launcher {
    private List<God> godCollection;

    public Launcher(){
        godCollection = new ArrayList<>();
    }

    List<God> loadGods(){ // load all gods from Json file into list
        String strJson = getJSONFromFile("C:\\Users\\OrlandoVSilva\\Desktop\\JavaBattleSimulator\\battlesimulator\\src\\projectStructure\\gods.json");

        // Try-catch block
        try {
            JSONParser parser = new JSONParser();
            Object object = parser.parse(strJson); // converting the contents of the file into an object
            JSONObject mainJsonObject = (JSONObject) object; // converting the object into a json object
            //-------------------
            JSONArray jsonArrayGods = (JSONArray) mainJsonObject.get("gods");
            //System.out.println("Gods: ");

            for(int i = 0; i < jsonArrayGods.size(); i++){
                JSONObject jsonGodsData = (JSONObject) jsonArrayGods.get(i);

                String godName = (String) jsonGodsData.get("name");
                //System.out.println("Name: " + godName);

                double godHealth = (double) jsonGodsData.get("health");
                //System.out.println("Health: " + godHealth);

                double godAttack = (double) jsonGodsData.get("attack");
                //System.out.println("Attack: " + godAttack);

                double godSpecialAttack = (double) jsonGodsData.get("specialAttack");
                //System.out.println("Special Attack: " + godSpecialAttack);

                double godDefense = (double) jsonGodsData.get("defense");
                //System.out.println("Defense: " + godDefense);

                double godSpecialDefence = (double) jsonGodsData.get("specialDefense");
                //System.out.println("Special Defence: " + godSpecialDefence);

                double godSpeed = (double) jsonGodsData.get("speed");
                //System.out.println("Speed: " + godSpeed);

                double godMana = (double) jsonGodsData.get("mana");
                //System.out.println("Mana: " + godMana);

                String godPantheon = (String) jsonGodsData.get("pantheon");
                //System.out.println("Pantheon: " + godPantheon);

                long godId = (long) jsonGodsData.get("id");
                int newGodId = (int) godId;
                //System.out.println("Id: " + newGodId);

                godCollection.add(new God(godName, godHealth, godAttack, godSpecialAttack, godDefense, godSpecialDefence, godSpeed, godMana, godPantheon, newGodId));
                //System.out.println();
            }

        } catch (Exception ex){
            ex.printStackTrace();
        }
        // Try-catch block

        //System.out.println("Size: " + godCollection.size());
        return godCollection;
    }

    public static String getJSONFromFile(String filename) { // requires file name
        String jsonText = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filename)); // read the file

            String line; // read the file line by line
            while ((line = bufferedReader.readLine()) != null) {
                jsonText += line + "\n"; // store json dat into "jsonText" variable
            }

            bufferedReader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return jsonText;
    }
}
