package day3;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class LeastCommonBits {
    private String bits = "";
    private int[] sum = new int[12];

    public void add(int index, int val) {
        sum[index] += val;
    }

    public int[] sum(){
        return sum;
    }

    public void pushr(String bit){
        bits = bits + bit;
    }
}
