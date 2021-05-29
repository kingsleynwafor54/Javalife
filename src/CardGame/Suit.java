package CardGame;

public enum Suit {
    CIRCLE, TRIANGLE, STAR, CROSS,SQUARE,WHOT;
    @Override
    public String toString(){
        return switch(this){
            case CIRCLE-> "Circle";
            case TRIANGLE-> "Triangle";
            case SQUARE-> "Square";
            case STAR -> "Star";
            case CROSS -> "Cross";
            case WHOT-> "whot";
        };
    }


}