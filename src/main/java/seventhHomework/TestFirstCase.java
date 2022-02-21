package seventhHomework;

public class TestFirstCase {

    public static void main(String[] args) {

        //first case

        Team Barcelona = new Team("Barcelona");
        Player Lionel_Messi = new Player("Lionel_Messi", 75,85,84,92,67);
        Player Gerard_Pique = new Player("Gerard_Pique", 95,82,82,89,68);

        Barcelona.addPlayer(Lionel_Messi);
        Barcelona.addPlayer(Gerard_Pique);
        Barcelona.removePlayer(Gerard_Pique);

        Barcelona.getTeamRating();

    }

}
