package ru.netology.domain;

public class Radio {
    private int minStation = 0;
    private int maxStation;
    private int currentStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;


    public Radio() {

        maxStation = 9;

    }

    public Radio(int maxStation) {
        this.maxStation = maxStation;
        minStation = getMinStation();
        currentStation = getCurrentStation();
    }

    public int getCurrentStation() {

        return currentStation;
    }

    public int getMaxStation() {

        return maxStation;
    }

    public int getMinStation() {

        return minStation;
    }


    public void setCurrentStation(int currentStation) {
        if (currentStation > getMaxStation()) {

            return;
        }
        if (currentStation < getMinStation()) {

            return;
        }

        this.currentStation = currentStation;
    }

    public void nextStation() {
        if (getCurrentStation() == getMaxStation()) {
            setCurrentStation(minStation);
        } else {
            setCurrentStation(getCurrentStation() + 1);
        }
    }

    public void prevStation() {
        if (getCurrentStation() == minStation) {
            setCurrentStation(getMaxStation());
        } else {
            setCurrentStation(getCurrentStation() - 1);
        }
    }


    public int getCurrentVolume() {

        return currentVolume;
    }


    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            return;
        }
        if (newCurrentVolume < minVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void louderVolume() {
        if (getCurrentVolume() == maxVolume) {
            return;
        } else {
            setCurrentVolume(getCurrentVolume() + 1);
        }
    }

    public void silenceVolume() {
        if (getCurrentVolume() == minVolume) {
            return;
        } else {
            setCurrentVolume(getCurrentVolume() - 1);
        }
    }
}
