package com.rough.note;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;

public class RoughNote {
    public static void strcmp(String[] args) {
        String start = "toon";
        String target = "tOon";

        if (start == target) {
            System.out.println("same");
        } else {
            System.out.println("different");
        }
    }

    private static void change(int matrix[][]) {
        matrix[0][0] = 30;
    }

    public static void main2(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
        matrix.add(new ArrayList<Integer>());
        matrix.add(new ArrayList<Integer>());
        matrix.add(new ArrayList<Integer>());
        matrix.add(new ArrayList<Integer>());
        matrix.add(new ArrayList<Integer>());
        System.out.println("Length: " + matrix.size());

        ArrayList<Integer> list = matrix.get(0);
        list.add(20);
        System.out.println(list.get(0));
        System.out.println(matrix.get(0).get(0));
    }

    public static void main3(String[] args) {
        int years = 21;
        int premiumPerMonth = 5000;
        int premiumPerYear = premiumPerMonth * 12;
        double total = 0;

        int cpremiumPerYear = premiumPerYear;
        for (int counter = 0; counter < years; ++counter) {
            if (counter == 15) {
                cpremiumPerYear = 0;
            }
            total = ((total + cpremiumPerYear) * 1.085);
        }

        System.out.println("Premium per month: Rs. " + (premiumPerYear / 12));
        System.out.println("Premium per year: Rs. " + premiumPerYear);
        System.out.println("Total Premium Paid: Rs. " + (premiumPerYear * 15));
        System.out.println("Final Returns: Rs." + total);
    }
    
    public static void main(String[] args) {
        try {
            InetAddress[] addressArray = Inet6Address.getAllByName("pcscf.ims.mnc869.mcc405.pub.3gppnetwork.org");
            System.out.println("Address Resolution successful, size: " + addressArray.length);
            
            for (int index = 0; index < addressArray.length; ++index) {
                System.out.println(addressArray[index].getHostAddress());
            }
        } catch (UnknownHostException e) {
            System.out.println("Address Resolution failed");
            e.printStackTrace();
        }
    }

    private void testArray() {
        boolean[] visited = new boolean[5];
        visited[0] = true;

        for (int index = 0; index < 5; ++index) {
            System.out.print(visited[index] + " ");
        }
        System.out.println();
        changeArray(visited);
        for (int index = 0; index < 5; ++index) {
            System.out.print(visited[index] + " ");
        }
    }

    private void changeArray(boolean[] visited) {
        visited[1] = true;
        visited[2] = true;
        for (int index = 0; index < 5; ++index) {
            System.out.print(visited[index] + " ");
        }
        System.out.println();
    }
}
