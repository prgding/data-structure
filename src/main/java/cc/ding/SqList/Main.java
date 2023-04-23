package cc.ding.SqList;

public class Main {
    public static int GetElement(SqList l, int index, int[] e) {
        e[0] = l.data[index - 1];
        return 1;
    }

    public static void main(String[] args) {
        SqList l = new SqList();
        l.data = new int[]{1,2,3,4};
        int[] e = new int[1];
        if (GetElement(l,2, e) == 1) {
            System.out.println("SUCCESS");
        }
        System.out.println("e[0] = " + e[0]);
    }
}
