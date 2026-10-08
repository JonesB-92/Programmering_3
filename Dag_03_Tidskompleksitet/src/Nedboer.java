public class Nedboer {


    private int[] nedboerPrUge = {
            20, 10, 12, 12, 13, 14, 15, 10, 8, 7, 13,
            15, 10, 9, 6, 8, 12, 22, 14, 16, 16, 18, 23,
            12, 0, 2, 0, 0, 78, 0, 0, 0, 34, 12, 34, 23,
            23, 12, 44, 23, 12, 34, 22, 22, 22, 22, 18,
            19, 21, 32, 24, 13};

    /**
     * Returnerer ugenummeret for den uge i året, hvor man skal starte ferien,
     * hvis man ønsker den minimale nedbørsmængde i de tre uger
     *
     * @return
     */

    public int bedsteTreFerieUger() {
        int bedsteUgeStart = 0;
        int mindstNedboer = nedboerPrUge[0] + nedboerPrUge[1] + nedboerPrUge[2];
        for (int i = 0; i < nedboerPrUge.length; i++) {
            int triUgeNedboer = nedboerPrUge[i] + nedboerPrUge[i + 1] + nedboerPrUge[i + 2];
        }
        return bedsteUgeStart;
    }

    /**
     * Returnerer ugenummeret for den uge i året, hvor man skal starte ferien,
     * hvis man ønsker den minimale nedbørsmængde i det "antal" uger, der er
     * angivet i paramtereren
     *
     * @return
     */

    public int bedsteFerieUgerStart(int antal) {
        throw new UnsupportedOperationException("Metoden er ikke implementeret endnu");

    }

    /**
     * Returnerer ugenummeret på den første uge hvor nedbøren har været præcis
     * den samme flest uger i træk
     *
     * @return
     */
    public int ensNedboer() {
        throw new UnsupportedOperationException("Metoden er ikke implementeret endnu");
    }

    public int getNedboerPrUge() {
        return nedboerPrUge.length;
    }
}
