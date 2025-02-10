class Orc implements Enemy {
    public void attack(Player player) {
        player.takeDamage(getDamage());
        System.out.println("Orc smashes with brute force!");
    }
    public int getDamage() { return 20; }
    public String getName() { return "Orc"; }
}
