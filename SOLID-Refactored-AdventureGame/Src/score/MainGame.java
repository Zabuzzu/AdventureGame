public class MainGame {
    public static void main(String[] args) {
        Player player = new Player("Hero", 100);
        LevelManager levelManager = new LevelManager();
        CombatManager combatManager = new CombatManager();
        ItemManager itemManager = new ItemManager();
        ScoreManager scoreManager = new ScoreManager();

        System.out.println("Welcome to the adventure!");
        levelManager.startLevel(player, combatManager, itemManager, scoreManager);
    }
}