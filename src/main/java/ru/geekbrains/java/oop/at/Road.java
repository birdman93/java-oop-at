package ru.geekbrains.java.oop.at;

public class Road implements Obstacle {
    private int length;

    public Road(int length) {
        this.length = length;
    }

    public void check(Action action) {
    action.run();
    action.setSuccess(action.get_run_distance() >= length);
    if (action.getSuccess()) {
        System.out.println("Испытание выполнено. Персонаж пробежал дистанцию длиной: " + length);
    } else {
        System.out.println("Испытание провалено. Персонаж не пробежал дистанцию длиной: " + length);
    }

    }
}
