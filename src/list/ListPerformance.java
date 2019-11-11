package list;

import java.util.*;

public class ListPerformance {
    private static final int SIZE = 500000;
    private static final int NUM_REP = 500000;
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        buildInput(SIZE, list1);
        buildInput(SIZE, list2);

        SimpleTimer timer = new SimpleTimer();
        timer.start();
        doGetOperations(NUM_REP, list1.size()/2, list1);
        timer.stop();

        timer.start();
        doGetOperations(NUM_REP, list2.size()/2, list2);
        timer.stop();
    }

    private static void doGetOperations(int rep, int index, List<Integer> list) {
        for(int i = 0 ; i < rep ; i++){
            list.get(index);
        }
    }

    public static final Random RAND = new Random();
    public static void buildInput (int length, List<Integer> list) {
        for (int i = 0; i < length; i++) {
            list.add(RAND.nextInt(Integer.MAX_VALUE / 10000));
        }
    }
}
