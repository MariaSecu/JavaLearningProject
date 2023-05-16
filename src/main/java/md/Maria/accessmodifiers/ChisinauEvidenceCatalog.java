package md.Maria.accessmodifiers;

import md.Maria.accessmodifiers.peopleevidence.Person;

public class ChisinauEvidenceCatalog {
    public static void main(String[] args) {
        // Create 5 new objects
        Person vadimTalmazan = new Person("Vadim", "Talmazan", 223822911);
        vadimTalmazan.isRetaired = false;
        if (vadimTalmazan.isRetaired) {
            System.out.println("Vadim is retaired");
        } else {
            System.out.println("Vadim is able for work");
        }
        System.out.println(vadimTalmazan.ISBREATHE);
        Person mariusPopa = new Person("Marius", "Popa", 88300012, 32,
                "Str. Milescu Spataru", "moldavian");
        mariusPopa.isRetaired = false;
        if (mariusPopa.isRetaired) {
            System.out.println("Marius is retaired");
        } else {
            System.out.println("Marius is able for work");
        }
        Person mariaSecu = new Person("Maria", "Secu", 2007022, 18,
                "Str. Banulecu Bodoni", "Moldavian");
        System.out.println(mariaSecu.ISBREATHE);
        mariaSecu.isRetaired = false;
        if (mariaSecu.isRetaired) {
            System.out.println("Maria is retaired");
        } else {
            System.out.println("Maria is able to work");
        }
        Person augustinMican = new Person("Augustin", "Mican", 2007011);
        augustinMican.isRetaired = true;
        if (augustinMican.isRetaired) {
            System.out.println("Augustin is retaired ");
        } else {
            System.out.println("Augustin is able for work");
        }
        Person ilarionCioban = new Person("Ilarion", "Cioban", 20056214);
        ilarionCioban.isRetaired = true;
        if (augustinMican.isRetaired) {
            System.out.println("Ilarion is retaired ");
        } else {
            System.out.println("Ilarion is able for work");
        }
    }
}
