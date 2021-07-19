package ChapterFourteen;

import java.util.Arrays;

public class ShuffleMethod {
    public static void main(String[] args) {
        String  [] numbers={"0","1","2","3","4","5","6","7","8","9"};
        String[] zeroToNinetyNine=new String[100];
        String k="";
        int c=0;
        for(int counter=0;counter< numbers.length;counter++){
            for (int count=0;count< numbers.length;count++){
              k=  numbers[counter]+numbers[count];
              zeroToNinetyNine[c]=k;
              c++;
            }

        }
        System.out.println(Arrays.asList(zeroToNinetyNine));
        System.out.println(c);
    }
}
