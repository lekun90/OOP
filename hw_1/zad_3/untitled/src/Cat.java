public class Cat extends Animal{
    private final String type = "Кот";
    private String breed;
    private String typeOfWool;

    public Cat(String name, String colour, String gender,  String breed, String typeOfWool) {
        super(name, colour, gender);
        this.breed = breed;
        this.typeOfWool = typeOfWool;
    }

    public void voice() {
        System.out.println(type + " " + this.getName() + " мяучит");
    }
}
