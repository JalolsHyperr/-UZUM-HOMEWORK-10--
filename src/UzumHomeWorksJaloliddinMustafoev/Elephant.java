package UzumHomeWorksJaloliddinMustafoev;

public class Elephant implements Animal {
    private String name;

    public Elephant(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String makeSound() {
        return "Trumpet";
    }
}
