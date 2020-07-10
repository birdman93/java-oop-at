package ru.geekbrains.java.oop.at;

public class Human implements Action {
    private String name;
    private int jump_height;
    private int run_distance;

    public Human(String name, int jump_height, int run_distance) {
        this.name = name;
        this.jump_height = jump_height;
        this. run_distance = run_distance;
    }

    @Override
    public void jump(){
        System.out.println("Человек " + this.name + " прыгает " + this.get_jump_height());
    }

    @Override
    public void run(){
        System.out.println("Человек " + this.name + " бегает " + this.get_run_distance());
    }

    @Override
    public int get_jump_height(){
        return this.jump_height;
    }

    @Override
    public int get_run_distance(){
        return this.run_distance;
    }
}

