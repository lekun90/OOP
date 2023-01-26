
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Family family = new Family();
        Person alla = new Person("Алла", "Иванова", "12/10/2020", family);
        Person ket = new Person("Катя", "Петрова", "12/12/2020", family);
        Person ira = new Person("Ирина", "Сидорова", "12/10/2020", family);
        Person lora = new Person("Лора", "Ликова", "12/12/2020", family);
        Person masha = new Person("Маша", "Машова", "12/12/2020", family);
        Person alik = new Person("Алик", "Ликов", "12/12/2020", family);
        Person vanya = new Person("Ваня", "Алов", "12/12/2020", family);
        Person vova = new Person("Вова", "Вовин", "12/12/2020", family);
        Person tolya = new Person("Толя", "Толин", "12/12/2020", family);

        tolya.setParents(List.of(ket, alik));
        ira.setParents(List.of(masha, vova));

        tolya.addChildren(lora);
        alik.addChildren(masha);

        lora.addSiblings(tolya);
        tolya.addSiblings(ira);

        family.setName("Алова");
        family.setFather(vanya);
        family.setMother(alla);
        family.setChildren(List.of(tolya, masha));

        System.out.println("\nРанг:");
        Person.printFamilyTree(alik, 0);

        System.out.println("\nДети:");
        tolya.printChildren();

        System.out.println("\nИнфо:");
        alik.printInfo();
        vova.printInfo();
    }
}