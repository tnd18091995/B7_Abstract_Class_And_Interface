package Bai_thuc_hanh_animal;


public class Main {
    public static void main(String[] args) {
        Animal [] animals = new Animal[2];
        Animal c1 = new Chicken();
        Animal t1 = new Tiger();
        animals[0] = new Chicken();
        animals[1] = new Tiger();
        System.out.println(c1.makeSound());
        System.out.println(t1.makeSound());
        for(Animal animal : animals){
            System.out.println(animal.makeSound());
            if(animal instanceof Chicken){
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }
    }
}
