package ru.job4.oop;

/**
 *  Тестовый класс - переводчик
 * @author Roman Yakimkin (r.yakimkin@softech.ru)
 * @since 20.01.2020
 * @version 1.0
 */
public class DummyDic {

    /**
     * Перевод фразы с английского языка на русский
     * @param eng - исходная фраза на английском языке
     * @return - переведенная фраза на русском языке
     */
    public String engToRus(String eng) {
        String result = eng;
        return "Неизвестное слово. " + result;
    }

    /**
     * Статическая функция для запуска класса
     * @param args - аргументы для запуска
     */
    public static void main(String[] args) {
        DummyDic dic = new DummyDic();
        String result = dic.engToRus("word");
        System.out.println(result);
    }
}
