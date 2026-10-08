package opgave01;

public class WarriorCreator extends CharacterCreator{
        @Override
    public Weapon createWeapon() {
        return new Sword();
    }

    @Override
    public String getName() {
        return "Warrior";
    }
}
