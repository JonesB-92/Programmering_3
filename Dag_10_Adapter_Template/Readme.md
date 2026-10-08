# Opgave 1: Adapter Mønsteret (Adapter Pattern)

I denne opgave skal du implementere **Adapter mønsteret** for at få to inkompatible systemer til at arbejde sammen.

## Scenarie
Du har et system, der forventer at læse temperaturer via `TemperatureSensor` interfacet, som returnerer grader i **Celsius**.
Du har dog fået en ny sensor, `FahrenheitSensor`, som kun kan returnere grader i **Fahrenheit**.

Din opgave er at skabe en "bro" mellem disse to ved at implementere en `FahrenheitSensorAdapter`.

1. Opret og implementer `FahrenheitAdapter.java`:
   - Formel for konvertering: `Celsius = (Fahrenheit - 32) * 5 / 9`.
2. Afprøv din løsning i `Main.java`.

## Forventet output
Hvis du tester med 100 grader Fahrenheit, bør resultatet være ca. 37.78 grader Celsius.

# Opgave 2: Template Mønsteret - Sportsturneringer

I denne opgave skal du anvende **Template Method mønsteret** til at skabe et fleksibelt system til at generere turneringstabeller for forskellige sportsgrene.

## Scenarie
Du har fået udleveret to klasser: `FootballTournament.java` og `IceHockeyTournament.java`. Begge klasser kan beregne en stillingstabel, men deres point-regler er forskellige:

**Fodbold:**
- Sejr: 3 point.
- Uafgjort: 1 point.
- Nederlag: 0 point.

**Ishockey:**
- Sejr (ordinær tid): 3 point.
- Sejr (overtid): 2 point.
- Nederlag (overtid): 1 point.
- Nederlag (ordinær tid): 0 point.

Begge klasser bruger pt. næsten identisk kode i deres `printTable()` metode. Dette er et klart eksempel på kode-duplikering (Violation of DRY - Don't Repeat Yourself).

## Din opgave
Din opgave er at refaktorere koden ved hjælp af Template Method mønsteret:

