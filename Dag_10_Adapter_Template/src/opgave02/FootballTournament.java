package opgave02;

public class FootballTournament extends Tournament {

    public FootballTournament(String name) {
        super(name);
    }

    @Override
    public int getHomeTeamPoints(Match match) {
        return calculatePoints(match.getHomeTeamGoals(), match.getAwayTeamGoals());
    }

    @Override
    public int getAwayTeamPoints(Match match) {
        return calculatePoints(match.getAwayTeamGoals(), match.getHomeTeamGoals());
    }

    private int calculatePoints(int goalsHome, int goalsAway) {
        // Opdater point (3 for sejr, 1 for uafgjort)
        if (goalsHome > goalsAway) {
            return 3;
        } else if (goalsHome < goalsAway) return 0;
        else return 1;
    }
}

