package fr.tetemh.StoneSheetScissors;

import java.awt.*;
import java.util.Scanner;

public class PFC {

    private static String repConsole;
    private static int pointPlayer;
    private static int pointConsole;


    public static void main(String [] args){
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("----- Pierre - Feuille - Ciseaux -----");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("Choisiser un nombre :");
            int nbtPart = Integer.parseInt(scanner.nextLine());
            System.out.println("Choisiser un Item");
            for(int i = 0; i < nbtPart; i++) {
                String rep = scanner.nextLine();
                int juste = (int) (Math.random() * 3);
                if(juste == 0) {
                    repConsole = "Ciseau";
                }else if(juste == 1){
                    repConsole = "Pierre";
                }else if(juste == 2) {
                    repConsole = "Feuille";
                }

                if(rep.equalsIgnoreCase("pierre") && repConsole.equals("Feuille")){
                    System.out.println(Color.RED + "Vous avez perdu veuillez relancer le jeu");
                    System.out.println(" ");
                    pointConsole++;
                }else if(rep.equalsIgnoreCase("pierre") && repConsole.equals("Pierre")){
                    System.out.println(Color.ORANGE + "Vous avez fait egaliter veuillez relancer le jeu");
                    System.out.println(" ");
                }else if(rep.equalsIgnoreCase("pierre") && repConsole.equals("Ciseau")){
                    System.out.println(Color.GREEN + "Vous avez gagner veuillez relancer le jeu");
                    System.out.println(" ");
                    pointPlayer++;
                }

                if(rep.equalsIgnoreCase("ciseau") && repConsole.equals("Pierre")){
                    System.out.println("Vous avez perdu veuillez relancer le jeu");
                    System.out.println(" ");
                    pointConsole++;
                }else if(rep.equalsIgnoreCase("ciseau") && repConsole.equals("Ciseau")){
                    System.out.println("Vous avez fait egaliter veuillez relancer le jeu");
                    System.out.println(" ");
                }else if(rep.equalsIgnoreCase("ciseau") && repConsole.equals("Papier")){
                    System.out.println("Vous avez gagner veuillez relancer le jeu");
                    System.out.println(" ");
                    pointPlayer++;
                }

                if(rep.equalsIgnoreCase("feuille") && repConsole.equals("Ciseau")){
                    System.out.println("Vous avez perdu veuillez relancer le jeu");
                    System.out.println(" ");
                    pointConsole++;
                }else if(rep.equalsIgnoreCase("feuille") && repConsole.equals("Feuille")){
                    System.out.println("Vous avez fait egaliter veuillez relancer le jeu");
                    System.out.println(" ");
                }else if(rep.equalsIgnoreCase("feuille") && repConsole.equals("Pierre")){
                    System.out.println("Vous avez gagner veuillez relancer le jeu");
                    System.out.println(" ");
                    pointPlayer++;
                }
            }

            System.out.println("Point Console -> " + pointConsole);
            System.out.println(" ");
            System.out.println("Point Player -> " + pointPlayer);
            System.out.println(" ");
            if(pointPlayer > pointConsole){
                System.out.println("Vous avez gagner avec " + pointPlayer + "pts");
            }else if(pointConsole > pointPlayer){
                System.out.println("La console a gagner avec " + pointConsole + "pts");
            }else{
                System.out.println("Vous avez fais egualiter");
            }



        }
    }
}
