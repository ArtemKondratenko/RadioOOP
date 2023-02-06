package Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void setRadio() {
        Radio radio = new Radio();

        radio.setCurrentPositionNumber(7);

        int expected = 7;
        int actual = radio.getCurrentPositionNumber();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public  void setMaxRadio() {
        Radio radio = new Radio();

        radio.setCurrentPositionNumber(10);

        int expected = 0;
        int actual = radio.getCurrentPositionNumber();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public  void shouldNextRadio() {
        Radio radio = new Radio();
        radio.setCurrentPositionNumber(9);

        radio.nextPositionNumber();

        int expected = 0;
        int actual = radio.getCurrentPositionNumber();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public  void  shouldPrevRadio() {
        Radio radio = new Radio();
        radio.setCurrentPositionNumber(0);

        radio.prevPositionNumber();

        int expected = 9;
        int actual = radio.getCurrentPositionNumber();

        Assertions.assertEquals(expected,actual);
    }

}
