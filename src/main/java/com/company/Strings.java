package com.company;

/**
 * Найти в строке самое длинное слово и количество символов в нем.
 * Если таких слов несколько - вернуть самое последнее из них (самое правое).
 * Если строка состоит из одного слова - вернуть исходную строку в верхнем регистре и количество символов в ней.
 * В качестве разделителя слов выступает пробел.
 * Знаки препинания не учитывать(представим, что их нет во входной строке)
 * <p>
 * Например:
 * <p>
 * Дано: "Java is the best language in the world"
 * Результат: "language 8"
 * <p>
 * Дано: "Live without regrets"
 * Результат: "regrets 7"
 * <p>
 * Дано: "Success"
 * Результат: "SUCCESS 7"
 */
public class Strings {

    public static String findLongestString(String string) {

        String word[] = string.trim().split(" ");
        if (word.length == 1) {
            return string.toUpperCase() + " " + string.length();
        }
        String stringArray = word[0];
        for (String s : word) {
            if (s.length() >= stringArray.length()) {
                stringArray = s;
            }
        }
        return stringArray + " " + stringArray.length();
    }

}


