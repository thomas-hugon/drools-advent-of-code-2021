package day3;

public class BitsAggregate {
    private int[] sum = new int[12];

    public void add(int index, int val) {
        sum[index] += val;
    }

    public int[] sum(){
        return sum;
    }

}
