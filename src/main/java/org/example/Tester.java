package org.example;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * This class is for testing speed of ArrayList and LinkedList
 * @author Ivan Dorofeev
 */
public class Tester {
    int[] len;
    String[] name = {"add", "get", "delete", "set", "contains", "indexOf"};
    long[] timeArray;
    long[] timeLinked;

    /**
     * Constructor
     * @param len array with counts of testing iterations
     */
    public Tester(int[] len) {
        this.len = len;
        this.timeArray = new long[len.length * 6];
        this.timeLinked = new long[len.length * 6];
    }

    /**
     * Method for filling table with results of ArrayList testing
     */
    public void fillArrayTable() {
        for (int j = 0; j < len.length; j++) {

            ArrayList<Integer> arrayList = new ArrayList<>();

            long fullAddDuration = 0;
            for (int i = 0; i < len[j]; i++) {
                long startTime = System.nanoTime();
                arrayList.add(i);
                long endTime = System.nanoTime();
                long duration = (endTime - startTime);
                fullAddDuration += duration;
            }

            long fullGetDuration = 0;
            for (int i = 0; i < len[j]; i++) {
                long startTime = System.nanoTime();
                arrayList.get(i);
                long endTime = System.nanoTime();
                long duration = (endTime - startTime);
                fullGetDuration += duration;
            }

            long fullSetDuration = 0;
            for (int i = 0; i < len[j]; i++) {
                long startTime = System.nanoTime();
                arrayList.set(i, i);
                long endTime = System.nanoTime();
                long duration = (endTime - startTime);
                fullSetDuration += duration;
            }

            long fullContainsDuration = 0;
            for (int i = 0; i < len[j]; i++) {
                long startTime = System.nanoTime();
                arrayList.contains(i);
                long endTime = System.nanoTime();
                long duration = (endTime - startTime);
                fullContainsDuration += duration;
            }

            long fullIndexOfDuration = 0;
            for (int i = 0; i < len[j]; i++) {
                long startTime = System.nanoTime();
                arrayList.indexOf(i);
                long endTime = System.nanoTime();
                long duration = (endTime - startTime);
                fullIndexOfDuration += duration;
            }

            long fullDeleteDuration = 0;
            for (int i = 0; i < len[j]; i++) {
                long startTime = System.nanoTime();
                arrayList.remove(0);
                long endTime = System.nanoTime();
                long duration = (endTime - startTime);
                fullDeleteDuration += duration;
            }

            timeArray[j * 6] = fullAddDuration/len[j];
            timeArray[j * 6 + 1] = fullGetDuration/len[j];
            timeArray[j * 6 + 2] = fullDeleteDuration/len[j];
            timeArray[j * 6 + 3] = fullSetDuration/len[j];
            timeArray[j * 6 + 4] = fullContainsDuration/len[j];
            timeArray[j * 6 + 5] = fullIndexOfDuration/len[j];
        }

    }

