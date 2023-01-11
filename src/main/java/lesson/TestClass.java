package lesson;

public class TestClass <T extends Animal, V extends Animal> {
    private T animal;

    public TestClass(T animal) {
        this.animal = animal;
    }

    public <S extends Animal, U extends Animal> String getAnimalName(S animal1, U animal2) {
        return animal1.getName() + animal2.getName() + animal1.getClass() + animal2.getClass();

    }

}