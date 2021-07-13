package ChapterFourteen;

public class StringBufferInsertAndDelete {
    public static void main(String[] args) {
        Object object="Hello";
        String string= "goodbye";
        char[] charArrays={'a','b','c','d','e','f'};
        boolean booleanValue=true;
        char characterValue='K';
        int integerValue=7;
        long longValue=100000000000L;
        float floatValue=2.5f;
        double doubleValue=33.333;

        StringBuilder buffer=new StringBuilder();
          buffer.append(object)
                  .append(charArrays,3,3)
                  .append(string)
                .append(booleanValue)
                .append(characterValue)
                .append(integerValue)
                .append(longValue)
                .append(floatValue)
                .append(doubleValue);
        System.out.printf("Buffer contains %n%s%n ",buffer.toString());

    }
}
