package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        System.out.println("Výtej v mé aplikaci umím dělat 4 věci vyber si jakou chceš:");
        System.out.println("TŘÍDĚNÍ ČÍSEL - 1");
        System.out.println("OBCHOD - 2");
        System.out.println("KALKULAČKA - 3");
        System.out.println("KVÍZ - 4");

        int categori = Integer.parseInt(sc.nextLine());

        if(categori == 1) {

            System.out.println("Výtej ve třídičce čísel");
            System.out.println("Kolik budeš zadávat čísel");
            int count = sc.nextInt();
            int[] arr = new int[count];
            System.out.println("Zadej kladná čísla");
            for (int i = 0; i < arr.length; i++) {
                int num = sc.nextInt();
                arr[i] = num;
            }
            int temp;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < (arr.length - 1 - i); j++) {
                    if (arr[j]>arr[j+1]) {
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }

        } else if(categori == 2) {
            System.out.println("Výtej v mém obchodě");
            int cena = 0;
            boolean end = false;
            do{
                System.out.println("Knife - 1");
                System.out.println("AWP - 2");
                System.out.println("Platit - 3");
                int num = sc.nextInt();
                switch (num) {
                    case 1:
                        System.out.println("Bayonet - 1");
                        System.out.println("Karambit - 2");
                        System.out.println("Talon Knife - 3");
                        int knife = sc.nextInt();
                        switch (knife) {
                            case 1:
                                System.out.println("Bayonet byl přídán do tvého košíku +400$");
                                cena+=400;
                                break;
                            case 2:
                                System.out.println("Karambit byl přídán do tvého košíku +650$");
                                cena+=650;
                                break;
                            case 3:
                                System.out.println("Talon Knife byl přídán do tvého košíku +500$");
                                cena+=500;
                                break;
                            default:
                                System.out.println("Položka není na trhu");
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("AK-47 Asiimov - 1");
                        System.out.println("AK-47 Bloodsport - 2");
                        System.out.println("AK-47 Redline - 3");
                        int ak = sc.nextInt();
                        switch (ak) {
                            case 1:
                                System.out.println("AK-47 Asiimov bylo přídáno do tvého košíku +150$");
                                cena+=150;
                                break;
                            case 2:
                                System.out.println("AK-47 Bloodsport bylo přídáno do tvého košíku +800$");
                                cena+=800;
                                break;
                            case 3:
                                System.out.println("AK-47 Redline bylo přídáno do tvého košíku +50$");
                                cena+=50;
                                break;
                            default:
                                System.out.println("Položka není na trhu");
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("Vyuctovani..");
                        end = true;
                        break;
                    default:
                        System.out.println("Pokožka neexistuje");
                        break;
                }

            }while (!end);
            System.out.println("Celkem jsi utratil: " + cena + "$");
        } else if(categori == 3) {
            System.out.println("Výtej v kalkulačce");
            System.out.println("Zadej První číslo");
            int num1 = sc.nextInt();
            System.out.println("Zadej druhé číslo");
            int num2 = sc.nextInt();
            System.out.println("Zadej početní operaci");
            System.out.println("Sčítání - 1");
            System.out.println("Odčítání - 2");
            System.out.println("Násobení - 3");
            System.out.println("Dělení - 4");
            int cat = sc.nextInt();
            if(cat == 1) {
                System.out.println("Výsledek je:" + (num1 + num2) );
            } else if (cat == 2) {
                System.out.println("Výsledek je:" + (num1 - num2) );
            } else if (cat == 3) {
                System.out.println("Výsledek je:" + (num1 * num2) );
            } else if (cat == 4) {
                System.out.println("Výsledek je: " + (num1 / num2) );
            } else {
                System.out.println("ERROR");
            }
        } else if(categori == 4){
            System.out.println("Výtej vybral sis kvíz zepám se tě na pár otázek a piš odpovědi ano/ne");
            int body = 0;

            System.out.println("1) Je Kilimandžáro největší hora světa?");
            String a = sc.nextLine();

            if(a.equalsIgnoreCase("ano")){
                System.out.println("Tato odpověď není správně");
            }else {
                System.out.println("Ano správně získáváš 1 bod");
                body++;
            }

            System.out.println("2) Je New York hlavní město USA?");
            String b = sc.nextLine();

            if(b.equalsIgnoreCase("ano")){
                System.out.println("Tato odpověď není správně");
            }else {
                System.out.println("Ano správně získáváš 1 bod");
                body++;
            }

            System.out.println("3) Je Usain Bolt nejrychlejší člověk na světě?");
            String c = sc.nextLine();

            if(c.equalsIgnoreCase("ano")){
                System.out.println("Ano správně získáváš 1 bod");
                body++;
            }else {
                System.out.println("Tato odpověď není správmě");
            }

            System.out.println("4) Je clash of clans nejlepší hra?");
            String d = sc.nextLine();

            if(d.equalsIgnoreCase("ano")){
                System.out.println("Ano správně získáváš 1 bod");
                body++;
            }else {
                System.out.println("Tato odpověď není správně");
            }

            System.out.println("5) Je league of legends rakovino tvorná hra?");
            String e = sc.nextLine();

            if(d.equalsIgnoreCase("ano")){
                System.out.println("Ano správně získáváš 1 bod");
                body++;
            }else {
                System.out.println("Tato odpověď není správně");
            }
            System.out.println("Celková počet bodů: " + body +"/5");
        } else{
            System.out.println("ERROR");
        }

    }
}
