public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Масик","серый", "мальчик", "Мейн-кун", "длинные");
        Human human = new Human("Петров", "Иван");

        human.calling(cat);    // Взаимодействие человека и кота
    }
}