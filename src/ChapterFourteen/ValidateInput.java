package ChapterFourteen;

public class ValidateInput {
    public static boolean validateFirstName(String firstName){
        return firstName.matches("[A-Z][a-zA-Z]*");
    }
    public static boolean validateLastName(String lastName){
        return lastName.matches("[a-zA-Z]+([-][a-zA-Z]*)");
    }
public static boolean validateAddress(String address){
        return address.matches("\\d+\\s+([a-zA-z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
}
public static boolean validateEmailAddress(String emailAddress){
        return emailAddress.matches("[a-z]+|[@][a-z]+[.][a-z]+");
}
    public static void main(String[] args) {
        System.out.println( validateFirstName("KinGsley"));
        System.out.println( validateLastName(("Kingsley-JOjjkjkjk")));
        System.out.println(validateAddress("123 Ikeja bodeStreet"));
        System.out.println(validateEmailAddress("kingsleynwafor@gmail.com"));
        System.out.println(validateEmailAddress("kingsleynwafor@gmail.com"));

    }
}
