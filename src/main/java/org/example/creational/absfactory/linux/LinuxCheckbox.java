package main.java.org.example.creational.absfactory.linux;

import main.java.org.example.creational.absfactory.ICheckbox;

public class LinuxCheckbox implements ICheckbox {
    @Override
    public void paint() {
        System.out.println("You have created LinuxCheckBox.");
    }
}
