package opgave01.Original;

class CharacterBuilder {
    RpgCharacter createCharacter(CharacterType type) {
        Weapon weapon;

        switch (type) {
            case WARRIOR -> weapon = new Sword();
            case WIZARD -> weapon = new Staff();
            case ROGUE -> weapon = new Dagger();
            default -> throw new IllegalArgumentException("Unsupported type: " + type);
        }

        return new RpgCharacter(type, weapon);
    }
}

