public class DataTypes {
    public static void main(String[] args) {
        String firstName;
        String lastName;
        byte age;
        char gender;
        int personalId;

        firstName = "Jan";
        lastName = "Kowalski";
        age = 23;
        gender = 'm';
        personalId = 1234;

        System.out.println("Pracownik o ID:"+personalId+" to " +firstName+" " +lastName+" ("+gender+"). Lat "+age+".");
    }
}
