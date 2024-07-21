package main.java.org.example.creational.builder;

public class Computer {
    private final String cpu;
    private final String mainboard;
    private final String memory;
    private final String storage;
    private final String os;
    private final String camera;
    private final String monitor;
    private final String keyboard;
    private final String mouse;

    public static class Builder {
        // Required parameters
        private final String cpu;

        // Optional parameters
        private String mainboard = null;
        private String memory = null;
        private String storage = null;
        private String os = null;
        private String camera = null;
        private String monitor = null;
        private String keyboard = null;
        private String mouse = null;

        public Builder(String cpu) {
            this.cpu = cpu;
        }

        public Builder mainboard(String mainboard) {
            this.mainboard = mainboard;
            return this;
        }

        public Builder memory(String memory) {
            this.memory = memory;
            return this;
        }

        public Builder storage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder os(String os) {
            this.os = os;
            return this;
        }

        public Builder camera(String camera) {
            this.camera = camera;
            return this;
        }

        public Builder monitor(String monitor) {
            this.monitor = monitor;
            return this;
        }

        public Builder keyboard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }

        public Builder mouse(String mouse) {
            this.mouse = mouse;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    private Computer(Builder builder) {
        cpu = builder.cpu;
        mainboard = builder.mainboard;
        memory = builder.memory;
        storage = builder.storage;
        os = builder.os;
        camera = builder.camera;
        monitor = builder.monitor;
        keyboard = builder.keyboard;
        mouse = builder.mouse;
    }

    public String getCpu() {
        return cpu;
    }

    public String getOs() {
        return os;
    }

    public static void main(String[] args) {
        Computer computer = new Builder("Intel® Core™ i5-14400 × 16")
                .mainboard("ASUS TUF GAMING B760M-E D4")
                .memory("32.0 GiB")
                .storage("250.1 GB")
                .monitor("Intel® Graphics (RPL-S)")
                .os("Ubuntu 24.04 LTS")
                .build();

        System.out.println(computer.getCpu());
        System.out.println(computer.getOs());
    }

}
