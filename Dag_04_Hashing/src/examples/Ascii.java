package examples;

public class Ascii {

    public static void main(String[] args) {
        var atomNames = new String[] {"JERN", "GULD", "KUL", "ZINK", "KROM", "SØLV", "TIN", "BLY"};
        for (String name : atomNames) {
            for (int i = 0; i < name.length(); i++) {
                System.out.print(name.charAt(i) + " = " + (int) name.charAt(i) + " ");
            }
            System.out.println();
        }
        for (var name : atomNames) {
            var asciiSum = 0;
            for (var c : name.toCharArray()) {
                asciiSum += c;
            }
            System.out.println(name + ": " + asciiSum + " modulo 8 = " + (asciiSum % 8));
        }

    }
}
