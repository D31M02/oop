import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(15);
        Assertions.assertEquals(15, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStation20() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(20);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldChangeStation() {
        Radio radio = new Radio();
        Assertions.assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(5);
        Assertions.assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStationUnderMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStationOverMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        radio.nextStation();
        Assertions.assertEquals(7, radio.getCurrentStation());
    }

    @Test
    public void shouldOverMaxStation1() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(9);
        radio.nextStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldOverMaxStation2() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        radio.nextStation();
        Assertions.assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);
        radio.previousStation();
        Assertions.assertEquals(3, radio.getCurrentStation());
    }

    @Test
    public void shouldBelowMinStation1() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.previousStation();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldBelowMinStation2() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        radio.previousStation();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldBelowMinStation3() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(0);
        radio.previousStation();
        Assertions.assertEquals(19, radio.getCurrentStation());
    }

    @Test
    public void shouldChangeVolume() {
        Radio radio = new Radio();
        Assertions.assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(5);
        Assertions.assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.increaseVolume();
        Assertions.assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldOverMaxVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldOverMaxVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldOverMaxVolume3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.increaseVolume();
        Assertions.assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(6);
        radio.decreaseVolume();
        Assertions.assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void shouldBelowMinVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldBelowMinVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.decreaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }
}