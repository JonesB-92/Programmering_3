package opgave01;

public class RogueCreator extends CharacterCreator {

    @Override
    public Weapon createWeapon() {
        return new Dagger();
    }

    @Override
    public String getName() {
        return "Rogue";
    }
}
