package ru.geekbrains.java.oop.at;

public class Road extends Obstacle {
    private int length;

    public Road(String name, int length) {
        super(name);
        this.length = length;
    }

    public int get_length() {
        return length;
    }

    @Override
    protected boolean moving(Action action) {
        System.out.println("Дистанция пробежки: " + this.length);
    action.run();
    if(action.get_run_distance() >= get_length()) {
        System.out.println("Дистанция преодолена");
        return true;
    } else {
        System.out.println("Дистанция не была преодолена");
        return false;
    }
    }
}
