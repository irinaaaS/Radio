package ru.netology.radio;


public class Radio {

    public int currentStation;
    public int currentVolume;
    public int quantityStation;

    public Radio() {
        this.quantityStation = 20;
    }

    public Radio(int quantityStation) {
        this.quantityStation = quantityStation;
    }

    public void next() {
        if (currentStation < quantityStation - 1) {
            currentStation++;
        } else {
            currentStation = 0;
        }

    }

    public void prev() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = quantityStation - 1;
        }

    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;

        }

    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > quantityStation - 1) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;


    }
}
