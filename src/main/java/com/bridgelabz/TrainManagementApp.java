package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TrainManagementApp {

    public static void main(String[] args) {

        System.out.println("====================");
        System.out.println("Train Consist Management App");
        System.out.println("====================");

        //Create a dynamic list to store train bogies
        List<String> trainConsit = new ArrayList<>();



        System.out.println("Train initialized successfully");
        System.out.println("Intial Bogi count "+trainConsit.size());
        System.out.println("Current Train Consist :"+trainConsit);


        System.out.println("======UC2 Add Passenger Bogies to Train======");
        List<String> passengerBhogies = new ArrayList<>();

        //inserting bhogies
        passengerBhogies.add("Sleeper class");
        passengerBhogies.add("AC chair");
        passengerBhogies.add("General class");
        passengerBhogies.add("Sleeper class");
        passengerBhogies.add("General class");

        System.out.println("Displaying Bhogies after inserting :"+passengerBhogies);

        //removing bhogi
        passengerBhogies.remove("AC chair");
        System.out.println("After removing AC chair ");
        System.out.println("Displaying Bhogies :"+passengerBhogies);

        //check Sleeper exitst;
        System.out.println(passengerBhogies.contains("Sleeper class")? true: false);

        //Final Train Passanger Consist
        System.out.println(passengerBhogies);

        System.out.println("UC2 operations completed successfully.....");



    }
}