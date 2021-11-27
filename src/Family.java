public class Family {
    public static void main(String[] args) {

        FamilyMember dad = new FamilyMember();
        dad.name = "Tomasz";
        dad.age = 30;
        System.out.println("Nazwisko rodu to " + FamilyMember.surname);
        System.out.println("Imię ojca " + dad.name + ", w wieku " + dad.age + " lat.");

        FamilyMember son = new FamilyMember();

        son.name = "Jan";
        son.age = 3;
        System.out.println("Imię syna " + son.name + ", w wieku " + son.age + " lat.");

        dad.surname = "Kowalski";
        System.out.println("Nazwisko syna " + son.surname);


    }
}
