public class Animal {
    private String name;    // имя
    private String colour;  // цвет

    private String gender;

    public Animal(String name, String colour, String gender) {
        this.name = name;
        this.colour = colour;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
