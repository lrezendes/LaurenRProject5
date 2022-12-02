package comp.comp152;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main (String [] args) {
        var toyota = new Car("Toyota", "Corolla", 40);
        var nissan = new Car("Nissan", "Altima", 45);
        var acura = new Car("Acura", "TL", 35);
        toyota.beep();
        nissan.beep();
        acura.beep();
        System.out.println("*********** Problem 2 ***********");

        Queue<Integer> Line = new LinkedList<>();
        var stack = new Stack<>();
        for (int i=1; i<6; i++) {
            stack.push(i);
            Line.add(i);
        }
        System.out.println("******* 1 *******");
        System.out.println("The queue printed in the order: ");
        while(!Line.isEmpty()) {
            var item = Line.remove();
            System.out.println(item);
        }
        System.out.println("******* 2 *******");
        System.out.println("The stack printed in the order: ");
        while (!stack.isEmpty()) {
            var toReadList = stack.pop();
            System.out.println(toReadList);
        }
        System.out.println("***** 3, 4, and 5 *****");
        System.out.println("The order was different for each one because queues are first in first out, so the first" +
                "number (1) was the first number in so it was the first number out. Stacks are first in last out, so the" +
                "number (5) was the last number in so it would be the first one out.");

        System.out.println("");
        System.out.println("******* Problem 3 *******");
        System.out.println("An example of time complexity O(1) is an array index. This time complexity means the time it" +
                " takes for the program to run is constant regardless of input size.");

        System.out.println("EXAMPLE:");
        String one = "one";
       System.out.println(one);

        System.out.println("");
        System.out.println("An example of time complexity O(n) is a linear search. This time complexity means that the " +
                "time it takes for the program to run is directly proportional to the input size.");
        System.out.println("EXAMPLE:");


        System.out.println("");
        System.out.println("An example of time complexity O(n^2) is a nested for loop. This time complexity means that" +
                " the time it takes to run is proportional to the square of the input size.");
        System.out.println("EXAMPLE:");

        System.out.println("");
        System.out.println("******* Problem 4 *******");
        System.out.println("1. A sorting algorithm organizes data into a specific order to allow us to easily analyze " +
                "the data.");
        System.out.println("2. If a sort is in quadratic time, it means the runtime of the algorithm is directly " +
                "proportional to the square size" +
                " of the input, or O(n^2).");
        System.out.println("3. An example of a quadratic sort is bubble sort. Bubble sort is a comparison-based sort " +
                "that swaps the position of" +
                " elements if they are out of order.");
        System.out.println("4. If a sort is in loglinear time, it means the time complexity of the sort is O(n (log n)), " +
                "which is one of the slowest" +
                " time complexities");
        System.out.println("5. One example of a loglinear sort is Quicksort. Quicksort is in the divide and conquer " +
                "family. It picks a partition" +
                " at random, and every element in each \n  half is compared to the other elements in the partition, " +
                "putting " +
                "the smaller" + " numbers into the left partition and larger numbers on the right. It continues to do \n" +
                "  this until all items are sorted.");
        System.out.println("6. The worst time complexity an algorithm can have is O(n (log n)).");

        System.out.println("");
        System.out.println("*******PLEASE READ*******");
        System.out.println("Did not get to finish problem five, or put examples for code in problem 3. ");
    }
}
