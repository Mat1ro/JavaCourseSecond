public class Main {

    public static void main(String[] args) {

        Gryffindor harryPotter = new Gryffindor("Harry Potter", 8, 9, 10, 5, 7, 6, 7, 6, 8, 5, 4, 5, 4, 3, 2);
        Gryffindor hermioneGranger = new Gryffindor("Hermione Granger", 9, 10, 8, 6, 8, 9, 10, 9, 9, 7, 4, 5, 3, 4, 3);
        Gryffindor ronWeasley = new Gryffindor("Ron Weasley", 7, 8, 9, 5, 8, 6, 6, 5, 7, 4, 3, 5, 4, 3, 1);

        Slytherin dracoMalfoy = new Slytherin("Draco Malfoy", 2, 3, 4, 4, 3, 4, 6, 5, 5, 6, 9, 7, 8, 7, 9);
        Slytherin grahamMontague = new Slytherin("Graham Montague", 2, 3, 3, 5, 4, 4, 5, 5, 4, 4, 8, 6, 7, 7, 8);
        Slytherin gregoryGoyle = new Slytherin("Gregory Goyle", 1, 2, 3, 4, 3, 3, 4, 3, 2, 2, 7, 5, 6, 5, 6);

        Puffendui zachariasSmith = new Puffendui("Zacharias Smith", 5, 6, 6, 8, 9, 8, 6, 5, 5, 6, 3, 4, 4, 3, 2);
        Puffendui cedricDiggory = new Puffendui("Cedric Diggory", 8, 9, 10, 7, 8, 7, 8, 8, 6, 7, 3, 5, 4, 4, 2);
        Puffendui justinFinchFletchley = new Puffendui("Justin Finch Fletchley", 6, 7, 5, 9, 7, 8, 5, 4, 4, 6, 4, 3, 3, 2, 1);

        Claw zhouChang = new Claw("Zhou Chang", 7, 8, 6, 5, 6, 5, 9, 8, 8, 9, 4, 4, 3, 5, 3);
        Claw padmaPatil = new Claw("Padma Patil", 7, 6, 5, 6, 7, 6, 8, 8, 7, 7, 4, 4, 3, 4, 2);
        Claw marcusBelby = new Claw("Marcus Belby", 6, 7, 5, 5, 6, 5, 9, 8, 8, 8, 3, 4, 4, 4, 3);

        System.out.println("harryPotter.toString() = " + harryPotter.toString());
        System.out.println("hermioneGranger.toString() = " + hermioneGranger.toString());
        System.out.println("ronWeasley.toString() = " + ronWeasley.toString());
        System.out.println("dracoMalfoy.toString() = " + dracoMalfoy.toString());
        System.out.println("grahamMontague.toString() = " + grahamMontague.toString());
        System.out.println("gregoryGoyle.toString() = " + gregoryGoyle.toString());
        System.out.println("zachariasSmith.toString() = " + zachariasSmith.toString());
        System.out.println("cedricDiggory.toString() = " + cedricDiggory.toString());
        System.out.println("justinFinchFletchley.toString() = " + justinFinchFletchley.toString());
        System.out.println("zhouChang.toString() = " + zhouChang.toString());
        System.out.println("padmaPatil.toString() = " + padmaPatil.toString());
        System.out.println("marcusBelby.toString() = " + marcusBelby.toString());
        System.out.println();

        System.out.println("hermioneGranger.whoIsBetter(ronWeasley) = " + hermioneGranger.whoIsBetter(ronWeasley));
        System.out.println("dracoMalfoy.whoIsBetter(gregoryGoyle) = " + dracoMalfoy.whoIsBetter(gregoryGoyle));
        System.out.println("cedricDiggory.whoIsBetter(justinFinchFletchley) = " + cedricDiggory.whoIsBetter(justinFinchFletchley));
        System.out.println("marcusBelby.whoIsBetter(marcusBelby) = " + marcusBelby.whoIsBetter(marcusBelby));
        System.out.println();

        System.out.println("harryPotter.battle(grahamMontague) = " + harryPotter.battle(grahamMontague));
        System.out.println("cedricDiggory.battle(hermioneGranger) = " + cedricDiggory.battle(hermioneGranger));
    }
}