import java.util.Arrays;
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
        String str1 = "aaabbcccdaa";
        String str2 = " ";

        //int[] ints = new int[10];

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (ch != str2.charAt(str2.length() - 1)) {
                str2 += ch;
            }
        }
        System.out.println(str2);
        Scanner scanner = new Scanner(System.in);
        String option;
        Student[] arrayOfStudents = new Student[20];

        int lastId = 0;

        do {
            System.out.println("Co chcesz zrobić?");
            System.out.println("1. Zapisać się na kurs");
            System.out.println("2. Wyświetlić listę uczestników");
            System.out.println("3. Wyświetlić listę uczestników, którzy oplacili kurs");
            System.out.println("q. Zakończyć");


            option = scanner.nextLine();

            if ("1".equals(option)) {

                System.out.println("Witaj!\nSłyszałem, że chcesz się zapisać na kurs!\nPodaj swoje dane i preferencje");
                System.out.println("Imię i nazwisko"); // nie powinno zawierać żadnych znaków specjalnych, ANI _
                String nameAndSurname = scanner.nextLine();
                if (!nameAndSurname.matches("[a-zA-ZąćęłńóśżźĄĆĘŁŃÓŚŻŹ]+ [a-zA-Z\\-ąćęłńóśżźĄĆĘŁŃÓŚŻŹ]+")) {//dodałem - dla nazwisk dwuczłonowych
                    System.out.println("Niepoprawne dane!");
                    continue;
                }

                System.out.println("PESEL"); // powinien składać się z 11 cyfr - nic więcej nie sprawdzamy
                //* zaawansowane wersja - sprawdzamy czy jest poprawny
                String pesel = scanner.nextLine();
                if (!pesel.matches("\\d{11}")) {
                    System.out.println("Niepoprawne dane!");
                    continue;
                }

                System.out.println("Numer telefonu"); // powinien składać się w sumie z 9 cyfr, może być rozdzielony w dowolnych miejscach spacją lub myślnikiem. Bez numeru kierunkowego
                String phoneNumber = scanner.nextLine();
                if (!phoneNumber.matches("(\\d[ \\-]?){8}\\d")) {
                    System.out.println("Niepoprawne dane!");
                    continue;
                }

                System.out.println("Wybrany język (Java, Python lub C++"); // możliwe wpisanie "Java" lub "Python" lub "C++"
                String language = scanner.nextLine();
                if (!language.matches("Java|Python|C\\+\\+")) {
                    System.out.println("Niepoprawne dane!");
                    continue;
                }

                System.out.println("Czy opłaciłeś już kurs?(tak/nie)"); // możliwe wpisanie "tak" lub "nie"
                String paidInput = scanner.nextLine();
                if (!paidInput.matches("tak|nie")) {
                    System.out.println("Niepoprawne dane!");
                    continue;
                }
                Student student = new Student();

                student.setNameAndSurname(nameAndSurname);
                student.setPesel(pesel);
                student.setPhoneNumber(phoneNumber);
                student.setLanguage(language);
                student.setPaid(paidInput.equals("tak"));

                arrayOfStudents[lastId] = student;
                lastId++;
            } else if ("2".equals(option)) {
                System.out.println("Oto wszyscy studenci:");
                System.out.println(Arrays.toString(arrayOfStudents));//tutaj wypisz całą zawartość tablicy
            } else if ("3".equals(option)) {
                if (lastId == 0) {
                    System.out.println("Nie ma zadnych studentow, ktorzy oplacili kurs!");
                } else {
                    System.out.println("Oto wszyscy studenci, którzy zapłacili za kurs:");
                    for (int i = 0; i < lastId; i++) {
                        arrayOfStudents[i].shout();
                        if (arrayOfStudents[i].isPaid()) {
                            System.out.println(arrayOfStudents[i].toString());
                        }
                    }
                }
            }
        } while (!"q".equals(option));
    }
}