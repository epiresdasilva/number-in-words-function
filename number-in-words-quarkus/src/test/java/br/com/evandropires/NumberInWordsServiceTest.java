package br.com.evandropires;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by evandro on 04/06/18.
 */
@RunWith(JUnit4.class)
public class NumberInWordsServiceTest {

    @Test(expected = IllegalArgumentException.class)
    public void numberInWordsNull() {
        NumberInWordsService amountInWordsService = new NumberInWordsService();
        amountInWordsService.numberInWords(null);
    }

    @Test
    public void numberInWords() {
        NumberInWordsService amountInWordsService = new NumberInWordsService();

        String inWords = amountInWordsService.numberInWords(1);
        Assert.assertEquals("one", inWords);

        inWords = amountInWordsService.numberInWords(21);
        Assert.assertEquals("twenty-one", inWords);

        inWords = amountInWordsService.numberInWords(74);
        Assert.assertEquals("seventy-four", inWords);

        inWords = amountInWordsService.numberInWords(90);
        Assert.assertEquals("ninety", inWords);
    }

}
