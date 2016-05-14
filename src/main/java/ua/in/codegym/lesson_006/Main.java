package ua.in.codegym.lesson_006;

/**
 * Created by administrator on 14.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        BinaryHeap binaryHeap = new BinaryHeap(2);
        binaryHeap.insert(0);
        binaryHeap.insert(1);
        binaryHeap.poll();
        binaryHeap.poll();


        for (Integer x : binaryHeap.items) {
            System.out.println(x);
        }

    }
}
