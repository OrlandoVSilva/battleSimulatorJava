package battleSimulatorPackage.players;

import battleSimulatorPackage.God;

import java.util.*;

public class Player {
    // --- Properties ---
    private List<God> listOfAllGods; // List of all the battleSimulatorPackage.gods;
    private List<God> selectedGods; // list for the selected battleSimulatorPackage.gods;
    // --- Properties ---

    // --- Constructor ---
    public Player(List<God> listOfAllGods){
        this.listOfAllGods = listOfAllGods;
        selectedGods = new ArrayList<>();
    }
    // --- Constructor ---

    // --- Getters & Setters ---
    public List<God> getSelectedGods() {
        return listOfAllGods;
    }
    // --- Getters & Setters ---

    // --- Methods ---
    public List<God> selectGodsForTeam(){
        Computer computer = new Computer();

        Scanner scanner = new Scanner(System.in);
        int chooseGodId;

        System.out.println("Please choose the 6 id's of the gods, you wish to pick:");
        while (selectedGods.size () < 6) {
            chooseGodId = scanner.nextInt();

            if (findGod (selectedGods, chooseGodId) >= 0) { // findGod 1
                System.out.println ("You already selected " + selectedGods.get(findGod (selectedGods, chooseGodId)).getName() + ".  Please select again.");
                continue;
            }

            int godSelectedIndex = findGod (listOfAllGods, chooseGodId);
            if (godSelectedIndex < 0) { // findGod -1
                System.out.println ("God " + chooseGodId + " is not available." + "  Please select again.");
                continue;
            }

            selectedGods.add (listOfAllGods.get(godSelectedIndex));
            System.out.println ("You selected " + selectedGods.get(findGod (selectedGods, chooseGodId)).getName() + ".");

            if(selectedGods.size() < 6){
                System.out.println ("You have selected " + selectedGods.size () + " gods. Please enter I.D. of next god:");
            } else {
                System.out.println ("You have selected " + selectedGods.size () + " gods.");
            }

            listOfAllGods.remove(godSelectedIndex);
            //System.out.println("List of all the battleSimulatorPackage.gods size: " + listOfAllGods.size());
            //System.out.println("List of selected battleSimulatorPackage.gods size: " + selectedGods.size());
        }
        computer.receivePlayerTeam(listOfAllGods, selectedGods);
        return selectedGods;
    }

    static public int findGod (List<God> godList, int targetGodId){
        for(int i = 0; i < godList.size(); i++) {
            if (targetGodId == godList.get(i).getId()) {
                //System.out.println("You have selected: " +  godList.get(i).getName() + ".");
                return i;
            }
        }
        return -1;
    }
    // --- Methods ---
}
