package bouquet.string_practice;

import java.util.List;

public class StringPractice {

    // Конкатенация слов с числами
    public <T extends Number> String concatDiffTypes(String str, List<T> numbers) {
        for (T num : numbers) {
            str += num;
        }
        return str;
    }

    //Использование StringBuilder
    public String strBuilderUse(String[] strings, String symbol) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : strings) {
            stringBuilder.append(str).append(symbol);
        }
        return stringBuilder.toString();
    }

    //Использование метода split()
    public String[] strSplitUse(String str, String delimiter) {
        return str.split(delimiter);
    }
}
