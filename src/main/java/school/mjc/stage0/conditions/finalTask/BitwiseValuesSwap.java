package school.mjc.stage0.conditions.finalTask;

public class BitwiseValuesSwap {
    public static void main(String[] args) {
        swap(5,6);
        swap(6,7);
    }
    public static void swap(int first, int second) {
        second= first^second;
        first=(second^first);
        second=second^first;
        System.out.println(first);
        System.out.println(second);
    }
}
