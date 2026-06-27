package com.bridgelabz;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TrainManagementApp {

    public static void main(String[] args) throws InvalidCapacityException, CargoSafetyException {

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
        bogies1.add(new Bogie("First class", 120));
        bogies1.add(new Bogie("cargo", 110));


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

        System.out.println("===============");
        System.out.println("UC9 - Group bogies by type");
        System.out.println("===============");


        System.out.println("All Bogies");
        for (Bogie bogie: bogies1)
        {
            System.out.println(bogie);
        }

        //Group using Collector.GroupingBy
        Map<String, List<Bogie>> groupedBogies = bogies1.stream().collect(Collectors.groupingBy( a -> a.name));

        //grouped bogies
        System.out.println("Grouped Bogies");
        for (Map.Entry<String, List<Bogie>> entry: groupedBogies.entrySet())
        {
            System.out.println("Bogies type :"+ entry.getKey());
            for(Bogie bogie: entry.getValue())
            {
                System.out.println("Capacity -> "+bogie.getCapacity());
            }
        }

        System.out.println("===============");
        System.out.println("UC10 - Count total seats in Train");
        System.out.println("===============");

        long numberOfSeats = bogies1.stream().map(b-> b.getCapacity()).reduce(0, Integer::sum);
        System.out.println("Total capacity of the train :"+ numberOfSeats);


        System.out.println("===============");
        System.out.println("UC11 - Count total seats in Train");
        System.out.println("===============");



        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter train ID (Format: TRN-1234): ");
        String trainId = scanner.nextLine();
        System.out.println("Enter Cargo Code (Format: PET-AB): ");
        String cargoId = scanner.nextLine();

        Pattern trainPattern = Pattern.compile("^TRN-\\d{4}$");
        Pattern cargoPattern = Pattern.compile("^PET-AB$");

        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoId);

        if(trainMatcher.matches())
            System.out.println("Valid train Id " +true);
        else
            System.out.println("Invalid Train ID");

        if(cargoMatcher.matches())
            System.out.println("Valid cargo id " +true);
        else
            System.out.println("Invalid cargo id");

        System.out.println("===============");
        System.out.println("UC12 - Safety compliance check for Goods Bogies");
        System.out.println("===============");

        //Create Good bogie list
        List<GoodBogie> goodBogie = new ArrayList<>();
        goodBogie.add(new GoodBogie("Cylindrical", "Petroleum"));
        goodBogie.add(new GoodBogie("Open", "Coal"));
        goodBogie.add(new GoodBogie("Box", "Grain"));
        goodBogie.add(new GoodBogie("Cylindrical", "Coal"));

        boolean safetyComplaint = goodBogie.stream().allMatch(bogie -> !bogie.getType().equalsIgnoreCase("Cylindrical") || bogie.getCargo().equalsIgnoreCase("Petroleum"));

        //Displaying Good Bogies
        System.out.println("Good Bogies");
        goodBogie.forEach(System.out::println);


        System.out.println("Safety Compliance Status: "+safetyComplaint);
        if(safetyComplaint)
        {
            System.out.println("Train Format is Safe");
        }
        else
        {
            System.out.println("Train Format is not safe");
        }


        System.out.println("===============");
        System.out.println("UC13 - Performance comparision");
        System.out.println("===============");


        //record start time
        long startTime = System.nanoTime();

        List<Bogie> filteredBogiesUsingStream = bogies1.stream().filter(b -> b.getCapacity()>50).toList();

        //record end time
        long endTime = System.nanoTime();

        System.out.println("Stream execution time :"+(endTime-startTime));


        List<Bogie> filteredBogiesUsingLoop = new ArrayList<>();
        //record start time
        long startTime1 = System.nanoTime();
            for(Bogie bogies2 : bogies1)
            {
                if(bogies2.getCapacity()>50)
                {
                    filteredBogiesUsingLoop.add(bogies2);
                }
            }

        //record end time
        long endTime1 = System.nanoTime();

        System.out.println("Loop execution time :"+(endTime1-startTime1));


        System.out.println("===============");
        System.out.println("UC14 - Handle Invalid Bogie capacity");
        System.out.println("===============");

        List<Bogie> bogies2 = new ArrayList<>();

        try
        {
            System.out.println("Please Enter Coach type :");
            String coachType = scanner.nextLine();
            System.out.println("Please Enter capacity :");
            int capacity = scanner.nextInt();
            if(capacity<=0)
            {
                throw new InvalidCapacityException("Error: Capacity must be greater than 0");
            }
            bogies2.add(new Bogie(coachType, capacity));
            System.out.println("Bogies added successfully");


        }
        catch (InvalidCapacityException i)
        {
            System.out.println(i.getMessage());
        }


        System.out.println("===============");
        System.out.println("UC15 - Safe cargo assignment");
        System.out.println("===============");

        GoodBogies bogies3 = new GoodBogies("Cylindrical", "Petroleum");
        assignCargo(bogies3);
        System.out.println("program working continuesly ");


        System.out.println("===============");
        System.out.println("UC16 - Manual Sorting using Bubble sort");
        System.out.println("===============");

        //create arrays to store bogie capacities
        int [] capacities = {21,33,44,55,6,75,12};
        System.out.println("Orignal capacities :");
       String orignalCapacities =  Arrays.stream(capacities).
                mapToObj(String:: valueOf).collect(Collectors.joining(", "));
        System.out.println(orignalCapacities);

        for(int i=0; i<capacities.length;i++)
        {
            for(int j=i+1; j<capacities.length; j++)
            {
                if(capacities[i]>capacities[j])
                {
                    int temp = capacities[i];
                    capacities[i] = capacities[j];
                    capacities[j] = temp;
                }
            }
        }
       String sortedBogies =  Arrays.stream(capacities)
                .mapToObj(String:: valueOf)
                .collect(Collectors.joining(", "));
        System.out.println("Sorted Bogies : "+sortedBogies);


        System.out.println("===============");
        System.out.println("UC17 - Sort Bogie names using Arrays.sort()");
        System.out.println("===============");

        String bogiewithNames[] = {"Sleeper", "AC", "First Class", "Second Class", "General", "Cargo"};
        System.out.println("Original list: "+bogiewithNames);

        System.out.println("After sorting based on names");
        Arrays.sort(bogiewithNames);
        System.out.println(Arrays.toString(bogiewithNames));


    }

    public static void assignCargo(GoodBogies bogie) throws CargoSafetyException {
        System.out.println("Assigning Cargo");
        try {

            if (!bogie.getShape().equalsIgnoreCase("Cylindrical") || !bogie.getCargo().equalsIgnoreCase("Petroleum"))
            {
                System.out.println("Unsafe Cargo assignment");
                throw new CargoSafetyException("Cargo validation completed for Rectangular shape");
            }
            System.out.println("Cargo assigned successfully");
        }
        catch (CargoSafetyException c) {
            System.out.println(c.getMessage());
        }
        finally {
            System.out.println("Logging cargo assignment");
        }




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

    static class GoodBogie
    {
        String type;
        String cargo;

        public GoodBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }

        public String getType() {
            return type;
        }

        public String getCargo() {
            return cargo;
        }

        @Override
        public String toString() {
            return "GoodBogies{" +
                    "type='" + type + '\'' +
                    ", cargo='" + cargo + '\'' +
                    '}';
        }
    }

    static class GoodBogies
    {
        private String shape;
        private String cargo;

        public GoodBogies(String shape, String cargo) {
            this.shape = shape;
            this.cargo = cargo;
        }

        public String getShape() {
            return shape;
        }

        public String getCargo() {
            return cargo;
        }

        @Override
        public String toString() {
            return "GoodBogies{" +
                    "shape='" + shape + '\'' +
                    ", cargo='" + cargo + '\'' +
                    '}';
        }
    }
}