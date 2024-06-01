package UzumHomeWorksJaloliddinMustafoev;

public class Lion implements Animal {
    private String name;

    public Lion(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String makeSound() {
        return "Roar";
    }
}
