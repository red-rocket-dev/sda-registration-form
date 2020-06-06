import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. Jeśli użytkownik wprowadzi niepoprawne dane powinniśmy wyświetlić "Niepoprawne dane" i zapytać ponownie co chce zrobić? - zwróć uwagę na komentarze przy poszczególnych nextLine
        // 2. Jeśli wszystkie wprowadzone przez użytkownika dane będą prawidłowe należy dodać go do tablicy uczestników, żeby to zrobić najpierw musimy taką stworzyć!
        //   a. Utwórz klasę Student mającą prywatne pola o nazwach odpowiadających temu co wprowadził użytkownik (imie, nazwisko, pesel, numer telefonu, jezyk, czy oplacony)
        //   b. W klasie Student utwórz gettery i settery
        //   c. W klasie Main w metodzie main na samym początku utwórz tablicę typu Student mającą pojemność 20 elementów (tyle maksymalnie będzie liczyła grupa)
        //   d. W tym samym miejscu utwórz zmienną, która będzie przechowywała wartość liczbową o ostatniej zapełnionej pozycji
        //   e. Po wprowadzeniu wszystkich poprawnych danych utwórz obiekt klasy Student i ustaw za pomocą setterów poszczególne pola na właściwe wartości
        //   f. Dodaj element do tablicy na jej następnej niezapełnionej pozycji
        // 3. Dodaj metodę toString() do klasy Student
        // 4. Dodaj obsługę wyświetlania wszystkich studentów zapisanych w liście (opcja 2)
        // 5. Dodaj obsługę wyświetlania tylko studentów, którzy opłacili kurs (dodaj opcję 3)

        Scanner scanner = new Scanner(System.in);
        String option;
        do {
            System.out.println("Co chcesz zrobić?");
            System.out.println("1. Zapisać się na kurs");
            System.out.println("2. Wyświetlić listę uczestników");
            System.out.println("q. Zakończyć");

            option = scanner.nextLine();

            if ("1".equals(option)) {
                System.out.println("Witaj!\nSłyszałem, że chcesz się zapisać na kurs!\nPodaj swoje dane i preferencje");
                System.out.println("Imię i nazwisko"); // nie powinno zawierać żadnych znaków specjalnych, ANI _
                String nameAndSurname = scanner.nextLine();

                System.out.println("PESEL"); // powinien składać się z 9 cyfr - nic więcej nie sprawdzamy
                //* zaawansowane wersja - sprawdzamy czy jest poprawny
                String pesel = scanner.nextLine();

                System.out.println("Numer telefonu"); // powinien składać się w sumie z 9 cyfr, może być rozdzielony w dowolnych miejscach spacją lub myślnikiem. Bez numeru kierunkowego
                String phoneNumber = scanner.nextLine();

                System.out.println("Wybrany język (Java, Python lub C++"); // możliwe wpisanie "Java" lub "Python" lub "C++"
                String language = scanner.nextLine();

                System.out.println("Czy opłaciłeś już kurs?(tak/nie)"); // możliwe wpisanie "tak" lub "nie"
                String paid = scanner.nextLine();
            } else if("2".equals(option)) {
                System.out.println("Oto wszyscy studenci:");
                //tutaj wypisz całą zawartość tablicy
            }

        } while ("q".equals(option));
    }
}
