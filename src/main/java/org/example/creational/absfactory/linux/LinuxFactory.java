package main.java.org.example.creational.absfactory.linux;

import main.java.org.example.creational.absfactory.IButton;
import main.java.org.example.creational.absfactory.ICheckbox;
import main.java.org.example.creational.absfactory.IGUIFactory;

public class LinuxFactory implements IGUIFactory {
    @Override
    public IButton createButton() {
        return new LinuxButton();
    }

    @Override
    public ICheckbox createCheckbox() {
        return new LinuxCheckbox();
    }
}
