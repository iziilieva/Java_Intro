package seventhHomework;

public class Player {

    private String playerName;
    private int playerEndurance = -1;
    private int playerSprint = -1;
    private int playerDribble = -1;
    private int playerPassing = -1;
    private int playerShooting = -1;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        if (!playerName.trim().isEmpty()) {
            this.playerName = playerName;
        } else {
            System.out.println("Player name should not be empty!");
        }
    }

    public int getPlayerEndurance() {
        return playerEndurance;
    }

    public void setPlayerEndurance(int playerEndurance) {
        if (playerEndurance >= 0 && playerEndurance <= 100) {
            this.playerEndurance = playerEndurance;
        } else {
            System.out.println("Endurance should be between 0 and 100");
        }
    }

    public int getPlayerSprint() {
        return playerSprint;
    }

    public void setPlayerSprint(int playerSprint) {
        if (playerSprint >= 0 && playerSprint <= 100) {
            this.playerSprint = playerSprint;
        } else {
            System.out.println("Sprint should be between 0 and 100");
        }
    }

    public int getPlayerDribble() {
        return playerDribble;
    }

    public void setPlayerDribble(int playerDribble) {
        if (playerDribble >= 0 && playerDribble <= 100) {
            this.playerDribble = playerDribble;
        } else {
            System.out.println("Dribble should be between 0 and 100");
        }
    }

    public int getPlayerPassing() {
        return playerPassing;
    }

    public void setPlayerPassing(int playerPassing) {
        if (playerPassing >= 0 && playerPassing <= 100) {
            this.playerPassing = playerPassing;
        } else {
            System.out.println("Passing should be between 0 and 100");
        }
    }

    public int getPlayerShooting() {
        return playerShooting;
    }

    public void setPlayerShooting(int playerShooting) {
        if (playerShooting >= 0 && playerShooting <= 100) {
            this.playerShooting = playerShooting;
        } else {
            System.out.println("Shooting should be between 0 and 100");
        }
    }

    public Player(String playerName, int playerEndurance, int playerSprint, int playerDribble, int playerPassing, int playerShooting) {
        this.setPlayerName(playerName);
        this.setPlayerEndurance(playerEndurance);
        this.setPlayerSprint(playerSprint);
        this.setPlayerDribble(playerDribble);
        this.setPlayerPassing(playerPassing);
        this.setPlayerShooting(playerShooting);

//        System.out.printf("%s overall skill level is %f \n", this.getPlayerName(), overallSkillLevel());

    }

    public double overallSkillLevel() {
        return (playerEndurance + playerSprint + playerDribble + playerPassing + playerShooting) / 5.00;
    }

    public boolean isValid(){
        return playerEndurance != -1 && playerSprint != -1 && playerDribble != -1 && playerPassing != -1 && playerShooting != -1;
    }

}
