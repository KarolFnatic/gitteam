package pl.kgrabowski;

import javafx.collections.ListChangeListener;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by RENT on 2017-04-27.
 */
public class ChangeTest {
    @Test
    public void getChangeNominal_simple() throws Exception{
        //given
        int amount = 11;
        int[] excpectedNominal = new int[]{10,1};
        //when
        List<Integer> changeNominal = Change.getChange(amount);
        //then
        assertEquals(changeNominal.size(),2);
        assertTrue(changeNominal.contains(10));
        assertTrue(changeNominal.contains(1));
    }

}