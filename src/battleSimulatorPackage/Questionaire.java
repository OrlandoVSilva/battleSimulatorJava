package battleSimulatorPackage;

import java.util.List;
import java.util.Scanner;

public class Questionaire {

    boolean proceedToGodPick(List<God> listOfAllGods){
        char answerChar = 'n';
        boolean proceedWithGodPick = false;

        while (answerChar == 'n'){
            answerChar = informationAboutGods(listOfAllGods);
            // Do you want to see information about any of the battleSimulatorPackage.gods first?
            // y or n

            while(answerChar == 'y'){
                answerChar = informationAboutAnyOtherGods();
                // Which of the battleSimulatorPackage.gods, do you want to see information of?
                // godId
                // Do you want to see information about any other battleSimulatorPackage.gods?
                // y or n
            }
            answerChar = finishQuestionaire();
            // Do you want to proceed with the battleSimulatorPackage.God pick?
            // y or n
        }
        if(answerChar == 'y'){
            proceedWithGodPick = true;
        }
        return proceedWithGodPick;
    }

    char informationAboutGods(List<God> listOfAllGods){
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
    char finishQuestionaire(){
        Scanner scanner = new Scanner(System.in);
        char answerChar = 'n';
        //----------

        System.out.println();
        System.out.println("Do you want to proceed with the God pick?");
        System.out.println("[y] or [n]");
        answerChar = scanner.next().charAt(0);

        return answerChar;
    }
}
