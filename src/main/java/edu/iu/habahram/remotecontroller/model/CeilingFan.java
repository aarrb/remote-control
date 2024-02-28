package edu.iu.habahram.remotecontroller.model;

public class CeilingFan {
    public enum Speed { HIGH, MEDIUM, LOW, OFF }
    private Speed speed;

    public CeilingFan() {
        speed = Speed.OFF; // default to off
    }

    public String high() {
        speed = Speed.HIGH;
        return "Ceiling fan is on high";
    }

    public String off() {
        speed = Speed.OFF;
        return "Ceiling fan is off";
    }

    public Speed getSpeed() {
        return speed;
    }
}