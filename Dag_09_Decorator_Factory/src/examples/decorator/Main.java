package examples.decorator;

public class Main {
    static void main() {
        Component printMessage = new WithRedBackGround(
                new WithGreenFont(new PrintMessage()));
        printMessage.print();
    }
}
