package main.java.org.example.creational.absfactory.linux;

import main.java.org.example.creational.absfactory.IButton;

public class LinuxButton implements IButton {
    @Override
    public void paint() {
        System.out.println("You have created LinuxButton.");
    }
}
