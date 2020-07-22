package ru.geekbrains.java.oop.at;

/*
1. Вынести проверку каждой страницы в отдельный тест
2. Реализовать проверку отображения блоков Header и Footer на каждой странице сайта (как минимум самого блока)
*/

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import ru.geekbrains.java.oop.at.base.BaseTest;

public class NavigationTest extends BaseTest {

/*
2.1. В хэдере каждой странице есть класс gb-header__title, поэтому добавим првоерку на поиск этого класса.
2.2. Футер также статичен, поэтому для поиска подойдет любой вариант, остановимся на ссылке, которая ведет в Инстаграм ГБ:
[href="//www.instagram.com/geekbrains.ru"], плюс кликнем по ней с каждой из страниц, раз умеем это делать:)
*/

    @Test
    public void topics() throws InterruptedException {
        chromeDriver.findElement(By.cssSelector("[class = gb-header__title]"));
        chromeDriver.findElement(By.cssSelector("[href=\"//www.instagram.com/geekbrains.ru\"]")).click();
        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/topics\"]")).click();
        Assertions.assertEquals(
                "Форум",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
        );
    }

    @Test
    public void posts() throws InterruptedException {
        chromeDriver.findElement(By.cssSelector("[class = gb-header__title]"));
        chromeDriver.findElement(By.cssSelector("[href=\"//www.instagram.com/geekbrains.ru\"]")).click();
        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/posts\"]")).click();
        Assertions.assertEquals(
                "Блог",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
        );
    }

    @Test
    public void vebinars() throws InterruptedException {
        chromeDriver.findElement(By.cssSelector("[class = gb-header__title]"));
        chromeDriver.findElement(By.cssSelector("[href=\"//www.instagram.com/geekbrains.ru\"]")).click();
        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/events\"]")).click();
        Assertions.assertEquals(
                "Вебинары",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
        );
    }

    @Test
    public void tests() throws InterruptedException {
        chromeDriver.findElement(By.cssSelector("[class = gb-header__title]"));
        chromeDriver.findElement(By.cssSelector("[href=\"//www.instagram.com/geekbrains.ru\"]")).click();
        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/tests\"]")).click();
        Assertions.assertEquals(
                "Тесты",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
        );
    }

    @Test
    public void carier() throws InterruptedException {
        chromeDriver.findElement(By.cssSelector("[class = gb-header__title]"));
        chromeDriver.findElement(By.cssSelector("[href=\"//www.instagram.com/geekbrains.ru\"]")).click();
        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/career\"]")).click();
        Assertions.assertEquals(
                "Карьера",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
        );
    }

    @Test
    public void courses() throws InterruptedException {
        chromeDriver.findElement(By.cssSelector("[class = gb-header__title]"));
        chromeDriver.findElement(By.cssSelector("[href=\"//www.instagram.com/geekbrains.ru\"]")).click();
        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/courses\"]")).click();
        Assertions.assertEquals(
                "Курсы",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
        );
    }
}

// Строки для закрытия поп-апов (не пригодились при атомарных тестах):
//  chromeDriver.findElement(By.cssSelector("[class=\"gb-empopup-close\"]")).click();
//  chromeDriver.findElement(By.cssSelector("button [class=\"svg-icon icon-popup-close-button \"]")).click();