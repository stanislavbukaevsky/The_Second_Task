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

    public static void comparisonOfStudents(Ravenclaw studentOne, Ravenclaw studentTwo) {
        int comparisonOne = studentOne.getIntelligence() + studentOne.getWisdom() + studentOne.getWit() + studentOne.getCreativity();
        int comparisonTwo = studentTwo.getIntelligence() + studentTwo.getWisdom() + studentTwo.getWit() + studentTwo.getCreativity();

        if (comparisonOne > comparisonTwo) {
            System.out.println(studentOne.getName() + " " + studentOne.getSurname() + " лучший когтевранец, чем " + studentTwo.getName() + " " + studentTwo.getSurname());
        } else if (comparisonTwo > comparisonOne) {
            System.out.println(studentTwo.getName() + " " + studentTwo.getSurname() + " лучший когтевранец, чем " + studentOne.getName() + " " + studentOne.getSurname());
        } else if (comparisonOne == comparisonTwo) {
            System.out.println(studentOne.getName() + " " + studentOne.getSurname() + " одинаково сильны в мощности магии, как " + studentTwo.getName() + " " + studentTwo.getSurname());
        }
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

    @Override
    public String toString() {
        return "СТУДЕНТ ФАКУЛЬТЕТА КОГТЕВРАН:" + "\n" + "Имя: " + getName() + "; Фамилия: " + getSurname() + "; Магия: " + getMagic() + "; Трансгрессия: " + getTransgression() + "; Ум: " + getIntelligence() + "; Мудрость: " + getWisdom() + "; Остроумие: " + getWit() + "; Творчество: " + getCreativity() + ".";
    }
}
