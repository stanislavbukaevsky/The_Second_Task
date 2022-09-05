public class Hufflepuff extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honor;


    public Hufflepuff(String name, String surname, int magic, int transgression, int diligence, int loyalty, int honor) {
        super(name, surname, magic, transgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honor = honor;

    }

    public int getDiligence() {
        return this.diligence;
    }

    public int getLoyalty() {
        return this.loyalty;
    }

    public int getHonor() {
        return this.honor;
    }
}
