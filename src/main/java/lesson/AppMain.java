package lesson;

public class AppMain {

    public static void main(String[] args) {

        TestClass testClass = new TestClass<>(new Dog(5));

        System.out.println(testClass.getAnimalName(new Cat(3), new Dog(5)));

    }
}
