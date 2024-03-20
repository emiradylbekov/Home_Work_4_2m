import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> listA = new ArrayList<>();
        List<String> listB = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 5 имен для списка А:");
        for (int i = 0; i < 5; i++) {
            String name = scanner.nextLine();
            listA.add(name);
        }

        System.out.println("Список A: " + listA);

        System.out.println("Введите 5 имен для списка B:");
        for (int i = 0; i < 5; i++) {
            String name = scanner.nextLine();
            listB.add(name);
        }

        System.out.println("Список B: " + listB);

        List<String> listC = new ArrayList<>();
        int indexA = 0;
        int indexB = 4;

        for (int i = 0; i < 5; i++) {
            listC.add(listA.get(indexA));
            listC.add(listB.get(indexB));
            indexA++;
            indexB--;
        }

        System.out.println("Список C: " + listC);

        Collections.sort(listC, Comparator.comparingInt(String::length));

        System.out.println("Список C после сортировки: " + listC);
    }
}