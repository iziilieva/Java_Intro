package seventhHomework;

import java.util.ArrayList;

public class Team {

    private String teamName;
    private ArrayList<Player> players = new ArrayList<>();

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        if(!teamName.trim().isEmpty()){
            this.teamName = teamName;
        }else {
            System.out.println("Team name should not be empty!");
        }
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void getTeamRating() {
        double totalScore = 0;
        double averageScore = 0;

        if (this.players.size() != 0) {

            for (int i = 0; i < this.players.size(); i++) {

                totalScore += this.players.get(i).overallSkillLevel();
            }
            averageScore = totalScore / this.players.size();
        }
        System.out.printf("%s - %.0f", teamName, averageScore);
    }

    public Team(String teamName) {
        this.setTeamName(teamName);
//        System.out.println("Team name is " + teamName);
    }

    public void addPlayer(Player player){
        if(player.isValid()){
            this.players.add(player);
        }
    }

    public void removePlayer(Player player){
        if (!this.players.contains(player)){
            System.out.printf("Player %s is not in %s team.\n", player.getPlayerName(), teamName);
        }else {
            this.players.remove(player);
        }
    }
}
