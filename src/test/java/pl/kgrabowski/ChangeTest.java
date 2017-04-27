package pl.kgrabowski;

import javafx.collections.ListChangeListener;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ChangeTest {
    @Test
    public void getChangeNominal_simple() throws Exception {
        //given
        int amount = 11;
        int[] excpectedNominal = new int[]{10, 1};
        //when
        List<Integer> changeNominal = Change.getChange(amount);
        //then
        assertEquals(changeNominal.size(), 2);
        assertTrue(changeNominal.contains(10));
        assertTrue(changeNominal.contains(1));
    }

    @Test
    public void getChangeNominal_simple2() throws Exception {
        //given
        int amount = 12;
        int[] excpectedNominal = new int[]{10, 2};
        //when
        List<Integer> changeNominal = Change.getChange(amount);
        //then
        checkReturnNominals(excpectedNominal, changeNominal);
    }
    public void checkReturnNominals(int[] expected, List<Integer> returned){
        assertEquals(expected.length, returned.size());
        for (int expectedNominal : expected){
            assertTrue(returned.contains(expectedNominal));
        }
    }

}