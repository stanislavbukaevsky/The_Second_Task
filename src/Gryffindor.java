public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, String surname, int magic, int transgression, int nobility, int honor, int bravery) {
        super(name, surname, magic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }


    public static void comparisonOfStudents(Gryffindor studentOne, Gryffindor studentTwo) {
        int comparisonOne = studentOne.getNobility() + studentOne.getHonor() + studentOne.getBravery();
        int comparisonTwo = studentTwo.getNobility() + studentTwo.getHonor() + studentTwo.getBravery();

        if (comparisonOne > comparisonTwo) {
            System.out.println(studentOne.getName() + " " + studentOne.getSurname() + " лучший грифиндорец, чем " + studentTwo.getName() + " " + studentTwo.getSurname());
        } else if (comparisonTwo > comparisonOne) {
            System.out.println(studentTwo.getName() + " " + studentTwo.getSurname() + " лучший грифиндорец, чем " + studentOne.getName() + " " + studentOne.getSurname());
        } else if (comparisonOne == comparisonTwo) {
            System.out.println(studentOne.getName() + " " + studentOne.getSurname() + " одинаково сильны в мощности магии, как " + studentTwo.getName() + " " + studentTwo.getSurname());
        }
    }


    @Override
    public String toString() {
        return "СТУДЕНТ ФАКУЛЬТЕТА ГРИФФИНДОР:" + "\n" + "Имя: " + getName() + "; Фамилия: " + getSurname() + "; Магия: " + getMagic() + "; Трансгрессия: " + getTransgression() + "; Благородство: " + getNobility() + "; Честь: " + getHonor() + "; Храбрость: " + getBravery() + ".";
    }

    public int getNobility() {
        return this.nobility;
    }

    public int getHonor() {
        return this.honor;
    }

    public int getBravery() {
        return this.bravery;
    }
}
