/*
Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса. Эти классы должны уметь бегать и прыгать
(методы просто выводят информацию о действии в консоль).
————————————————————————
Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны выполнять соответствующие действия
бежать или прыгать), результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.). У препятствий есть длина
(для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
————————————————————————
Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
*/

package ru.geekbrains.java.oop.at;
import java.util.Random; // будем генерировать действия и параметры действий

import ru.geekbrains.java.oop.at.Obstacle;
import ru.geekbrains.java.oop.at.Road;
import ru.geekbrains.java.oop.at.Wall;
import ru.geekbrains.java.oop.at.Cat;
import ru.geekbrains.java.oop.at.Human;
import ru.geekbrains.java.oop.at.Robot;
import ru.geekbrains.java.oop.at.Action;

public class Main {

    public static void main(String[] args) {

/* Нагенерируем доступные параметры действий для каждого из 3-х персонажей*/
    Random random = new Random();

/* Создаем массив для наших персонажей*/
    Action[] actions = new Action[3];

/* Заполняем созданный массив */
    int jump_height = random.nextInt(7);
    int run_distance = random.nextInt(15);
    actions[0] = new Human("Иван", jump_height, run_distance);

    jump_height = random.nextInt(7);
    run_distance = random.nextInt(15);
    actions[1] = new Robot("Бэндер", jump_height, run_distance);

    jump_height = random.nextInt(7);
    run_distance = random.nextInt(15);
    actions[2] = new Cat("Матильда", jump_height, run_distance);

/* Работа с полосой препятствий */

    Obstacle[] obstacle = new Obstacle[4];

    int distance = random.nextInt(15);
    obstacle[0] = new Road(distance);

    distance = random.nextInt(15);
    obstacle[1] = new Road(distance);

    int height = random.nextInt(7);
    obstacle[2] = new Wall(height);

    height = random.nextInt(7);
    obstacle[3] = new Wall(height);

    System.out.println("Старт состязания.");
    for (int i = 0; i < obstacle.length; i++) {
        System.out.println("\n\nИспытание " + (i + 1));
        for (Action action : actions) {
            if (action.getSuccess()) {
                System.out.println("------------");
                obstacle[i].check(action);
            }

        }
    }
    }
}
