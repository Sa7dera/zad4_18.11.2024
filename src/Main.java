import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("podaj pierwsza liczbe");
        int liczba1 = sc.nextInt();
        System.out.println("podaj druga liczbe");
        int liczba2 = sc.nextInt();

        int reszta = liczba1 % liczba2;
        System.out.println("reszta z dzielenia " + reszta);

    }
}