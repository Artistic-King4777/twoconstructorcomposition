package books;

public class Author {
    private String name;
    private String domainName;
    private char gender;

    public Author(String name, String domainName, char gender){
        this.name = name;
        this.domainName = domainName;
        this.gender = gender;
    }


    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    private String getDomainName() {
        return  domainName;
    }

    public String createBookEmail(){
        return getName() + "@"+ getDomainName();
    }


    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", domainName='" + domainName + '\'' +
                ", gender=" + gender +
                '}';
    }

}

//invoice from is calling getinvoice
//create email == domain name plus name
//get invoice is create email + "sent you an invoice: " + price