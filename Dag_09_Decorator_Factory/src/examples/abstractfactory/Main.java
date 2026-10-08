package examples.abstractfactory;

public class Main {
    public static void main(String[] args) {
        String theme = args.length > 0 ? args[0] : "light";

        UiFactory factory = "dark".equalsIgnoreCase(theme)
                ? new DarkThemeFactory()
                : new LightThemeFactory();

        runApplication(factory);
    }

    private static void runApplication(UiFactory factory) {
        Button button = factory.createButton();
        Dialog dialog = factory.createDialog();

        button.render();
        dialog.open();
    }
}
