package Bai_thuc_hanh_animal;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "O o O";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
