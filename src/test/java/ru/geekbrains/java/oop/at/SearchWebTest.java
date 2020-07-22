package ru.geekbrains.java.oop.at;

/*
Перейти на сайт https://geekbrains.ru/courses
Нажать на кнопку Поиск
В поле Поиск ввести текст: java
Проверить что на странице:
Профессий не менее чем 2
Курсов более 15
Вебинаров больше чем 180, но меньше 300
В вебинарах отображается первым “Java Junior. Что нужно знать для успешного собеседования?”
Блогов более 300
Форумов не 350
Тестов не 0
В Проектах и компаниях отображается GeekBrains
*/

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import ru.geekbrains.java.oop.at.base.BaseWebTest;

import static org.hamcrest.Matchers.*;

public class SearchWebTest extends BaseWebTest {

    @BeforeEach
    public void checkSearch() throws InterruptedException {

        // Выполнил задание с выводом результатов в консоль

        // Переходим на страницу "Курсы"
        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/courses\"]")).click();

        // Закрываем всплывающий поп-ап
        chromeDriver.findElement(By.cssSelector("button [class=\"svg-icon icon-popup-close-button \"]")).click();

        // Кликаем на кнопку "Поиск"
        chromeDriver.findElement(By.cssSelector("[class=\"show-search-form\"] [class=\"svg-icon icon-search \"]")).click();
        // Вводим в поисковую строку "java"
        chromeDriver.findElementByCssSelector("input[class=\"search-panel__search-field\"]")
                .sendKeys("java");
    }

    // Проверяем, что профессий не менее 2-х
    @Test
    void professions() {
        String professions_word = chromeDriver.findElement(By.cssSelector("[class=\"search-page-tabs\"] [data-tab=\"professions\"] span")).getText();
        int professions_count = Integer.parseInt(professions_word);
        MatcherAssert.assertThat(professions_count, greaterThan(2));
    }

        // Проверяем, что курсов более 15
    @Test
    void courses() {
        String courses_word = chromeDriver.findElement(By.cssSelector("[class=\"search-page-tabs\"] [data-tab=\"courses\"] span")).getText();
        int courses_count = Integer.parseInt(courses_word);
        MatcherAssert.assertThat(courses_count, greaterThan(15));
    }

        // Проверяем, что вебинаров больше чем 180, но меньше 300
    @Test
    void webinars() {
        String webinars_word = chromeDriver.findElement(By.cssSelector("[class=\"search-page-tabs\"] [data-tab=\"webinars\"] span")).getText();
        int webinars_count = Integer.parseInt(webinars_word);
        MatcherAssert.assertThat(webinars_count, greaterThan(180));
        MatcherAssert.assertThat(webinars_count, lessThan(300));
    }

        // Проверяем, что блогов более 300
    @Test
    void blogs() {
        String blogs_word = chromeDriver.findElement(By.cssSelector("[class=\"search-page-tabs\"] [data-tab=\"blogs\"] span")).getText();
        int blogs_count = Integer.parseInt(blogs_word);
        MatcherAssert.assertThat(blogs_count, greaterThan(300));
    }

        // Проверяем, что форумов не 350
    @Test
    void forums() {
        String forums_word = chromeDriver.findElement(By.cssSelector("[class=\"search-page-tabs\"] [data-tab=\"forums\"] span")).getText();
        int forums_count = Integer.parseInt(forums_word);
        MatcherAssert.assertThat(forums_word, not(350));
    }

        // Проверяем, что тестов не 0
    @Test
    void tests() {
        String tests_word = chromeDriver.findElement(By.cssSelector("[class=\"search-page-tabs\"] [data-tab=\"tests\"] span")).getText();
        int tests_count = Integer.parseInt(tests_word);
        MatcherAssert.assertThat(tests_count, not(0));
    }
        // Проверяем, что в Проектах и компаниях отображается GeekBrains (тут без вывода рез-та)
    @Test
    void GeekBrains () {
        chromeDriver.findElement(By.cssSelector("h3 [href=\"/career/682\"]"));
    }

    // Проверяем, что в вебинарах отображается первым “Java Junior. Что нужно знать для успешного собеседования?”
    @Test
    void Java_Junior () {
        chromeDriver.findElement(By.xpath(".//*[text()='Java Junior. Что нужно знать для успешного собеседования?']/.."));
    }
}


/*  Код урока, который не пригодился в ДЗ:
        wait15second.until(ExpectedConditions.textToBePresentInElement(
                chromeDriver.findElementByCssSelector("[id=\"professions\"] h2"), "Профессии"));
        chromeDriver.findElementByXPath("//h2[text()='Курсы']");
        chromeDriver.findElementByXPath("//h2[text()='Вебинары']");
        chromeDriver.findElementByXPath("//h2[text()='Блоги']");
        chromeDriver.findElementByXPath("//h2[text()='Форум']");
        chromeDriver.findElementByXPath("//h2[text()='Профессии']");
        chromeDriver.findElementByXPath("//h2[text()='Проекты и компании']");
*/