package battleSimulatorPackage;

import battleSimulatorPackage.players.Computer;
import battleSimulatorPackage.players.Player;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Launcher launch = new Launcher();
        Questionaire questionaire = new Questionaire();
        Computer computer = new Computer();

        List<God> loadedGods = launch.loadGods(); // launch.loadGods(); This return a list of all the battleSimulatorPackage.gods loaded;
        List<God> playerTeam = new ArrayList<>(), computerTeam = new ArrayList<>();

        if(questionaire.proceedToGodPick(loadedGods)){ // the questionnaire is set to always return true
            playerTeam = godSelection(loadedGods);
            computerTeam = computer.pickComputerTeam();
        }

        System.out.println();
        for (int i = 0; i < computerTeam.size(); i++){
            System.out.println("battleSimulatorPackage.players.Player battleSimulatorPackage.God name: " + playerTeam.get(i).getName());
        }
        System.out.println();
        for (int j = 0; j < computerTeam.size(); j++){
            System.out.println("CPU battleSimulatorPackage.God name: " + computerTeam.get(j).getName());
        }
    }

    private static List<God> godSelection(List<God> listOfloadedGods){
        Player player = new Player(listOfloadedGods);
        // This constructor, is created, so I can have access to the class's methods,
        // and sends a list of all the loaded battleSimulatorPackage.gods, so the played can choose;

        return player.selectGodsForTeam();
    }

}