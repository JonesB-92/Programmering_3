package opgave01;

class RpgCharacter {
    private final CharacterCreator charType;
    private final Weapon weapon;

    RpgCharacter(CharacterCreator charType, Weapon weapon) {
        this.charType = charType;
        this.weapon = weapon;
    }

    String describe() {
        return "Character: " + charType.getName() + ", weapon: " + weapon.name();
    }
}

