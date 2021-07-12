package ChapterFourteen;

import java.util.Locale;

public class StringStartAndEnd {
    public static void main(String[] args) {
        String[] strings={"Started","Starting","ended","ending","state"};
        for(int counter=0;counter<strings.length;counter++){
            String st=strings[counter].toLowerCase(Locale.ROOT);
            if(st.startsWith("st")){
                System.out.println(strings[counter]);
            }
        }

        System.out.println();

        for(int counter=0;counter<strings.length;counter++){
            String st=strings[counter].toLowerCase(Locale.ROOT);
            if(st.startsWith("art",2)){
                System.out.println(strings[counter]);
            }
        }

        for(int counter=0;counter<strings.length;counter++){
            String st=strings[counter].toLowerCase(Locale.ROOT);
            if(st.endsWith("ed")){
                System.out.println(strings[counter]);
            }
        }

    }
}
