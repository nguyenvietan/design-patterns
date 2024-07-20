package main.java.org.example.creational.singleton;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    // step 1: create a private static instance of Logger
    private static Logger INSTANCE;

    // step 2: create a private constructor to prevent instantiation
    private Logger() {}

    // step 3: provide a public static method to get the instance of Logger
    public static Logger getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Logger();
        }
        return INSTANCE;
    }

    public void log(String message) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String timestamp = sdf.format(new Date());
        System.out.printf("[%s] %s\n", timestamp, message);
    }

    public static void main(String[] args) {
        Logger logger0 = Logger.getInstance();
        logger0.log("HELLO WORLD!");

        Logger logger1 = Logger.getInstance();
        logger1.log("HI THERE!");

        System.out.println(logger0 == logger1); // true
    }
}