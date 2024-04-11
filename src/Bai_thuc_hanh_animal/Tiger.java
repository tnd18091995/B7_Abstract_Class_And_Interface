package Bai_thuc_hanh_animal;

public class Tiger extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Hm hm hm";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
