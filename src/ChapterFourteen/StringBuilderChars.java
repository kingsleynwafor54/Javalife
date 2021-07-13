package ChapterFourteen;

import java.util.Arrays;

public class StringBuilderChars {
    public static void main(String[] args) {
        StringBuffer buffer=new StringBuffer("Hello,how are you?");
        System.out.printf("buffer=%s%n",buffer.toString());
        System.out.printf(" char at index 0 %s  char at index 4 %s%n",buffer.charAt(0),buffer.charAt(4));
        //To use getChar you have to have an array of characters in place.
        char[] charArray=new char[buffer.length()];
        buffer.getChars(0,buffer.length(),charArray,0);
        System.out.println(Arrays.toString(charArray));
        for (int counter =0;counter<charArray.length;counter++){
            System.out.print(charArray[counter]+"");
        }
        System.out.println();
        buffer.setCharAt(0,'h');
        buffer.setCharAt(6,'T');
        System.out.printf("%s%n",buffer.toString());
    }
}
