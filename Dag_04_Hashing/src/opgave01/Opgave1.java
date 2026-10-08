package opgave01;

public class Opgave1 {
    /**
     * Opgave 1
     * (I denne opgave skal du ikke programmere, men selv udregne hvordan hashtabellerne kommer til at se ud - anvend papir og blyant!)
     * Opgaven handler om indsættelse af tal i en hashtabel ved forskellige kollisionsstrategier.
     * Følgende tal skal indsættes i en hashtabel i den angivne rækkefølge: 4371 1323 6173 4199 4344 9679 1989

     * Hashtabellen har plads til 10 elementer og hash funktionen er givet ved h(x) = x mod 10.
     * Hvorledes ser hashtabellen ud efter indsættelsen af ovenstående tal, når der anvendes:

     * kædereglen
     * lineær probing
     * kvadratisk probing (kap. 27.4.2 i bogen)
     *
     *
     */

    // 4371 1323 6173 4199 4344 9679 1989
    // Kædereglen
    //Index 0: –
    //Index 1: 4371
    //Index 2: –
    //Index 3: 1323 → 6173
    //Index 4: 4344
    //Index 5: –
    //Index 6: –
    //Index 7: –
    //Index 8: –
    //Index 9: 4199 → 9679 → 1989

    // 4371 1323 6173 4199 4344 9679 1989
    //Lineær
    //Index 0: 9679
    //Index 1: 4371
    //Index 2: 1989
    //Index 3: 1323
    //Index 4: 6173
    //Index 5: 4344
    //Index 6: –
    //Index 7: –
    //Index 8: –
    //Index 9: 4199


    /**
     * Instead of moving one step at a time (like linear probing), you move in growing square steps.
     * You try:
     *
     * (h(x) + 1²) mod m
     * (h(x) + 2²) mod m
     * (h(x) + 3²) mod m
     * (h(x) + 4²) mod m

     * Where:
     * m = table size
     *
     * 1², 2², 3², 4² = 1, 4, 9, 16, 25, ...
     *
     * So instead of moving:
     *
     * +1, +2, +3, +4 ...
     *
     * you move:
     *
     * i += 1, +4, +9, +16 ...
     */
    // 4371 1323 6173 4199 4344 9679 1989
    //Kvadratisk probing
    //Index 0: 9679
    //Index 1: 4371
    //Index 2: –
    //Index 3: 1323
    //Index 4: 6173
    //Index 5: 4344
    //Index 6: –
    //Index 7: –
    //Index 8: 1989
    //Index 9: 4199

}
