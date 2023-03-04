package homework05;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что один человек может иметь несколько телефонов.

import java.util.HashMap;

import java.util.List;

public class Task51 {
    public static void main(String[] args) {
        HashMap<String, List<String>> phoneBook = new HashMap<>();

        phoneBook.put("Ivanov", List.of("+7954656", "555678"));
        phoneBook.put("Petrov", List.of("+75654656", "+7908555678"));
        phoneBook.put("Sidorov", List.of("+7910878", "883130"));
        
        System.out.println(phoneBook);
    }

}
