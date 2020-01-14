package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number){
        int finish = (int)Math.floor(Math.sqrt(number));
        boolean is_prime_number = (number > 1);
        for (int i = 2; i <= finish; i++){
            if (number % i == 0){
                is_prime_number = false;
                break;
            }
        }
        return is_prime_number;
    }
}
