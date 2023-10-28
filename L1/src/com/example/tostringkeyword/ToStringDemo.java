package com.example.tostringkeyword;

import java.util.ArrayList;

/**
 * Class to demonstrate toString method
 */
public class ToStringDemo{

    private String company;
    private String color;
    private float volume; //In litres

    public ToStringDemo(String company, String color, float volume) {
        this.company = company;
        this.color = color;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "[ company = " + this.company + " color = " + this.color + " volume = " + this.volume + " ]";
    }

    public static void main(String[] args) {
        ToStringDemo toStringDemo = new ToStringDemo("TUPPERWARE", "BLUE", 1);
        System.out.println(toStringDemo);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
    }

}
