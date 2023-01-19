public class God{
    // --- Properties ---
    private final String name;
    private double health;
    private double attack;
    private double specialAttack;
    private double defense;
    private double specialDefense;
    private double speed;
    private double mana;
    private final String pantheon;
    private final int id;
    // --- Properties ---

    // --- Constructor ---
    public God(String name, double health, double attack, double specialAttack, double defense, double specialDefense, double speed, double mana, String pantheon, int id) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.specialAttack = specialAttack;
        this.defense = defense;
        this.specialDefense = specialDefense;
        this.speed = speed;
        this.mana = mana;
        this.pantheon = pantheon;
        this.id = id;
    }
    // --- Constructor ---

    // --- Getters & Setters ---
    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public double getSpecialAttack() {
        return specialAttack;
    }

    public void setSpecialAttack(double specialAttack) {
        this.specialAttack = specialAttack;
    }

    public double getDefense() {
        return defense;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    public double getSpecialDefense() {
        return specialDefense;
    }

    public void setSpecialDefense(double specialDefense) {
        this.specialDefense = specialDefense;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getMana() {
        return mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }
    //----------
    // No setters because they are final
    public String getName() {
        return name;
    }

    public String getPantheon() {
        return pantheon;
    }

    public int getId() {
        return id;
    }
    // --- Getters & Setters ---
}
