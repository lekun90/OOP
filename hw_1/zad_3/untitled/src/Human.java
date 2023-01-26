public class Human {
    private String surname;
    private String name;

    public Human(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }
    // Взаимодействие человека и кота (человек гладит кота, кот отвечает)
    public void calling(Object obj) {
        if (obj instanceof Cat) {
            System.out.println(surname + " " + name + " зовет кота по имени " + ((Cat) obj).getName());
            ((Cat) obj).voice();
        }
    }

    @Override
    public String toString() {
        return surname + ' ' + name + ' ';
    }
}
