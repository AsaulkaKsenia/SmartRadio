package ru.netology.domain;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {


    @Test
    public void shouldSetMaxStation() {
        Radio radio = new Radio(56);

        Assertions.assertEquals(56, radio.getMaxStation());


    }

    @Test
    public void shouldMaxStationByDefault() {
        Radio radio = new Radio();

        Assertions.assertEquals(10, radio.getMaxStation());

    }

    @Test
    public void shouldSetStationMin() {
        Radio radio = new Radio(44);

        Assertions.assertEquals(0, radio.getMinStation());
    }

    @Test
    public void shouldSetStationMinByDefault() {
        Radio radio = new Radio();

        Assertions.assertEquals(0, radio.getMinStation());
    }


    @Test
    public void shouldNotSetStationAboveMax() {
        Radio radio = new Radio(70);

        radio.setCurrentStation(75);

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetStationAboveMaxByDefault() {
        Radio radio = new Radio();

        radio.setCurrentStation(11);

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetStationBelowMin() {
        Radio radio = new Radio(55);

        radio.setCurrentStation(-1);

        Assertions.assertEquals(0, radio.getCurrentStation());
    }


    @Test
    public void shouldNotSetStationBelowMinByDefault() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldNextStation() {
        Radio radio = new Radio(55);

        radio.setCurrentStation(30);
        radio.nextStation();

        Assertions.assertEquals(31, radio.getCurrentStation());

    }

    @Test
    public void shouldNextStationByDefault() {
        Radio radio = new Radio();

        radio.setCurrentStation(6);
        radio.nextStation();

        Assertions.assertEquals(7, radio.getCurrentStation());

    }


    @Test
    public void shouldNextStationAboveMax() {
        Radio radio = new Radio(33);

        radio.setCurrentStation(33);
        radio.nextStation();

        Assertions.assertEquals(0, radio.getCurrentStation());

    }

    @Test
    public void shouldNextStationAboveMaxByDefault() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);
        radio.nextStation();

        Assertions.assertEquals(0, radio.getCurrentStation());

    }

    @Test
    public void shouldNextStationAboveMin() {
        Radio radio = new Radio(33);

        radio.nextStation();

        Assertions.assertEquals(1, radio.getCurrentStation());

    }

    @Test
    public void shouldNextStationAboveMinByDefault() {
        Radio radio = new Radio();

        radio.nextStation();

        Assertions.assertEquals(1, radio.getCurrentStation());

    }

    @Test
    public void shouldPrevStation() {
        Radio radio = new Radio(33);

        radio.setCurrentStation(15);
        radio.prevStation();

        Assertions.assertEquals(14, radio.getCurrentStation());

    }

    @Test
    public void shouldPrevStationByDefault() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);
        radio.prevStation();

        Assertions.assertEquals(7, radio.getCurrentStation());

    }


    @Test
    public void shouldPrevStationBeforeMax() {
        Radio radio = new Radio(45);

        radio.setCurrentStation(45);
        radio.prevStation();

        Assertions.assertEquals(44, radio.getCurrentStation());

    }

    @Test
    public void shouldPrevStationBeforeMaxByDefault() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);
        radio.prevStation();

        Assertions.assertEquals(9, radio.getCurrentStation());

    }

    @Test
    public void shouldPrevStationBeforeMin() {
        Radio radio = new Radio(45);

        radio.getMinStation();
        radio.prevStation();

        Assertions.assertEquals(45, radio.getCurrentStation());

    }

    @Test
    public void shouldPrevStationBeforeMinByDefault() {
        Radio radio = new Radio();

        radio.getMinStation();
        radio.prevStation();

        Assertions.assertEquals(10, radio.getCurrentStation());

    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(55);

        Assertions.assertEquals(55, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetVolumeMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetVolumeMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetVolumeBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldLouderVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(70);
        radio.louderVolume();

        Assertions.assertEquals(71, radio.getCurrentVolume());

    }

    @Test
    public void shouldLouderVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.louderVolume();

        Assertions.assertEquals(100, radio.getCurrentVolume());


    }

    @Test
    public void shouldLouderVolumeAboveMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.louderVolume();

        Assertions.assertEquals(1, radio.getCurrentVolume());

    }


    @Test
    public void shouldSilenceVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(45);
        radio.silenceVolume();

        Assertions.assertEquals(44, radio.getCurrentVolume());

    }

    @Test
    public void shouldSilenceVolumeBeforeMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.silenceVolume();

        Assertions.assertEquals(99, radio.getCurrentVolume());

    }

    @Test
    public void shouldSilenceVolumeBeforeMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.silenceVolume();

        Assertions.assertEquals(0, radio.getCurrentVolume());

    }
}