public class ComparisonOfStudents {
    public void comparisonOfStudentsGryffindor(Gryffindor[] gryffindorStudents) {
        int harryPotter = gryffindorStudents[0].getNobility() + gryffindorStudents[0].getHonor() + gryffindorStudents[0].getBravery();
        int hermioneGranger = gryffindorStudents[1].getNobility() + gryffindorStudents[1].getHonor() + gryffindorStudents[1].getBravery();
        int ronWeasley = gryffindorStudents[2].getNobility() + gryffindorStudents[2].getHonor() + gryffindorStudents[2].getBravery();

        if (harryPotter > hermioneGranger) {
            System.out.println("Гарри Поттер лучший грифиндорец, чем Гермиона Грейнджер");
        } else if (harryPotter < hermioneGranger) {
            System.out.println("Гермиона Грейнджер лучший грифиндорец, чем Гарри Поттер");
        } else if (harryPotter > ronWeasley) {
            System.out.println("Гарри Поттер лучший грифиндорец, чем Рон Уизли");
        } else if (harryPotter < ronWeasley) {
            System.out.println("Рон Уизли лучший грифиндорец, чем Гарри Поттер");
        } else if (hermioneGranger > ronWeasley) {
            System.out.println("Гермиона Грейнджер лучший грифиндорец, чем Рон Уизли");
        } else if (hermioneGranger < ronWeasley) {
            System.out.println("Рон Уизли лучший грифиндорец, чем Гермиона Грейнджер");
        }
        System.out.println();
    }

    public void comparisonOfStudentsHufflepuff(Hufflepuff[] hufflepuffStudents) {
        int zachariahSmith = hufflepuffStudents[0].getDiligence() + hufflepuffStudents[0].getLoyalty() + hufflepuffStudents[0].getHonor();
        int cedricDiggory = hufflepuffStudents[1].getDiligence() + hufflepuffStudents[1].getLoyalty() + hufflepuffStudents[1].getHonor();
        int justinFinchFletchley = hufflepuffStudents[2].getDiligence() + hufflepuffStudents[2].getLoyalty() + hufflepuffStudents[2].getHonor();

        if (zachariahSmith > cedricDiggory) {
            System.out.println("Захария Смит лучший пуфендуец, чем Седрик Диггори");
        } else if (zachariahSmith < cedricDiggory) {
            System.out.println("Седрик Диггори лучший пуфендуец, чем Захария Смит");
        } else if (zachariahSmith > justinFinchFletchley) {
            System.out.println("Захария Смит лучший пуфендуец, чем Джастин Финч-Флетчли");
        } else if (zachariahSmith < justinFinchFletchley) {
            System.out.println("Джастин Финч-Флетчли лучший пуфендуец, чем Захария Смит");
        } else if (cedricDiggory > justinFinchFletchley) {
            System.out.println("Седрик Диггори лучший грифиндорец, чем Джастин Финч-Флетчли");
        } else if (cedricDiggory < justinFinchFletchley) {
            System.out.println("Джастин Финч-Флетчли лучший грифиндорец, чем Седрик Диггори");
        }
        System.out.println();
    }

    public void comparisonOfStudentsRavenclaw(Ravenclaw[] ravenclawStudents) {
        int zhouChang = ravenclawStudents[0].getIntelligence() + ravenclawStudents[0].getWisdom() + ravenclawStudents[0].getWit() + ravenclawStudents[0].getCreativity();
        int padmaPatil = ravenclawStudents[1].getIntelligence() + ravenclawStudents[1].getWisdom() + ravenclawStudents[1].getWit() + ravenclawStudents[1].getCreativity();
        int marcusBelby = ravenclawStudents[2].getIntelligence() + ravenclawStudents[2].getWisdom() + ravenclawStudents[2].getWit() + ravenclawStudents[2].getCreativity();

        if (zhouChang > padmaPatil) {
            System.out.println("Чжоу Чанг лучший когтевранец, чем Падма Патил");
        } else if (zhouChang < padmaPatil) {
            System.out.println("Падма Патил лучший когтевранец, чем Чжоу Чанг");
        } else if (zhouChang > marcusBelby) {
            System.out.println("Чжоу Чанг лучший когтевранец, чем Маркус Белби");
        } else if (zhouChang < marcusBelby) {
            System.out.println("Маркус Белби лучший когтевранец, чем Чжоу Чанг");
        } else if (padmaPatil > marcusBelby) {
            System.out.println("Падма Патил лучший когтевранец, чем Маркус Белби");
        } else if (padmaPatil < marcusBelby) {
            System.out.println("Маркус Белби лучший когтевранец, чем Падма Патил");
        }
        System.out.println();
    }

    public void comparisonOfStudentsSlytherin(Slytherin[] slytherinStudents) {
        int dracoMalfoy = slytherinStudents[0].getCunning() + slytherinStudents[0].getDetermination() + slytherinStudents[0].getAmbition() + slytherinStudents[0].getResourcefulness() + slytherinStudents[0].getThirstForPower();
        int grahamMontague = slytherinStudents[1].getCunning() + slytherinStudents[1].getDetermination() + slytherinStudents[1].getAmbition() + slytherinStudents[1].getResourcefulness() + slytherinStudents[1].getThirstForPower();
        int gregoryGoyle = slytherinStudents[2].getCunning() + slytherinStudents[2].getDetermination() + slytherinStudents[2].getAmbition() + slytherinStudents[2].getResourcefulness() + slytherinStudents[2].getThirstForPower();

        if (dracoMalfoy > grahamMontague) {
            System.out.println("Драко Малфой лучший слизеринец, чем Грэхэм Монтегю");
        } else if (dracoMalfoy < grahamMontague) {
            System.out.println("Грэхэм Монтегю лучший слизеринец, чем Драко Малфой");
        } else if (dracoMalfoy > gregoryGoyle) {
            System.out.println("Драко Малфой лучший слизеринец, чем Грегори Гойл");
        } else if (dracoMalfoy < gregoryGoyle) {
            System.out.println("Грегори Гойл лучший слизеринец, чем Драко Малфой");
        } else if (grahamMontague > gregoryGoyle) {
            System.out.println("Грэхэм Монтегю лучший слизеринец, чем Грегори Гойл");
        } else if (grahamMontague < gregoryGoyle) {
            System.out.println("Грегори Гойл лучший слизеринец, чем Грэхэм Монтегю");
        }
        System.out.println();
    }

    public void comparisonOfStudentsHogwarts(Hogwarts[] hogwartsStudents) {
        int dracoMalfoy = hogwartsStudents[3].getMagic() + hogwartsStudents[3].getTransgression();
        int harryPotter = hogwartsStudents[0].getMagic() + hogwartsStudents[0].getTransgression();

        if (dracoMalfoy > harryPotter) {
            System.out.println("Драко Малфой обладает большей мощностью магии, чем Гарри Поттер");
        } else if (dracoMalfoy < harryPotter) {
            System.out.println("Гарри Поттер обладает большей мощностью магии, чем Драко Малфой");
        } else if (dracoMalfoy == harryPotter) {
            System.out.println("Студенты одинаково сильны в мощности магии");
        }
    }
}
