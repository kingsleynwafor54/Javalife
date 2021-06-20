package ChapterSeven;

public class MovieLength {
    public boolean isMovieLengthEqualsToAirLineTime( int[] airLineMovieThings, int MovieLength ) {

        int SetOfMoviesYouCanWatch=0;
        int count;
        boolean isTrue=false;
        for (int counter=0;counter<airLineMovieThings.length;counter++) {

            for (count = 0; count < counter; count++) {
                if (airLineMovieThings[counter] + airLineMovieThings[count] == MovieLength) {
                    System.out.println(counter + " " + (count));
                    isTrue = true;
                    SetOfMoviesYouCanWatch++;



                }

            }
        }
        System.out.println("You can choose from "+SetOfMoviesYouCanWatch+" set of movies");
        return isTrue;
    }


}
