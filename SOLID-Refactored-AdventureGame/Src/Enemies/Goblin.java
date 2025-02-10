class Goblin implements Enemy {
    public void attack(Player player) {
        player.takeDamage(getDamage());
        System.out.println("Goblin attacks!");
    }
    public int getDamage() { return 10; }
    public String getName() { return "Goblin"; }
}