package opgave01;

public abstract class CharacterCreator {
    public abstract Weapon createWeapon();
    public abstract String getName();

    public RpgCharacter createRpgCharacter() {
        return new RpgCharacter(this, this.createWeapon());
    }

}