    /**
     * Method for filling table with results of LinkedList testing
     */
    public void fillLinkedTable() {
        for (int j = 0; j < len.length; j++) {

            LinkedList<Integer> linkedList = new LinkedList<>();

            long fullAddDuration = 0;
            for (int i = 0; i < len[j]; i++) {
                long startTime = System.nanoTime();
                linkedList.add(i);
                long endTime = System.nanoTime();
                long duration = (endTime - startTime);
                fullAddDuration += duration;
            }

            long fullGetDuration = 0;
            for (int i = 0; i < len[j]; i++) {
                long startTime = System.nanoTime();
                linkedList.get(i);
                long endTime = System.nanoTime();
                long duration = (endTime - startTime);
                fullGetDuration += duration;
            }

            long fullSetDuration = 0;
            for (int i = 0; i < len[j]; i++) {
                long startTime = System.nanoTime();
                linkedList.set(i, i);
                long endTime = System.nanoTime();
                long duration = (endTime - startTime);
                fullSetDuration += duration;
            }

            long fullContainsDuration = 0;
            for (int i = 0; i < len[j]; i++) {
                long startTime = System.nanoTime();
                linkedList.contains(i);
                long endTime = System.nanoTime();
                long duration = (endTime - startTime);
                fullContainsDuration += duration;
            }

            long fullIndexOfDuration = 0;
            for (int i = 0; i < len[j]; i++) {
                long startTime = System.nanoTime();
                linkedList.indexOf(i);
                long endTime = System.nanoTime();
                long duration = (endTime - startTime);
                fullIndexOfDuration += duration;
            }

            long fullDeleteDuration = 0;
            for (int i = 0; i < len[j]; i++) {
                long startTime = System.nanoTime();
                linkedList.remove(0);
                long endTime = System.nanoTime();
                long duration = (endTime - startTime);
                fullDeleteDuration += duration;
            }

            timeLinked[j * 6] = fullAddDuration/len[j];
            timeLinked[j * 6 + 1] = fullGetDuration/len[j];
            timeLinked[j * 6 + 2] = fullDeleteDuration/len[j];
            timeLinked[j * 6 + 3] = fullSetDuration/len[j];
            timeLinked[j * 6 + 4] = fullContainsDuration/len[j];
            timeLinked[j * 6 + 5] = fullIndexOfDuration/len[j];
        }
    }

    /**
     * Method for printing result tables of ArrayList and LinkedList
     */
    public void printTable() {
        String formats = "%11s";
        System.out.printf("%21s", "ArrayList\n");
        System.out.printf(formats, "Method");
        System.out.printf(formats, "Count");
        System.out.printf(formats, "Duration\n");
        for (int j = 0; j < len.length; j++) {
            System.out.printf(formats, name[0]);
            System.out.printf(formats, len[j]);
            System.out.printf(formats, timeArray[j * 6] + "\n");
            System.out.printf(formats, name[1]);
            System.out.printf(formats, len[j]);
            System.out.printf(formats, timeArray[j * 6 + 1] + "\n");
            System.out.printf(formats, name[2]);
            System.out.printf(formats, len[j]);
            System.out.printf(formats, timeArray[j * 6 + 2] + "\n");
            System.out.printf(formats, name[3]);
            System.out.printf(formats, len[j]);
            System.out.printf(formats, timeArray[j * 6 + 3] + "\n");
            System.out.printf(formats, name[4]);
            System.out.printf(formats, len[j]);
            System.out.printf(formats, timeArray[j * 6 + 4] + "\n");
            System.out.printf(formats, name[5]);
            System.out.printf(formats, len[j]);
            System.out.printf(formats, timeArray[j * 6 + 5] + "\n");
        }
        System.out.println();
        System.out.printf("%21s", "LinkedList\n");
        System.out.printf(formats, "Method");
        System.out.printf(formats, "Count");
        System.out.printf(formats, "Duration\n");
        for (int j = 0; j < len.length; j++) {
            System.out.printf(formats, name[0]);
            System.out.printf(formats, len[j]);
            System.out.printf(formats, timeLinked[j * 6] + "\n");
            System.out.printf(formats, name[1]);
            System.out.printf(formats, len[j]);
            System.out.printf(formats, timeLinked[j * 6 + 1] + "\n");
            System.out.printf(formats, name[2]);
            System.out.printf(formats, len[j]);
            System.out.printf(formats, timeLinked[j * 6 + 2] + "\n");
            System.out.printf(formats, name[3]);
            System.out.printf(formats, len[j]);
            System.out.printf(formats, timeLinked[j * 6 + 3] + "\n");
            System.out.printf(formats, name[4]);
            System.out.printf(formats, len[j]);
            System.out.printf(formats, timeLinked[j * 6 + 4] + "\n");
            System.out.printf(formats, name[5]);
            System.out.printf(formats, len[j]);
            System.out.printf(formats, timeLinked[j * 6 + 5] + "\n");
        }
    }
}