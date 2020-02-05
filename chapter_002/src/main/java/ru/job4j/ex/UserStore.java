package ru.job4j.ex;

/**
 * Класс - хранилище пользователей
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 05.02.2020
 * @version 1.0
 */
public class UserStore {
    /**
     * Поиск пользователя в хранилище
     * @param users - список пользователей
     * @param login - ключ для поиска
     * @return - объект - пользователь
     * @throws UserNotFoundException - исключение, если пользователь не найдет
     */
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User user: users) {
            if (user.getUsername().equals(login)) {
                return user;
            }
        }
        throw new UserNotFoundException("User not found");
    }

    /**
     * Проверка пользователя на валидность
     * @param user - пользователь
     * @return - истина, если пользователь валидный
     * @throws UserInvalidException - исключение, если пользователь невалидный
     */
    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("Invalid user");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true),
                new User("Ed", true),
                new User("Vasya Pupkin", false)
        };
        String[] logins = {"Petr Arsentev", "Ed", "Vasya Pupkin", "Joe"};

        try {
            for (String login: logins) {
                User user = findUser(users, login);
                if (validate(user)) {
                    System.out.println("User " + login + " has an access");
                }
            }
        } catch (UserInvalidException ie) {
            ie.printStackTrace();
        } catch (UserNotFoundException nfe) {
            nfe.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
