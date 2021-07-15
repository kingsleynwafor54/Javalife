package ChapterFourteen;

import java.util.Arrays;

public class PigLatin {
    public static void main(String[] args) {
        char[] newChar={'b','o','y','c','e'};
        char[] chars=new char[newChar.length];
        int count=0;
        for(int counter= 1;counter< newChar.length;counter++){
            chars[count]=newChar[counter];
            count++;
        }
        chars[chars.length-1]=newChar[0];
        for(int i=0;i< chars.length;i++){
            System.out.print(chars[i]);
        }
        System.out.print("ay");

    }
}
