class Dragon implements Enemy {
    public void attack(Player player) {
        player.takeDamage(getDamage());
        System.out.println("Dragon breathes fire!");
    }
    public int getDamage() { return 50; }
    public String getName() { return "Dragon"; }
}
