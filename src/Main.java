import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobranie rozmiaru tablicy
        System.out.print("Podaj rozmiar tablicy: ");
        int n = scanner.nextInt();

        // Utworzenie tablicy
        int[] tablica = new int[n];

        // Wczytanie elementów do tablicy
        System.out.println("Wprowadź " + n + " liczb:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            tablica[i] = scanner.nextInt();
        }

        // Pobranie elementu do zliczenia
        System.out.print("Podaj liczbę do zliczenia: ");
        int x = scanner.nextInt();

        // Zliczanie wystąpień elementu x
        int licznik = 0;
        for (int liczba : tablica) {
            if (liczba == x) {
                licznik++;
            }
        }

        // Wyświetlenie wyniku
        System.out.println("Element " + x + " występuje " + licznik + " razy.");

        scanner.close();
    }
}