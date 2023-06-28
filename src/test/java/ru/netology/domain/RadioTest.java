package ru.netology.domain;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class RadioTest {


    @Test
    public void shouldMaxStationByDefault() {
        Radio radio = new Radio();

        Assertions.assertEquals(9, radio.getMaxStation());

    }

    @Test
    public void shouldSetStationMinByDefault() {
        Radio radio = new Radio();

        Assertions.assertEquals(0, radio.getMinStation());
    }


    @Test
    public void shouldNotSetStationAboveMaxByDefault() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetStationBelowMinByDefault() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        Assertions.assertEquals(0, radio.getCurrentStation());
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

}