package com.ChapterSixteen;

public class ColorCollection {
    private String color;
    private int colorNumber;
    private static int colNum;
    public ColorCollection(){

    }
    public ColorCollection(String color){
        this.colorNumber=++colNum;
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getColorNumber() {
        return colorNumber;
    }

    public void setColorNumber(int colorNumber) {
        this.colorNumber = colorNumber;
    }

    public static int getColNum() {
        return colNum;
    }

    @Override
    public String toString() {
        return  "color " + color  +
                ", colorNumber " + colorNumber
                ;
    }
}
