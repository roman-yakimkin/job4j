package ru.job4j.tracker;

import ru.job4j.oop.Transport;

/**
 * Реализация консольного интерфейса для трекера заявок
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 30.01.2020
 * @version 2.0
 */
public class StartUI {

    /**
     * Инициализация и цикл работы консольного интерфейса
     * @param input - реализация интерфейса "сканер"
     * @param tracker - класс - трекер
     */
    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        do {
            showMenu(actions);
            int menuItem = input.askInt("Select a number from 0 to 6  ");
            UserAction action = actions[menuItem];
            run = action.execute(input, tracker);
        } while (run);
    }

    /**
     * Отобразить консольное меню
     */
    private void showMenu(UserAction[] actions) {
        System.out.println("Menu. ");
        for (int i=0; i < actions.length; i++) {
            System.out.println(i + ". " + actions[i].name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(),
                new ShowAllAction(),
                new ReplaceAction(),
                new DeleteAction(),
                new FindByIdAction(),
                new FindByNameAction(),
                new ExitAction()
        };
        new StartUI().init(input, tracker, actions);
    }
}
