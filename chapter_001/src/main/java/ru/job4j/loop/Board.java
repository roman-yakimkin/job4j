package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height){
        for(int row = 0; row < width; row++){
            for(int cell = 0; cell < height; cell++){
                System.out.print((row + cell) % 2 == 0 ? "X" : " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(3,3);
        System.out.println();
        paint(4,4);
        System.out.println();
        paint(8,8);
    }
}
