package org.example;
public class Main {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println("Список після додавання елементів:");
        list.print();

        // Використовуємо метод get для отримання елементів за індексом
        System.out.println("\nЕлемент за індексом 1: " + list.get(1)); // Повинно вивести "Python"
        System.out.println("Елемент за індексом 0: " + list.get(0)); // Повинно вивести "Java"

        // Спроба отримати елемент за некоректним індексом
        try {
            System.out.println("Елемент за індексом 3: " + list.get(3));  // Викличе виняток
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}