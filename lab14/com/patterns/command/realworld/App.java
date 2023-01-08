package com.patterns.command.realworld;

public class App {
    public static void main(String[] args) {
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);
        Switch lightSwitch = new Switch(lightOn, lightOff);
        lightSwitch.flipUp();
        lightSwitch.flipDown();

        Fan fan = new Fan();
        FanOnCommand fanOn = new FanOnCommand(fan);
        FanOffCommand fanOff = new FanOffCommand(fan);
        Switch fanSwitch = new Switch(fanOn, fanOff);
        fanSwitch.flipUp();
        fanSwitch.flipDown();
    }
}
