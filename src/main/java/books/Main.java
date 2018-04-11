package books;

public class Main {
    public static void main(String[] args) {


        Book boysLOne = new Book("Shishi mo Kobamazu",new Author("Kiriyu Kiyoi", "kissmanga.com", 'M'), 50, 500); //Lion Doesn't Refuse mangaka




        System.out.println("\n" + boysLOne); // book object

        System.out.println("\n" + boysLOne.getName()); //book name

        System.out.println("\n" + boysLOne.getAuthor().getName()); //author name

        System.out.println("\n");
        boysLOne.invoiceFrom(); //void invoice method

        System.out.println("\n" + boysLOne.getAuthor().createBookEmail().replaceAll("\\s", "").toLowerCase()); // email

    }
}

/*
Expected output
//
////Printing  out the book object
//Book{name='Java_for_the_hood', author=Author{name='Mikaila', email='zipcode.com', gender=M}, price=99.99, quantity=10000}

////Printing  out the book
//Java_for_the_hood

////Printing  out the author name
//Mikaila

////Printing  out the invoice
//Mikaila@zipcode.com Sent you an invoice for 999900.0
//
////print out the book email
//Mikaila@zipcode.com
 */