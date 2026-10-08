package opgave01;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        CharacterCreator warriorCreator = new WarriorCreator();
        CharacterCreator rogueCreator = new RogueCreator();
        CharacterCreator wizardCreator = new WizardCreator();
        CharacterCreator rangerCreator = new RangerCreator();

        List<CharacterCreator> plannedCharacters = List.of(
                wizardCreator,
                rogueCreator,
                warriorCreator,
                rangerCreator
        );

        for (CharacterCreator typeCreator : plannedCharacters) {
            createChar(typeCreator);
        }
    }

    private static void createChar(CharacterCreator creator) {
        RpgCharacter character  = creator.createRpgCharacter();
        System.out.println(character.describe());
    }

}

