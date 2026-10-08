# Lektion 11: Iterator og Composite

## Opgave 1: Implementering af Iterator i Range

I denne opgave skal du færdiggøre klassen `Range`, der findes i pakken `opgave01`.
`Range` repræsenterer et interval af heltal (fra `start` til `end` inklusiv).

Klassen implementerer `Iterable<Integer>`, men metoden `iterator()` returnerer i øjeblikket `null`.

### Din opgave:
1.  Implementer en iterator til `Range` klassen.
2.  Du kan vælge at implementere iteratoren som en privat indre klasse i `Range`.
3.  Iteratoren skal kunne gennemløbe alle tal i intervallet fra `start` til og med `end`.
4.  Efter implementeringen skal du kunne køre `Main` klassen i `opgave01` og se tallene fra -3 til 10 blive udskrevet.

## Opgave 2: Fra Switch til Composite

I denne opgave skal du refaktorere en eksisterende implementation af matematiske udtryk til at bruge **Composite-mønstret**.

Den nuværende kode i `opgave02.Expression` bruger en `switch`-sætning til at håndtere evaluering og udskrivning. Dette er svært at vedligeholde og udvide.

### Problemer med den nuværende implementation:
1.  **Overflødige datafelter:** `Expression`-klassen har både `value`, `left` og `right`. Men hvis typen er `NUMBER`, bruges kun `value`, og hvis det er en binær operation (som `ADD`), bruges kun `left` og `right`. Dette spilder hukommelse og skaber forvirring.
2.  **Ufleksibel struktur:** Forestil dig, at du skal tilføje en `NEGATE` operation (der negerer et tal, f.eks. `-5`). Denne operation har kun én parameter (unær). I den nuværende klasse ville man skulle lade `right` være `null`, hvilket gør koden skrøbelig og kræver ekstra tjek i `switch`-sætningen.
3.  **Brud på "Open/Closed Principle":** Hver gang du tilføjer en ny regneart, skal du ændre i `Expression`-klassen (både enum, `evaluate()` og `toString()`). Med Composite-mønstret kan du blot tilføje en ny klasse uden at røre ved den eksisterende kode.

### Din opgave:
Refaktorer koden i pakken `opgave02`, så den benytter Composite-mønstret i stedet for den nuværende implementation med switch-sætninger. Målet er at opnå en fleksibel struktur, hvor nye regnearter (både unære og binære) nemt kan tilføjes som selvstændige klasser uden at ændre i eksisterende kode. 

Som bevis på at jeres nye struktur virker, skal I implementere de gængse regnearter (addition, multiplikation, subtraktion, division) samt en `Negate` operation, og demonstrere dette i `Main` ved at beregne et komplekst udtryk som f.eks. `-(10 - 2) / 2`.

## Opgave 3: DeepIterator (Ekstra)

Når man arbejder med hierarkiske strukturer som Composite-mønstret, har man ofte brug for at gennemløbe alle elementer i strukturen. I denne opgave skal du koble Iterator-mønstret sammen med din løsning fra Opgave 2.

### Din opgave:
Implementer en `DeepIterator` i pakken `opgave02`, der kan gennemløbe alle knuder (både tal og operationer) i et `Expression`-træ. 

Målet er, at man skal kunne bruge din iterator til at "flade" et udtryk ud. Hvis man f.eks. har udtrykket `(2 + 3) * 5`, skal iteratoren kunne besøge alle fem led (`*`, `+`, `2`, `3`, `5`).

**Tips:**
*   Lad `Expression` interfacet udvide `Iterable<Expression>`.
*   Brug en `Stack<Expression>` inde i din iterator til at holde styr på de noder, du mangler at besøge (Depth-First Search).
*   Overvej hvilken rækkefølge (pre-order, in-order eller post-order) der giver mest mening for din implementation.
