package KataTest;

import Kata.Metro;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MetroTest {
        Metro metro = new Metro();

        @Test
        public void test1() {
            ArrayList<int[]> list = new ArrayList<int[]>();
            list.add(new int[] {10,0});
            list.add(new int[] {3,5});
            list.add(new int[] {2,5});
           assertEquals(5, metro.countPassengers(list));
        }



}
