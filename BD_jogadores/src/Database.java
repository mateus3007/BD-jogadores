import java.util.ArrayList;
import java.util.List;

// Simulated Database class.
class Database {
    private List<Player> players;

    public Database() {
        players = new ArrayList<>();
    }

    public void insertPlayer(Player player) {
        players.add(player);
    }

    public List<Player> getAllPlayers() {
        return players;
    }
}
