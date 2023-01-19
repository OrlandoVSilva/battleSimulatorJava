import java.util.List;

public class Main {
    public static void main(String[] args) {
        Launcher launch = new Launcher();
        godSelection(launch.loadGods()); // launch.loadGods(); This return a list of all the gods loaded;
    }

    private static void godSelection(List<God> listOfloadedGods){
        Player player = new Player(listOfloadedGods);
        // This constructor, is created, so I can have access to the class's methods,
        // and sends a list of all the loaded gods, so the played can choose;

        player.selectGodsForTeam();
    }
}
