package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TrainManagementApp {

    public static void main(String[] args) {

        System.out.println("===============");
        System.out.println("UC3 - Track Unique Bogie IDs");
        System.out.println("===============");

        //Create a Set to store unique bogie ID's
        //Hash set store only unique id's
        HashSet<String>  bogies = new HashSet<>();

        //add bogies with duplicates also
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");

        //Duplicate entries will be ignored internally by a Hashset
        bogies.add("BG101");
        bogies.add("BG102");


        System.out.println("Bogies ID's After Insertion :");
        System.out.println(bogies);

    }
}