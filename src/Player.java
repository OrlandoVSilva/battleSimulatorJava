import java.util.*;

public class Player {
    // --- Properties ---
    private List<God> listOfAllGods; // List of all the gods;
    private List<God> selectedGods; // list for the selected gods;
    // --- Properties ---

    // --- Constructor ---
    Player(List<God> listOfAllGods){
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
    void selectGodsForTeam(){
        Scanner scanner = new Scanner(System.in);
        int chooseGodId;
        boolean isGodAvailable;

        /*
        char answerChar = 'n';

        while (answerChar == 'n'){
            answerChar = informationAboutGods();
            // Do you want to see information about any of the gods first?
            // y or n

            while(answerChar == 'y'){
                answerChar = informationAboutAnyOtherGods();
                // Which of the gods, do you want to see information of?
                // godId
                // Do you want to see information about any other gods?
                // y or n
            }
            answerChar = proceedWithGodPick();
            // Do you want to proceed with the God pick?
            // y or n
        }

        System.out.println();
        */

        System.out.println("Please choose the 6 id's of the gods, you wish to pick:");
        for(int i = 0; i <= 5; i++){
            chooseGodId = scanner.nextInt();

            for(int j = 0; j < listOfAllGods.size(); j++){
                if(chooseGodId == listOfAllGods.get(j).getId()){
                    isGodAvailable = true;
                    selectedGods.add(listOfAllGods.get(j));
                    listOfAllGods.remove(j);
                } else {
                    isGodAvailable = false;
                    while (!isGodAvailable){
                        System.out.println("Please pick another one");
                        chooseGodId = scanner.nextInt();

                        if(chooseGodId == listOfAllGods.get(j).getId()) {
                            isGodAvailable = true;
                            selectedGods.add(listOfAllGods.get(j));
                            listOfAllGods.remove(j);
                        }
                    }
                }
            }
        }
    }

    char informationAboutGods(){
        Scanner scanner = new Scanner(System.in);
        char answerChar = 'n';
        //-----------

        System.out.println("This is a list, of all the selectable gods: ");
        System.out.println();

        for (int i = 0; i < listOfAllGods.size(); i++){
            System.out.println(listOfAllGods.get(i).getName() + " = " + "Id: " + listOfAllGods.get(i).getId());
        }
        System.out.println();

        System.out.println("Do you want to see information about any of the gods first?");
        System.out.println("[y] or [n]");
        answerChar = scanner.next().charAt(0);

        return answerChar;
    }
    char informationAboutAnyOtherGods(){
        Scanner scanner = new Scanner(System.in);
        char answerChar = 'n';
        int answerInt;
        //------------

        System.out.println();
        System.out.println("Which of the gods, do you want to see information of?");
        System.out.println("Please input it's id number: ");
        answerInt = scanner.nextInt();

        System.out.println();
        System.out.println("Display god information here!");
        System.out.println();

        System.out.println("Do you want to see information about any other gods?");
        System.out.println("[y] or [n]");
        answerChar = scanner.next().charAt(0);

        return answerChar;
    }
    char proceedWithGodPick(){
        Scanner scanner = new Scanner(System.in);
        char answerChar = 'n';
        //----------

        System.out.println();
        System.out.println("Do you want to proceed with the God pick?");
        System.out.println("[y] or [n]");
        answerChar = scanner.next().charAt(0);

        return answerChar;
    }
    // --- Methods ---
}
