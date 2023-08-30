package org.example;

class Fahrzeug {
    private String hersteller;
    private String modell;
    private int baujahr;

    public Fahrzeug(String hersteller, String modell, int baujahr) {
        this.hersteller = hersteller;
        this.modell = modell;
        this.baujahr = baujahr;
    }

    public void printInfo() {
        System.out.println("Hersteller: " + hersteller);
        System.out.println("Modell: " + modell);
        System.out.println("Baujahr: " + baujahr);
    }
}

class Auto extends Fahrzeug {
    private int anzahlTueren;

    public Auto(String hersteller, String modell, int baujahr, int anzahlTueren) {
        super(hersteller, modell, baujahr);
        this.anzahlTueren = anzahlTueren;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Anzahl der Türen: " + anzahlTueren);
    }
}
class Motorrad extends Fahrzeug {
    private String motorradArt;

    public Motorrad(String hersteller, String modell, int baujahr, String motorradArt) {
        super(hersteller, modell, baujahr);
        this.motorradArt = motorradArt;
    }
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Art des Motorrads: " + motorradArt);
    }
}

public class Main {
    public static void main(String[] args) {

        Fahrzeug fahrzeug = new Fahrzeug("Hersteller1", "Modell1", 2020);
        Auto auto = new Auto("Hersteller2", "Modell2", 2022, 4);
        Motorrad motorrad = new Motorrad("Hersteller3", "Modell3", 2021, "Sportbike");

        System.out.println("Informationen über das Fahrzeug:");
        fahrzeug.printInfo();

        System.out.println("\nInformationen über das Auto:");
        auto.printInfo();

        System.out.println("\nInformationen über das Motorrad:");
        motorrad.printInfo();
    }
}