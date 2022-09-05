public class Ravenclaw extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, String surname, int magic, int transgression, int intelligence, int wisdom, int wit, int creativity) {
        super(name, surname, magic, transgression);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return this.intelligence;
    }

    public int getWisdom() {
        return this.wisdom;
    }

    public int getWit() {
        return this.wit;
    }

    public int getCreativity() {
        return this.creativity;
    }
}
