class Team {
    private String teamName;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    class Player {
        private String playerName;

        public Player(String playerName) {
            this.playerName = playerName;
        }

        public void displayInfo() {
            System.out.println("Player: " + playerName + " (Team: " + teamName + ")");
        }
    }

    public Player addPlayer(String playerName) {
        return new Player(playerName);
    }
}

public class TeamApp {
    public static void main(String[] args) {
        Team myTeam = new Team("Blue Team");

       
        Team.Player player1 = myTeam.addPlayer("Sakthi");
        Team.Player player2 = myTeam.addPlayer("Mosesh");
        Team.Player player3 = myTeam.addPlayer("Rahul");
	Team.Player player4 = myTeam.addPlayer("Madan");

        
        player1.displayInfo();
        player2.displayInfo();
        player3.displayInfo();
	player4.displayInfo();
    }
}
