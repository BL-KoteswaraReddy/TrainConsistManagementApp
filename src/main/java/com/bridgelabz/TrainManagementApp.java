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
    }
}