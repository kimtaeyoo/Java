package Homework;

class Monitor{
    private String monitorSize;
    private String color;
    private String power;
    Monitor(String monitorSize, String color, String power){
        this.monitorSize = monitorSize;
        this.color = color;
        this.power = power;
    }
    public void turnOn(){
        System.out.println("Turning on the monitor.");
    }
    public void printInfo(){
        System.out.println("The spec of the monitor");
        System.out.println(" Size: "+monitorSize);
        System.out.println(" Color: "+color);
        System.out.println(" Power: "+power);
    }
}

class Computer{
    private String cpu;
    private String memory;
    private String hd;
    private String color;
    private String power;
    Computer(String cpu, String memory, String hd, String color, String power){
        this.cpu = cpu;
        this.memory = memory;
        this.hd = hd;
        this.color = color;
        this.power = power;
    }
    public void turnOn(){
        System.out.println("Turning on the computer.");
    }
    public void printInfo(){
        System.out.println("The spec of the computer");
        System.out.println(" CPU: "+cpu);
        System.out.println(" Memory: "+memory);
        System.out.println(" HDD: "+hd);
        System.out.println(" Color: "+color);
        System.out.println(" Power: "+power);
    }
}

class PersonalComputer{
    private Computer computer;
    private Monitor monitor;
    PersonalComputer(Computer computer, Monitor monitor){
        this.monitor = monitor;
        this.computer = computer;
    }
    public void printInfo(){
        computer.printInfo();
        monitor.printInfo();
    }
    public void turnOn(){
        computer.turnOn();
        monitor.turnOn();
    }
}

public class Homework5 {
    public static void main(String[] args) {
        Monitor m1 = new Monitor("32인치","검은색","45W");
        Computer c1 = new Computer("Core i7","32GB","2TB","흰색","700W");
        PersonalComputer p1 = new PersonalComputer(c1,m1);
        p1.turnOn();
        p1.printInfo();
    }
}
