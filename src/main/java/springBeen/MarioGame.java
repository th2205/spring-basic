package springBeen;

import org.springframework.stereotype.Component;


public class MarioGame implements GameConsole {
    public void up() {
        System.out.println("Jump");
    }

    public void down() {
        System.out.println("Go down");
    }

    public void left() {
        System.out.println("Go left");
    }

    public void right() {
        System.out.println("Go right");
    }

    public void printGameName() {
        System.out.println("Mario Game");
    }
}
