import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();
    @Test
    public void shouldChangeStation() {
        Assertions.assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(5);
        Assertions.assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStationUnderMinStation() {
        radio.setCurrentStation(-1);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStationOverMaxStation() {
        radio.setCurrentStation(10);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldNextStation() {
        radio.setCurrentStation(6);
        radio.nextStation();
        Assertions.assertEquals(7, radio.getCurrentStation());
    }

    @Test
    public void shouldOverMaxStation1() {
        radio.setCurrentStation(9);
        radio.nextStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldOverMaxStation2() {
        radio.setCurrentStation(10);
        radio.nextStation();
        Assertions.assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevStation() {
        radio.setCurrentStation(4);
        radio.previousStation();
        Assertions.assertEquals(3, radio.getCurrentStation());
    }

    @Test
    public void shouldBelowMinStation1() {
        radio.setCurrentStation(0);
        radio.previousStation();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldBelowMinStation2() {
        radio.setCurrentStation(-1);
        radio.previousStation();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldChangeVolume() {
        Assertions.assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(5);
        Assertions.assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolume() {
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldOverMaxVolume1() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldOverMaxVolume2() {
        radio.setCurrentVolume(101);
        radio.increaseVolume();
        Assertions.assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        radio.setCurrentVolume(60);
        radio.decreaseVolume();
        Assertions.assertEquals(59, radio.getCurrentVolume());
    }

    @Test
    public void shouldBelowMinVolume1() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldBelowMinVolume2() {
        radio.setCurrentVolume(-1);
        radio.decreaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

}
