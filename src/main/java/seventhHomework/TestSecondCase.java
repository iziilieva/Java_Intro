package seventhHomework;

public class TestSecondCase {

    public static void main(String[] args) {

        //second case

        Team Barcelona = new Team("Barcelona");
        Player Lionel_Messi = new Player("Lionel_Messi", 75,85,84,92,67);
        Player Gerard_Pique = new Player("Gerard_Pique", 195,82,82,89,68);


        Barcelona.addPlayer(Lionel_Messi);
        Barcelona.addPlayer(Gerard_Pique);
        Barcelona.removePlayer(Gerard_Pique);

        Barcelona.getTeamRating();
    }
}
