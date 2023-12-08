import java.util.ArrayList;
import java.util.List;

// Player class with the required attributes.
class Player {
    private String name;
    private String function;
    private String teamName;
    private String patent;

    public Player(String name, String function, String teamName, String patent) {
        this.name = name;
        this.function = function;
        this.teamName = teamName;
        this.patent = patent;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getFunction() {
        return function;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getPatent() {
        return patent;
    }

    // Method to print player data.
    public void printPlayerData() {
        System.out.println("Name: " + getName() + ", Function: " + getFunction() +
                ", Team Name: " + getTeamName() + ", Patent: " + getPatent());
    }
}

