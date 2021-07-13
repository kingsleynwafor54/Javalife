package ChapterFourteen;

public class TokenizationOfSentence {
    public static void tokenizationOfSentence(String sentence){
        int count=0;
        String[] token=sentence.split(",");
        for(int counter=0;counter<token.length;counter++){
            System.out.println(token[counter]);
            if(token[counter].equalsIgnoreCase( "side")){
            count++;
        }
        }
        System.out.println("The number of words in the sentence is "+count);
    }

    public static void main(String[] args) {
        tokenizationOfSentence("hello,from,the,other,side");

    }
}
