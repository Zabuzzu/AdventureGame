class ItemManager {
    public void giveHealthPotion(Player player) {
        System.out.println("Found a Health Potion!");
        player.gainExperience(10);
    }
}