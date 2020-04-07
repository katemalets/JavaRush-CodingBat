package bat.coding.java.StringsJR;

public class ConvertedWords {
    public static void main(String[] args) {
        String original = "мор мама папа дима трос ром котик сорт";
        String[] originalWords = original.split(" ");
        StringBuilder stringBuilder;

        for (int i = 0; i < originalWords.length; i++) {
            for (int j = i + 1; j < originalWords.length; j++) {
                stringBuilder = new StringBuilder(originalWords[j]);
                if (originalWords[i].equals(stringBuilder.reverse().toString())){
                    System.out.println(originalWords[i] + " - " + stringBuilder.reverse());
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