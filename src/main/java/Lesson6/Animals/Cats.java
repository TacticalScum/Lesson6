package Lesson6.Animals;

public class Cats extends Animals {

    public Cats(String name, int animalRun, int animalSwim) {
        super(name, animalRun, animalSwim);
    }

    @Override
    public void animalRun() {
        if (this.animalRun <= 200) {
            System.out.printf("Кошка %s пробежала %s метров\n", this.name, this.animalRun);
        } else {
            System.out.printf("Кошка %s не может пробежать больше 200 метров\n", this.name);
        }
    }

    @Override
    public void animalSwim() {
        System.out.printf("Кошка %s не умеет плавать\n", this.name);
        System.out.println(" ");
    }
}
