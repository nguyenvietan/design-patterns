package main.java.org.example.creational.absfactory.macos;

import main.java.org.example.creational.absfactory.IButton;

public class MacOSButton implements IButton {
    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}
