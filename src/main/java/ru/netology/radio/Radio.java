package ru.netology.radio;

public class Radio {

    protected int currentStation;
    protected int currentVolume;
    protected int maxStation;

    public Radio() {
        maxStation = 9;
    }

    public Radio(int stationsCount) {
        maxStation = stationsCount - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return maxStation;
        }
        if (newCurrentStation > maxStation) {
            return 0;
        }
        currentStation = newCurrentStation;
        return newCurrentStation;
    }

    public int setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return 0;
        }
        if (newCurrentVolume > 100) {
            return 100;
        }
        currentVolume = newCurrentVolume;
        return newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        } else {
            currentVolume = 100;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }
    }

    public void nextStation() {
        if (currentStation < maxStation) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }


}
