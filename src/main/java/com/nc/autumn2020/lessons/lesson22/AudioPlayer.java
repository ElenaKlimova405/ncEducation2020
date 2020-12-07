package com.nc.autumn2020.lessons.lesson22;

public class AudioPlayer {
    private Radio currentRadio;

    public AudioPlayer(Radio currentRadio) {
        this.currentRadio = currentRadio;
    }

    public void playSongs() {
        if (this.currentRadio != null)
            currentRadio.play();
        else
        {
            System.out.println("Выберите радио");
        }
    }

    public void selectAnotherRadio(Radio currentRadio) {
        this.currentRadio = currentRadio;
    }

}
