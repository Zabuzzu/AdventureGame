class Player {
    private String name;
    private int health;
    private int experience;

    public Player(String name, int health) {
        this.name = name;
        this.health = health;
        this.experience = 0;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health <= 0) {
            System.out.println(name + " has been defeated!");
        }
    }

    public void gainExperience(int xp) {
        experience += xp;
        System.out.println(name + " gained " + xp + " XP!");
    }

    public int getHealth() {
        return health;
    }
}