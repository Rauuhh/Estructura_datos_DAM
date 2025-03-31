package org.example;

public class solution {

    static java.util.Scanner in;

    public static void casoDePrueba() {

        int total = in.nextInt();
        in.nextLine();
        String tot2 = in.nextLine();
        String[] valores = tot2.split(" ");
        int[] valores2 = {1, 2, 5, 10, 20, 50, 100, 200};
        int comp = 0;

        if (valores.length != 8) {
            return;
        }

        for (int i = 0; i < 8; i++) {
            comp += Integer.parseInt(valores[i]) * valores2[i];
        }

        if (comp < total) {
            System.out.println("SEDIENTO");
        } else {
            System.out.println("SACIADO");
        }
    }

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);
        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++) {
            casoDePrueba();
        }

    }
}
