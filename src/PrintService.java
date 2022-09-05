public class PrintService {
    public void print(Gryffindor[] gryffindorStudents) {
        System.out.println("СТУДЕНТЫ ФАКУЛЬТЕТА ГРИФФИНДОР:");
        for (int i = 0; i < gryffindorStudents.length; i++) {
            Gryffindor gryffindor = gryffindorStudents[i];
            System.out.println("Имя: " + gryffindor.getName() + "; Фамилия: " + gryffindor.getSurname() + "; Магия: " + gryffindor.getMagic() + "; Трансгрессия: " + gryffindor.getTransgression() + "; Благородство: " + gryffindor.getNobility() + "; Честь: " + gryffindor.getHonor() + "; Храбрость: " + gryffindor.getBravery() + ".");
        }
        System.out.println();
    }

    public void print(Hufflepuff[] hufflepuffStudents) {
        System.out.println("СТУДЕНТЫ ФАКУЛЬТЕТА ПУФФЕНДУЙ:");
        for (int i = 0; i < hufflepuffStudents.length; i++) {
            Hufflepuff hufflepuff = hufflepuffStudents[i];
            System.out.println("Имя: " + hufflepuff.getName() + "; Фамилия: " + hufflepuff.getSurname() + "; Магия: " + hufflepuff.getMagic() + "; Трансгрессия: " + hufflepuff.getTransgression() + "; Трудолюбие: " + hufflepuff.getDiligence() + "; Верность: " + hufflepuff.getLoyalty() + "; Честь: " + hufflepuff.getHonor() + ".");
        }
        System.out.println();
    }

    public void print(Ravenclaw[] ravenclawStudents) {
        System.out.println("СТУДЕНТЫ ФАКУЛЬТЕТА КОГТЕВРАН:");
        for (int i = 0; i < ravenclawStudents.length; i++) {
            Ravenclaw ravenclaw = ravenclawStudents[i];
            System.out.println("Имя: " + ravenclaw.getName() + "; Фамилия: " + ravenclaw.getSurname() + "; Магия: " + ravenclaw.getMagic() + "; Трансгрессия: " + ravenclaw.getTransgression() + "; Ум: " + ravenclaw.getIntelligence() + "; Мудрость: " + ravenclaw.getWisdom() + "; Остроумие: " + ravenclaw.getWit() + "; Творчество: " + ravenclaw.getCreativity() + ".");
        }
        System.out.println();
    }

    public void print(Slytherin[] slytherinStudents) {
        System.out.println("СТУДЕНТЫ ФАКУЛЬТЕТА СЛИЗЕРИН:");
        for (int i = 0; i < slytherinStudents.length; i++) {
            Slytherin slytherin = slytherinStudents[i];
            System.out.println("Имя: " + slytherin.getName() + "; Фамилия: " + slytherin.getSurname() + "; Магия: " + slytherin.getMagic() + "; Трансгрессия: " + slytherin.getTransgression() + "; Хитрость: " + slytherin.getCunning() + "; Решительность: " + slytherin.getDetermination() + "; Амбициозность: " + slytherin.getAmbition() + "; Ноходчивость: " + slytherin.getResourcefulness() + "; Жажда власти: " + slytherin.getThirstForPower() + ".");
        }
        System.out.println();
    }
}
