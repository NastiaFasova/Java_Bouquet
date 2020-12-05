package bouquet.string_practice;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class StringPracticeTest {

    private StringPractice practice = new StringPractice();

    @Test
    public void ConcatDiffTypes_ConcatStringAndList_Ok() {
        String str1 = "This is enough";
        List<Double> list1 = List.of(1.5, 4.8, 7.1);
        List<Integer> list2 = List.of(5, 4, 1);
        String expected1 = "This is enough1.54.87.1";
        String expected2 = "This is enough541";
        String actual1 = practice.concatDiffTypes(str1, list1);
        String actual2 = practice.concatDiffTypes(str1, list2);
        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
    }

    @Test
    public void StrBuilderUse_CreateString_Ok() {
        String[] str = new String[]{"This", "is", "enough"};
        String symbol = "*";
        String expected = "This*is*enough*";
        String actual = practice.strBuilderUse(str, symbol);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void StrSplitUse_SplitString_Ok() {
        String str1 = "This is enough";
        String str2 = "This~is~enough";
        String[] expected1 = new String[]{"This", "is", "enough"};
        String[] actual1 = practice.strSplitUse(str1, " ");
        String[] expected2 = new String[]{"This", "is", "enough"};
        String[] actual2 = practice.strSplitUse(str2, "~");
        Assert.assertArrayEquals(expected1, actual1);
        Assert.assertArrayEquals(expected2, actual2);
    }
}