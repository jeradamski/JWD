public class Library {


    public static void main(String[] args) {



        Book[] books = {
                new Book("Hobbit","Tolkien","Znak",1952),
                new Book("Hobbit","Tolkien","Znak",1952),
                new Book("Władca Pierścieni","Tolkien", "Znak", 1960),
                new Book("Harry Potter", "Rowling", "Czarne", 1996)
        };

        Book b1 = books[0];
        Book b2 = books[1];

        System.out.println(b1.equals(b2));




    }

}
