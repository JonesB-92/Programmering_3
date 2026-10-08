package opgave01;

public class RangerCreator extends CharacterCreator {
    @Override
    public Weapon createWeapon() {
        return new Bow();
    }

    @Override
    public String getName() {
        return "Ranger";
    }
}
