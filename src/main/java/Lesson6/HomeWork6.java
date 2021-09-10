package Lesson6;

import Lesson6.Animals.Animals;
import Lesson6.Animals.Cats;
import Lesson6.Animals.Dogs;

public class HomeWork6 {

    public static void main(String[] Args) {
        int catCounter = 0;
        int dogCounter = 0;

        Animals[] animalsArray = {
                new Cats("Боня", 142, 3),
                new Cats("Кира", 60, 1),
                new Dogs("Шарик", 220, 6),
                new Dogs("Арчи", 130, 3),
                new Cats("Лизка", 180, 4)
        };

        for (Animals animal : animalsArray) {
            animal.animalRun();
            animal.animalSwim();
            if (animal instanceof Cats) {
                catCounter++;
            } else if (animal instanceof Dogs) {
                dogCounter++;
            }
        }
        System.out.printf("Количество котов: %s\n", catCounter);
        System.out.printf("Количество собак: %s\n", dogCounter);
        System.out.printf("Общее количество животных: %s\n", catCounter + dogCounter);
    }
}

