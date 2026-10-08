package opgave02;

public class Main {
    public static void main(String[] args) {
        // Fodbold
        Team fck = new Team("FCK");
        Team bif = new Team("BIF");
        Team fcm = new Team("FCM");
        Team agf = new Team("AGF");

        Tournament superliga = new FootballTournament("Superligaen");
        superliga.addMatch(new FootballMatch(fck, bif, 2, 1));
        superliga.addMatch(new FootballMatch(fcm, agf, 1, 1));
        superliga.addMatch(new FootballMatch(bif, fcm, 0, 2));
        superliga.addMatch(new FootballMatch(agf, fck, 2, 2));

        System.out.println("--- Fodbold ---");
        superliga.printTable();

        // Ishockey
        Team herning = new Team("Herning Blue Fox");
        Team aalborg = new Team("Aalborg Pirates");
        Team esbjerg = new Team("Esbjerg Energy");

        Tournament metalLigaen = new IceHockeyTournament("Metal Ligaen");
        metalLigaen.addMatch(new IceHockeyMatch(herning, aalborg, 3, 2, true)); // Herning 2, Aalborg 1 (OT)
        metalLigaen.addMatch(new IceHockeyMatch(aalborg, esbjerg, 4, 1, false)); // Aalborg 3, Esbjerg 0
        metalLigaen.addMatch(new IceHockeyMatch(esbjerg, herning, 2, 5, false)); // Herning 3, Esbjerg 0

        System.out.println("\n--- Ishockey ---");
        metalLigaen.printTable();
    }
}
