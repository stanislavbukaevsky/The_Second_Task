public class Hogwarts {
    private String name;
    private String surname;
    private int magic;
    private int transgression;


    public Hogwarts(String name, String surname, int magic, int transgression) {
        this.name = name;
        this.surname = surname;
        this.magic = magic;
        this.transgression = transgression;
    }

    public static void comparisonOfStudents(Hogwarts studentOne, Hogwarts studentTwo) {
        int comparisonOne = studentOne.getMagic() + studentOne.getTransgression();
        int comparisonTwo = studentTwo.getMagic() + studentTwo.getTransgression();

        if (comparisonOne > comparisonTwo) {
            System.out.println(studentOne.getName() + " " + studentOne.getSurname() + " обладает большей магией, чем " + studentTwo.getName() + " " + studentTwo.getSurname());
        } else if (comparisonTwo > comparisonOne) {
            System.out.println(studentTwo.getName() + " " + studentTwo.getSurname() + " обладает большей магией, чем " + studentOne.getName() + " " + studentOne.getSurname());
        } else if (comparisonOne == comparisonTwo) {
            System.out.println(studentOne.getName() + " " + studentOne.getSurname() + " одинаково сильны в мощности магии, как " + studentTwo.getName() + " " + studentTwo.getSurname());
        }
    }


    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getMagic() {
        return this.magic;
    }

    public int getTransgression() {
        return this.transgression;
    }

}
