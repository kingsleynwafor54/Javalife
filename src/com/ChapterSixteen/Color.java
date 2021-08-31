package com.ChapterSixteen;

public class Color {
    private String red ="red";
    private String blue="blue";
    private String green="green";
    private String yellow="yellow";
    private String indigo="indigo";
    private String violet="violet";
    private String orange="orange";
    private String pink="pink";
    private String black="black";
    private String white="white";
    private String purple="purple";

    public String getRed() {
        return red;
    }

    public String getBlue() {
        return blue;
    }

    public String getGreen() {
        return green;
    }

    public String getYellow() {
        return yellow;
    }

    public String getIndigo() {
        return indigo;
    }

    public String getViolet() {
        return violet;
    }

    public String getOrange() {
        return orange;
    }

    public String getPink() {
        return pink;
    }

    public String getBlack() {
        return black;
    }

    public String getWhite() {
        return white;
    }

    public String getPurple() {
        return purple;
    }

    public static void main(String[] args) {
        Color color=new Color();
        System.out.println(color.getBlack());
        System.out.println(color.getBlue());
    }
}
