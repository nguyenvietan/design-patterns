package main.java.org.example.creational.absfactory.macos;

import main.java.org.example.creational.absfactory.ICheckbox;

public class MacOSCheckbox implements ICheckbox {
    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckBox.");
    }
}
