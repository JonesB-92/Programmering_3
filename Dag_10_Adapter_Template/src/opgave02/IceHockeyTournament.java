package opgave02;

public class IceHockeyTournament extends Tournament {

    public IceHockeyTournament(String name) {
        super(name);
    }

    @Override
    public int getHomeTeamPoints(Match match) {
        return calculatePoints(match.isOvertime(), match.getHomeTeamGoals(), match.getAwayTeamGoals());
    }

    @Override
    public int getAwayTeamPoints(Match match) {
        return calculatePoints(match.isOvertime(), match.getAwayTeamGoals(), match.getHomeTeamGoals());
    }

    private int calculatePoints(boolean isOvertime, int goalsHome, int goalsAway) {
        // 3 point for sejr, 2 for sejr i OT, 1 for nederlag i OT, 0 for nederlag
        if (goalsHome > goalsAway) { // Win
            if (isOvertime) return 2;
            else return 3;
        } else { // Loss
            if (isOvertime) return 1;
            else return 0;
        }
    }
}

