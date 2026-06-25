package com.bridgelabz;

import java.util.*;

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


        System.out.println("===============");
        System.out.println("UC4 - Maintain Ordered Bogie Consists");
        System.out.println("===============");

        //create a LinkedList
        //Linkedlist mantains insertion order and allows fast inserts
        LinkedList<String> trainsConsist = new LinkedList<>();
        trainsConsist.add("Sleeper");
        trainsConsist.add("AC");
        trainsConsist.add("Guard");
        trainsConsist.add("Engine");

        //after adding bogies
        System.out.println(trainsConsist);

        trainsConsist.addFirst("Sleeper");
        trainsConsist.addLast("AC");

        System.out.println("After adding Cargo at  positon 2");
        trainsConsist.add(2,"Cargo");
        System.out.println(trainsConsist);

        System.out.println("After removing first and last bogi");
        trainsConsist.removeFirst();
        trainsConsist.removeLast();
        System.out.println(trainsConsist);

        System.out.println("UC4 Ordered consist operations completed...");




        System.out.println("===============");
        System.out.println("UC5 - Preserve Insertion Order of Bogies");
        System.out.println("===============");

        //LinkedHashSet preserves order and ensures uniques
        Set<String>  formation = new LinkedHashSet<>();
        formation.add("Sleeper");
        formation.add("Engine");
        formation.add("Cargo");
        formation.add("Guard");

        //adding duplicates
        formation.add("Cargo");
        formation.add("Guard");

        System.out.println(formation);


        System.out.println("===============");
        System.out.println("UC6 - Preserve Insertion Order of Bogies");
        System.out.println("===============");

        //HashMap stores data in key -> value format

        HashMap<String, Integer> capacityMap = new HashMap<>();
        capacityMap.put("Sleeper", 15);
        capacityMap.put("AC chair", 20);
        capacityMap.put("General class", 40);
        capacityMap.put("Cargo", 50);
        capacityMap.put("First class", 15);

        System.out.println("Bogi capacity details");
        for(Map.Entry<String, Integer> entry : capacityMap.entrySet())
        {
            System.out.println("Coach Type: "+entry.getKey() +", capacity: "+entry.getValue());
        }


    }
}