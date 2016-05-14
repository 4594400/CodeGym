package ua.in.codegym.lesson_006;

/**
 * Created by administrator on 14.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        BinaryHeap binaryHeap = new BinaryHeap(5);
        binaryHeap.insert(1);
        binaryHeap.insert(2);
        binaryHeap.insert(3);
        binaryHeap.insert(4);
        binaryHeap.insert(5);
        binaryHeap.poll();


        for (Integer x : binaryHeap.items) {
            System.out.println(x);
        }

    }
}
