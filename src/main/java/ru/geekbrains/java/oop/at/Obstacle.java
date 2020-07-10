package ru.geekbrains.java.oop.at;

public abstract class Obstacle {
    private String name;

    public Obstacle(String name) {
        this.name = name;
    }

    protected abstract boolean moving(Action action);

    public String get_name() {
        return name;
    }
}
