package opgave01.Original;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        CharacterBuilder builder = new CharacterBuilder();

        List<CharacterType> plannedCharacters = List.of(
                CharacterType.WARRIOR,
                CharacterType.WIZARD,
                CharacterType.ROGUE
        );

        for (CharacterType type : plannedCharacters) {
            RpgCharacter character = builder.createCharacter(type);
            System.out.println(character.describe());
        }
    }
}

