package pl.kgrabowski;

import java.util.ArrayList;
import java.util.List;

public class Change {
    public static void main(String[] args) {
        List<Integer> returnNominals = Change.getChange(324);
        System.out.println(returnNominals);
    }

    public static List<Integer> getChange(int amount) {
        int[] nominals = new int[]{500, 200, 100, 50, 20, 10, 5, 2, 1};
        int index = 0;
        List<Integer> result = new ArrayList<Integer>();

        while (amount > 0) {
            int currentNominal = nominals[index];
            if (currentNominal <= amount) {
                result.add(currentNominal);
                amount -= currentNominal;
            } else {
                index++;
            }
        }
        return result;
    }
}

