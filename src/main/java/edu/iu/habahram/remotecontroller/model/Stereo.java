package edu.iu.habahram.remotecontroller.model;

public class Stereo {
    private int volume;

    public String on() {
        return "Stereo is on";
    }

    public String off() {
        return "Stereo is off";
    }

    public String setCd() {
        return "Stereo is set for CD";
    }

    public String setDvd() {
        return "Stereo is set for DVD";
    }

    public String setRadio() {
        return "Stereo is set for Radio";
    }

    public String setVolume(int volume) {
        this.volume = volume;
        return "Stereo volume set to " + volume;
    }
}