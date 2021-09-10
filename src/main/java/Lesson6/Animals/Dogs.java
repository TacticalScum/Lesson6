package Lesson6.Animals;

    public class Dogs extends Animals {

        public Dogs(String name, int animalRun, int animalSwim) {
            super(name, animalRun, animalSwim);
        }

        @Override
        public void animalRun() {
            if (this.animalRun <= 500) {
                System.out.printf("Собака %s пробежал %s метров\n", this.name, this.animalRun);
            } else {
                System.out.printf("Собака %s не может пробежать больше 500 метров\n", this.name);
            }
        }

        @Override
        public void animalSwim() {
            if (this.animalRun <= 10) {
                System.out.printf("Собака %s проплыл %s метров\n", this.name, this.animalRun);
            } else {
                System.out.printf("Собака %s не может проплыть более 10 метров\n", this.name);
            }
            System.out.println(" ");
        }
    }

