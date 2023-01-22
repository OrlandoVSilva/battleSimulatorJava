package battleSimulatorPackage.players;

import battleSimulatorPackage.God;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Computer {
    private static List<God> remainingGodsList;
    private static List<God> playerSelectedGodsList;
    private static List<God> computerSelectedTeam;

    void receivePlayerTeam(List<God> remainingGodsList, List<God> playerSelectedGodsList){
        computerSelectedTeam = new ArrayList<>();

        this.remainingGodsList = remainingGodsList;
        this.playerSelectedGodsList = playerSelectedGodsList;

        //System.out.println("Remaining Gods List: " + remainingGodsList.size());
        //System.out.println("Selected Gods List: " + playerSelectedGodsList.size());

        //pickComputerTeam();
    }

    public List<God> pickComputerTeam(){
        Random random = new Random();

        for (int i = 0; i < 6; i++){
            int rand = random.nextInt(remainingGodsList.size());
            computerSelectedTeam.add(remainingGodsList.get(rand));
            remainingGodsList.remove(rand);
        }

        return computerSelectedTeam;
    }
}
