package ru.geekbrains.java.oop.at;

public class Wall extends Obstacle {
    private int height;

    public Wall(String name, int height) {
        super(name);
        this.height = height;
    }

    public int get_length() {
        return height;
    }

    @Override
    protected boolean moving(Action action) {
        System.out.println("Высота препятствия: " + this.height);
        action.run();
        if(action.get_run_distance() >= get_length()) {
            System.out.println("Препятсвие преодолено");
            return true;
        } else {
            System.out.println("Препятсвие не было преодолено");
            return false;
        }
    }
}
