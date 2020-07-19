package ru.vtsybin.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;


public class TestSpring {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Computer computer = context.getBean("computer", Computer.class);

        while(true) {

            System.out.println("Введите жанр музыки: ");
            Scanner in = new Scanner(System.in);



            switch (in.next()) {

                case "CLASSICAL":
                    System.out.println(computer.toString(Genre.CLASSICAL));
                    break;
                case "ROCK":
                    System.out.println(computer.toString(Genre.ROCK));
                    break;

                case "1": return;

            }

            context.close();

        }

    }


}
