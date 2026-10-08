package opgave02;

public class IceHockeyMatch implements Match {
    private Team homeTeam;
    private Team awayTeam;
    private int homeTeamGoals;
    private int awayTeamGoals;
    private boolean isOvertime;

    public IceHockeyMatch(Team homeTeam, Team awayTeam, int homeTeamGoals, int awayTeamGoals, boolean isOvertime) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeTeamGoals = homeTeamGoals;
        this.awayTeamGoals = awayTeamGoals;
        this.isOvertime = isOvertime;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public int getHomeTeamGoals() {
        return homeTeamGoals;
    }

    public int getAwayTeamGoals() {
        return awayTeamGoals;
    }

    public boolean isOvertime() {
        return isOvertime;
    }
}
