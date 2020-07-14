package ru.geekbrains.java.oop.at;

public class Wall implements Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public void check(Action action) {
        action.jump();
        action.setSuccess(action.get_jump_height() >= height);
        if (action.getSuccess()) {
            System.out.println("Испытание выполнено. Персонаж подпрыгнул на высоту: " + height);
        } else {
            System.out.println("Испытание провалено. Персонаж не подпрыгнул на высоту: " + height);
        }
    }
}
