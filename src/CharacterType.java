public class CharacterType {
    public static void main(String[] args) {
        showInfo('a');
        showInfo('B');
        showInfo('b');
        showInfo('ć');

        String s = "dsadas";

    }
    public static void showInfo (char c) {
        System.out.println("Kod znaku '" + c + "' to: " + (int)c );
    }
}
