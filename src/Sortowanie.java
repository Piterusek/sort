import java.util.Scanner;

public class Sortowanie {
    public int[] tablica = new int[10];

    public void wypelnijZKlawiatury() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wprowadz elementy tablicy");

        for (int i =0; i < tablica.length; i++) {
            System.out.println("Element " + i + ":");
            tablica[i] = sc.nextInt();
        }
    }

    public void wypiszTablica() {
        for (int i : tablica) {
            System.out.println(i + " ");
        }
    }

    private int szukajMaksmalnej(int k) {
        int szukany = k;
        int makszy = tablica[k];
        for (int i = k + 1; i < tablica.length; i++) {
            if(makszy < tablica[i]) {
                makszy = tablica[i];
                szukany = i;
            }
        }
        return szukany;
    }

    public void sortuj() {
        for(int i = 0; i < tablica.length; i++) {
            int indeks = szukajMaksmalnej(i);
            int pomoc = tablica[i];
            tablica[i] = tablica[indeks];
            tablica[indeks] = pomoc;
        }
    }
}
