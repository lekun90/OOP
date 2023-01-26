public class Human {
    private String surname;
    private String name;

    public Human(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    @Override
    public String toString() {
        return surname + ' ' + name + ' ';
    }

    // человек двигает шкаф
    public void move(Wardrobe wardrobe) { System.out.println(toString() + "подвинул " + Wardrobe.TYPE); }

    // человек протёр стол
    public void wipe(Table table) {
        System.out.println(toString() + "протёр " + Table.TYPE);
    }
}
