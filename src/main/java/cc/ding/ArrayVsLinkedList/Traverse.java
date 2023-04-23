package cc.ding.ArrayVsLinkedList;

import java.util.LinkedList;

public class Traverse {
    // 普通方法处理数组
    public static int processArray(int[] data) {
        int sum = 0;
        for (int datum : data) {
            sum += datum;
        }
        return sum;
    }

    // 链表方法处理数据
    public static int processLinkedList(LinkedList<Integer> data) {
        int sum = 0;
        for (int datum : data) {
            sum += datum;
        }
        return sum;
    }

    public static void main(String[] args) {
        long startTime;
        long endTime;
        long nano;
        long micro;
        long mill;
        long second;

        startTime = System.nanoTime();
        int[] data = new int[1000000];
        endTime = System.nanoTime();
        nano = (endTime - startTime);
        System.out.println("Array init time = " + nano);

        for (int i = 0; i < data.length; i++) {
            data[i] = i;
        }

        System.out.println("普通读取开始");
        startTime = System.nanoTime();
        int sum1 = processArray(data);
        endTime = System.nanoTime();
        System.out.println("普通读取结束");
        nano = (endTime - startTime);
        micro = nano / 1000;
        mill = micro / 1000;
        second = mill / 1000;
        System.out.println("普通方法处理数据的总和为：" + sum1 + "，耗时 " + nano + " 纳秒, " + micro + " 微秒, " + mill + " 毫秒, " + second + " 秒。");


        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i : data) {
            linkedList.add(i);
        }

        System.out.println("链表读取开始");
        startTime = System.nanoTime();
        int sum2 = processLinkedList(linkedList);
        endTime = System.nanoTime();
        System.out.println("链表读取结束");
        long nano2 = (endTime - startTime);
        micro = nano2 / 1000;
        mill = micro / 1000;
        System.out.println("链表方法处理数据的总和为：" + sum2 + "，耗时 " + nano2 + " 纳秒, " + micro + " 微秒, " + mill + " 毫秒, " + second + " 秒。");

        System.out.print("更高效：");
        if (nano2 < nano) {
            System.out.println("链表方法。");
        } else {
            System.out.println("普通方法。");
        }
    }

}

