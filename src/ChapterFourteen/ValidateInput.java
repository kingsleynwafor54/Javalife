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
        return emailAddress.matches("[a-z]+\\d+[@][a-z]+[.][a-z]+");
}
public static boolean validateZip(String zip){
        return zip.matches("\\d+[3]");
}
    public static void main(String[] args) {
        System.out.println( validateFirstName("KinGsley"));
        System.out.println( validateLastName(("Kingsley-kingsley")));
        System.out.println(validateAddress("123 Ikeja stone"));
        System.out.println(validateEmailAddress("kingsleynwafor123@gmail.com"));
        System.out.println(validateEmailAddress("kingsleynwafor1@gmail.com"));
        System.out.println(validateZip("123"));
    }
}
