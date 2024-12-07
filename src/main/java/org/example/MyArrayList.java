package org.example;
import java.util.Arrays;
public class MyArrayList {
    private Object[] array;
    private int size;

    // Конструктор для ініціалізації масиву
    public MyArrayList() {
        this.array = new Object[10];  // Початковий розмір масиву
        this.size = 0;  // Початковий розмір списку
    }

    // Додаємо елемент в кінець списку
    public void add(Object value) {
        if (size == array.length) {
            // Якщо масив заповнений, збільшуємо його розмір
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[size++] = value;  // Додаємо елемент і збільшуємо розмір
    }
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Індекс за межами допустимого діапазону");
        }

        // Зміщуємо елементи після індексу на одну позицію вліво
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        // Очищаємо останній елемент і зменшуємо розмір
        array[size - 1] = null;
        size--;
    }

    // Метод для виведення елементів списку (для тестування)
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }
    public void clear() {
        // Очищаємо всі елементи масиву
        Arrays.fill(array, 0, size, null);
        size = 0;  // Змінюємо розмір списку на 0
    }
    public int size(){
        return size;
    }
    public Object  get(int index){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Індекс за межами допустимого діапазону");
        }
        return array[index];
    }
}