package football;

import java.util.ArrayList;
import java.util.List;

public class Team2 {

    private String name;
    private final List<Player2> player2s;

    public Team2(String name) {
        this.setName(name);
        this.player2s = new ArrayList<>();
    }

    private void setName(String name) {
        throwException(name);
        this.name = name;
    }

    public void addPlayer(Player2 player2) {
        this.player2s.add(player2);
    }

    public void removePlayer(String name) {
        this.player2s.removeIf(player2 -> name.equals(player2.getName()));
    }

    public boolean hasPlayer(String name) {
        return player2s.stream().anyMatch(player2 -> name.equals(player2.getName()));
    }

    public double getRating() {
        return player2s.stream().mapToDouble(Player2::overallSkillLevel).average().orElse(0.0);
    }

    private void throwException(final String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("A name should not be empty.");
        }
    }
}