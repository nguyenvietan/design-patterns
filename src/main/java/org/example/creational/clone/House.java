package main.java.org.example.creational.clone;

public class House {
    private final String location;
    private final int floors;
    private final double area;

    public House(String location, int floors, double area) {
        this.location = location;
        this.floors = floors;
        this.area = area;
    }

    @Override
    public House clone() {
        return new House(location, floors, area);
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof House)) return false;
        House house2 = (House) object;
        return this.location.equals(house2.location) &&
                this.floors == house2.floors &&
                this.area == house2.area;
    }

    public static void main(String[] args) {
        House house = new House("Ngoc thuy, Long Bien, Hanoi, Vietnam", 4, 33.4);
        House houseCopied = house.clone();
        System.out.println(house == houseCopied); // false
        System.out.println(house.equals(houseCopied)); // true
    }
}
