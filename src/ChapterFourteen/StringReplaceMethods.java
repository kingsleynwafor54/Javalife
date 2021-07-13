package ChapterFourteen;

public class StringReplaceMethods {
    public static void replaceString(String string){
        System.out.println(string.replace("abc","bcc"));
    }

    public static void main(String[] args) {
        String string="abcdefghabcdefghijklmnopqrstuvwxyz";
        replaceString(string);
    }
}
