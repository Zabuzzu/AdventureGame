class CombatManager {
    public void battle(Player player, Enemy enemy) {
        System.out.println("Encounter! A " + enemy.getName() + " appears!");
        enemy.attack(player);
        if (player.getHealth() > 0) {
            System.out.println(player.getHealth() + " HP remaining");
        }
    }
}