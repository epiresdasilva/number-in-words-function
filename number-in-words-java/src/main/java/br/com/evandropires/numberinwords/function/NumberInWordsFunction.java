package br.com.evandropires.numberinwords.function;

import br.com.evandropires.numberinwords.service.NumberInWordsService;
import com.google.gson.JsonObject;

public class NumberInWordsFunction {

    public static JsonObject main(JsonObject payload) {
        Integer number = payload.get("number").getAsInt();
        String numberInWords = new NumberInWordsService().numberInWords(number);
        JsonObject response = new JsonObject();
        response.addProperty("inWords", numberInWords);
        return response;
    }
}
