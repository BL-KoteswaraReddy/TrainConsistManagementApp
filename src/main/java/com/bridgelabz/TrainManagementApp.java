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


        System.out.println("===============");
        System.out.println("UC7 - Sort bogies by capacity(Comparator)");
        System.out.println("===============");

        //Create list of passenger bogies
        List<Bogie> bogies1 = new ArrayList<>();
        bogies1.add(new Bogie("Sleeper", 25));
        bogies1.add(new Bogie("General class", 50));
        bogies1.add(new Bogie("AC chair", 30));
        bogies1.add(new Bogie("First class", 77));
        bogies1.add(new Bogie("cargo", 100));

        System.out.println("=====Before sorting========");
        //System.out.println(bogies1);
        for(Bogie bogie: bogies1)
        {
            System.out.println(bogie);
        }

        System.out.println("======After sorting========");
        bogies1.sort(Comparator.comparingInt(Bogie::getCapacity));

        for (Bogie bogie: bogies1)
        {
            System.out.println(bogie);
        }

        System.out.println("===============");
        System.out.println("UC8 - Sort bogies by using streams");
        System.out.println("===============");

        System.out.println("=====Filtered Bogies======(Capacity>60)");
        List<Bogie> filteredBogies = bogies1.stream().filter(b -> b.capacity>60).toList();
        filteredBogies.forEach(System.out::println);




    }
    static class Bogie
    {
        String name;
        int capacity;

        public String getName() {
            return name;
        }

        public int getCapacity() {
            return capacity;
        }

        public Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return "Bogie{" +
                    "name='" + name + '\'' +
                    ", capacity=" + capacity +
                    '}';
        }
    }
}