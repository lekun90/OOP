public class Main {
    public static void main(String[] args) {
        Human ivan = new Human("Петров", "Иван");
        Wardrobe wrd = new Wardrobe("БИЛТ", "Дерево", 5000, 50, 200, 50);
        Table tbl = new Table("Столплит", "Стекло", 3000, 100);

        ivan.move(wrd);     // Взаимодействие человека и шкафа
        ivan.wipe(tbl);     // Взаимодействие человека и стола
    }
}