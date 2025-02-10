class HealthElixir {
    public void use(Player player) {
        System.out.println("You used a Health Elixir! Health restored.");
        player.gainExperience(15);
    }
}