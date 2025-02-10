class LevelManager {
    public void startLevel(Player player, CombatManager combat, ItemManager item, ScoreManager score) {
        Enemy goblin = new Goblin();
        Enemy orc = new Orc();
        Enemy dragon = new Dragon();

        combat.battle(player, goblin);
        combat.battle(player, orc);
        combat.battle(player, dragon);

        if (player.getHealth() > 0) {
            item.giveHealthPotion(player);
            score.addScore(100);
        }
    }
}