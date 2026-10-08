package opgave01;

public class WizardCreator extends CharacterCreator {

    @Override
    public Weapon createWeapon() {
        return new Staff();
    }

    @Override
    public String getName() {
        return "Wizard";
    }
}
