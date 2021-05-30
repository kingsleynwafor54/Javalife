package AirLineReservation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AirLineReservation {
    AirLine airLine;
    @BeforeEach
    void beforeEach(){
        airLine=new AirLine();
    }
    @AfterEach
    void afterEach(){
        airLine=null;
    }
@Test
    void AirLineIsNotNull(){
        assertNotNull(airLine);
}
//    @Test
//    void MethodCheckIfSeatIsEmpty(){
//        assertEquals(4,airLine.isEmpty());
//    }
@Test
    void MethodAssignSeatTest(){

     assertEquals(true,airLine.firstClassSeat(1));
     assertEquals(true,airLine.firstClassSeat(2));
     assertEquals(true,airLine.firstClassSeat(3));
     assertEquals(true,airLine.firstClassSeat(4));
     assertEquals(true,airLine.firstClassSeat(5));
     assertEquals(true,airLine.firstClassSeat(5));


      //  assertEquals(5,airLine.getEconomySeat(5));

//    System.out.println(airLine);
//        assertEquals(,airLine.assign());
}
}
