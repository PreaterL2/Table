import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {


    public static void main(String[] args) {
        int pierwszaTablica[] = {1, 2, 3, 7, 9, 0};
        int tablice[][] = new int[6][9];
        int tab[] = {1, 2, 3, 4, 5, 6};
        int funkcja[] = {2, 3, 4, 1, -3, 2};
        System.out.println("Drugi element tablicy to " + pierwszaTablica[2]);

        for (int i = 0; i < pierwszaTablica.length; i++) {
            System.out.println(pierwszaTablica[i]);
        }
        srednia(pierwszaTablica);
        tabliceDwuwymiarowe(tablice);
        czyParzysta(tab);
        najmniejsza(pierwszaTablica);
        zamianaPierwszej(funkcja);
        zamianaDrugiej(funkcja);
        mniejszaOdzero(funkcja);
        suma(tab);
        zamiana(tab, 3, 2);

    }

    public static void srednia(int pierwszaTablica[]) {
        double wynik = 0;
        for (int i = 0; i < pierwszaTablica.length; i++) {
            wynik = wynik + pierwszaTablica[i];
        }
        System.out.println("srednia wszystkich elementow tablicy wynosi: " + wynik / pierwszaTablica.length);
    }

    public static void tabliceDwuwymiarowe(int tablica[][]) {
        int k = 0;
        for (int i = 0; i < 6; i++)
            for (int j = 0; j < 9; j++) {
                tablica[i][j] = k;
                k++;
            }


        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.println(tablica[i][j]);
            }
            System.out.println();
        }
    }

    public static void czyParzysta(int tab[]) {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 == 0) {
                System.out.println(tab[i] + " jest liczba jest parzysta");
            } else {
                System.out.println(tab[i] + " jest liczba jest nieparzysta");
            }
        }
    }

    public static void najmniejsza(int tab2[]) {
        int najwieksza = tab2[0];
        for (int i = 0; i < tab2.length; i++) {
            if (tab2[i] > najwieksza) {
                najwieksza = tab2[i];
                System.out.println(najwieksza + " jest liczba najwieksza");
            }
        }
        int najmniejsza = tab2[0];
        for (int i = 0; i < tab2.length; i++) {
            if (tab2[i] < najmniejsza) {
                najmniejsza = tab2[i];
                System.out.println(najmniejsza + " jest liczba najmniejsza");
            }
        }
    }

    static int zamianaPierwszej(int tab[]) {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 == 0) {
                System.out.println(i + " index ktory wynosi " + tab[i] + " jest pierwsza liczba parzysta");
                return i;
            }
        }
        return -1;
    }

    static int zamianaDrugiej(int tab[]) {
        for (int j = 0; j < tab.length; j++) {
            if (tab[j] % 2 != 0) {
                System.out.println(j + " index ktory wynosi " + tab[j] + " jest peirwsza liczba nieparzysta");
                return j;
            }
        }
        return -1;
    }

    static int mniejszaOdzero(int tab[]) {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < 0) {
                System.out.println(i + " index ktory wynosi " + tab[i] + " jest liczba mniejsza od 0");
                return i;
            }
        }
        return -1;
    }

    static void suma(int tab[]) {
        int sum = 0;
        //for(int value : tab){
        for (int i = 0; i < tab.length; i++) {
            int value = tab[i];

            sum += value;

            System.out.println(sum);
        }
    }

    public static void zamiana(int tab[], int i, int k) {
        for (i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }
}


