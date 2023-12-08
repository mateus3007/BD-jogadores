// Main class.
public class Main {
    public static void main(String[] args) {
        Database db = new Database();

        // Inserting at least 3 players into the database.
        db.insertPlayer(new Player("Alice", "Shooter", "Team A", "Platinum"));
        db.insertPlayer(new Player("Bob", "Support", "Team B", "Gold"));
        db.insertPlayer(new Player("Charlie", "Scout", "Team C", "Silver"));

        // Printing the data of each player.
        for (Player player : db.getAllPlayers()) {
            player.printPlayerData();
        }
    }
}
