package main.java.org.example.creational.absfactory;

import main.java.org.example.creational.absfactory.linux.LinuxFactory;
import main.java.org.example.creational.absfactory.macos.MacOSFactory;

public class Main {

    public static void main(String[] args) {
        IGUIFactory guiFactory = new LinuxFactory();
        Application app = new Application(guiFactory);
        app.paint();

        guiFactory = new MacOSFactory();
        app = new Application(guiFactory);
        app.paint();
    }

}
