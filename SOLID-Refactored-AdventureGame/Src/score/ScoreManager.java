class ScoreManager {
    private int score = 0;
    public void addScore(int points) {
        score += points;
        System.out.println("Score: " + score);
    }
}