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

    public static void comparisonOfStudents(Hufflepuff studentOne, Hufflepuff studentTwo) {
        int comparisonOne = studentOne.getDiligence() + studentOne.getLoyalty() + studentOne.getHonor();
        int comparisonTwo = studentTwo.getDiligence() + studentTwo.getLoyalty() + studentTwo.getHonor();

        if (comparisonOne > comparisonTwo) {
            System.out.println(studentOne.getName() + " " + studentOne.getSurname() + " лучший пуфендуец, чем " + studentTwo.getName() + " " + studentTwo.getSurname());
        } else if (comparisonTwo > comparisonOne) {
            System.out.println(studentTwo.getName() + " " + studentTwo.getSurname() + " лучший пуфендуец, чем " + studentOne.getName() + " " + studentOne.getSurname());
        } else if (comparisonOne == comparisonTwo) {
            System.out.println(studentOne.getName() + " " + studentOne.getSurname() + " одинаково сильны в мощности магии, как " + studentTwo.getName() + " " + studentTwo.getSurname());
        }
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

    @Override
    public String toString() {
        return "СТУДЕНТ ФАКУЛЬТЕТА ПУФФЕНДУЙ:" + "\n" + "Имя: " + getName() + "; Фамилия: " + getSurname() + "; Магия: " + getMagic() + "; Трансгрессия: " + getTransgression() + "; Трудолюбие: " + getDiligence() + "; Верность: " + getLoyalty() + "; Честь: " + getHonor() + ".";
    }
}
