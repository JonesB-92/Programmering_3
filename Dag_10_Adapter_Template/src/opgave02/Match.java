package opgave02;

public interface Match {

    Team getHomeTeam();
    Team getAwayTeam();
    int getHomeTeamGoals();
    int getAwayTeamGoals();

    boolean isOvertime();
}
