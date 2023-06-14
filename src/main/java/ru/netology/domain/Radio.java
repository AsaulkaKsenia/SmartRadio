package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {

        return currentStation;
    }


    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 9) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextStation() {
        if (getCurrentStation() == 9) {
            setCurrentStation(0);
        } else {
            setCurrentStation(getCurrentStation() + 1);
        }
    }

    public void prevStation() {
        if (getCurrentStation() == 0) {
            setCurrentStation(9);
        } else {
            setCurrentStation(getCurrentStation() - 1);
        }
    }


    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void louderVolume() {
        if (getCurrentVolume() == 100) {
            return;
        } else {
            setCurrentVolume(getCurrentVolume() + 1);
        }
    }

    public void silenceVolume() {
        if (getCurrentVolume() == 0) {
            return;
        } else {
            setCurrentVolume(getCurrentVolume() - 1);
        }
    }
}

