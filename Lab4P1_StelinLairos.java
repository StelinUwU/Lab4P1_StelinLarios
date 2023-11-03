/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p1_stelinlairos;

import java.util.Scanner;

/**
 *
 * @author stelinlarios
 */
public class Lab4P1_StelinLairos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int selectedOption = 0;

        while (selectedOption != 4) {

            System.out.println("Seleccione una opción");
            System.out.println("1. Inversión espcial");
            System.out.println("2. Balanza de cadenas");
            System.out.println("3. Cifrado de mensajes");
            System.out.println("4. Salir");
            selectedOption = sc.nextInt();

            switch (selectedOption) {
                case 1:
                    System.out.println("1. Inversión espcial");
                    System.out.println("Ingrese la cadena:");
                    sc.nextLine();

                    String userString = sc.nextLine();
                    String currentWord = "";

                    if (userString.length() < 5) {
                        System.out.println("Ingrese una cadena valida");
                        break;
                    }

                    System.out.print("Cadena invertida: ");
                    for (int i = 0; i < userString.length(); i++) {

                        if (userString.charAt(i) == ' ') {

                            for (int j = currentWord.length() - 1; j >= 0; j--) {
                                System.out.print(currentWord.charAt(j));
                            }
                            System.out.print(" ");

                            currentWord = "";
                        } else {
                            currentWord = currentWord + userString.charAt(i);
                        }

                    }
                    for (int j = currentWord.length() - 1; j >= 0; j--) {
                        System.out.print(currentWord.charAt(j));
                    }

                    System.out.println("");

                    break;
                case 2:

                    int userString1Value = 0;
                    int userString2Value = 0;
                    int userString3Value = 0;
                    System.out.println("2. Balanza de cadenas");

                    System.out.println("Ingrese la cadena 1");
                    sc.nextLine();
                    String userString1 = sc.nextLine();

                    for (int i = userString1.length() - 1; i >= 0; i--) {
                        int ascii = userString1.charAt(i);
                        userString1Value += ascii;
                    }

                    System.out.println("Ingrese la cadena 2");
                    String userString2 = sc.nextLine();

                    for (int i = userString2.length() - 1; i >= 0; i--) {
                        int ascii = userString2.charAt(i);
                        userString2Value += ascii;
                    }

                    System.out.println("Ingrese la cadena 3");
                    String userString3 = sc.nextLine();

                    for (int i = userString3.length() - 1; i >= 0; i--) {
                        int ascii = userString3.charAt(i);
                        userString3Value += ascii;
                    }

                    System.out.println("Peso cadena 1:" + userString1Value);
                    System.out.println("Peso cadena 2:" + userString2Value);
                    System.out.println("Peso cadena 3:" + userString3Value);

                    if (userString1Value == userString2Value && userString1Value == userString3Value && userString2Value == userString3Value) {
                        System.out.println("Las 3 cadenas pesan lo mismo");
                        break;
                    }

                    if (userString1Value > userString2Value && userString1Value > userString3Value) {

                        System.out.println("La cadena 1 es la mas pesada");

                    } else if (userString2Value > userString1Value && userString2Value > userString3Value) {
                        System.out.println("La cadena 2 es la mas pesada");

                    } else {
                        System.out.println("La cadena 3 es la mas pesada");
                    }

                    break;
                case 3:
                    System.out.println("3. Cifrado de mensajes");
                    System.out.println("Ingrese el mensaje:");
                    sc.nextLine();
                    String userMessage = sc.nextLine();

                    if (userMessage == null || userMessage.isEmpty()) {
                        System.out.println("Ingrese una cadena valida");
                        break;
                    }

                    for (int i = 0; i < userMessage.length(); i++) {
                        int ascii = userMessage.charAt(i);
                        ascii += 2;

                        System.out.print((char) ascii);
                    }

                    System.out.println("");

                    break;
                case 4:
                    System.out.println("4. Salir");
                    break;
                default:
                    System.out.println("Ingrese una opción valida");
                    break;

            }
        }

    }

}
