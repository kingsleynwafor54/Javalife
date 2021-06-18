package ChapterSeven;

public class MovieLength {
    public boolean isMovieLengthEqualsToAirLineTime( int[] airLineMovieThings ) {
        int MovieLength=100;
        int county=0;
        int count=0;
        boolean isTrue=false;
        for (int counter=0;counter<airLineMovieThings.length;counter++) {

            for (count = 0; count < counter; count++) {
                if (airLineMovieThings[counter] + airLineMovieThings[count] == MovieLength) {
                    System.out.println(counter + " " + (count));
                    isTrue = true;
                    county++;



                }

            }
        }
        System.out.println(county);
        return isTrue;
    }


}
