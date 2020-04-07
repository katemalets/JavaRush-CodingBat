package bat.coding.java.StringsJR;

public class ConvertedWords {
    public static void main(String[] args) {

        String[] words = "мор мама папа дима трос ром котик сорт".split(" ");
        StringBuilder reverseWord;

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                reverseWord = new StringBuilder(words[j]).reverse();
                if (words[i].equals(reverseWord.toString())){
                    System.out.println(words[i] + " - " + reverseWord.reverse());
                }
            }
        }
    }
}

/**
 1. Обращенные слова

 В методе main с консоли считать имя файла, который содержит слова, разделенные пробелами.
 Найти в тексте все пары слов, которые являются обращением друг друга. Добавить их в result.
 Порядок слов first/second не влияет на тестирование.
 Использовать StringBuilder.

 Пример, "мор"-"ром", "трос"-"сорт"
 **/