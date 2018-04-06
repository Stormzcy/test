package com.company;

import java.util.*;

public class Main {
    private int i;
    private int j;
    private int z;

    public Main(int i, int j, int z) {
        this.i = i;
        this.j = j;
        this.z = z;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> cities = new HashMap<String, Integer>();
        Scanner in = new Scanner(System.in);
        String s;
        int k = 0;
        while (!(s = in.next()).equals("###")) {
            cities.put(s, k++);
        }
        System.out.println(cities.size());
        ArrayList<ArrayList<Integer>> distances = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < cities.size(); ++i) {
            distances.add(new ArrayList<Integer>());
            for (int j = 0; j < cities.size(); ++j) {
                distances.get(i).add(in.nextInt());
            }
        }
        while (in.hasNext()) {
            String city1 = in.next();
            String city2 = in.next();
            System.out.println(distances.get(cities.get(city1)).get(cities.get(city2)));
        }
    }
}




