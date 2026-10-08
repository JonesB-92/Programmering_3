package examples.composite;

public class Main {
    public static void main(String[] args) {
        Directory root = new Directory("root");
        Directory bin = new Directory("bin");
        Directory home = new Directory("home");
        Directory user = new Directory("user");

        File bash = new File("bash");
        File notes = new File("notes.txt");
        File photo = new File("photo.jpg");

        root.add(bin);
        root.add(home);
        bin.add(bash);
        home.add(user);
        user.add(notes);
        user.add(photo);

        root.print("");
    }
}
