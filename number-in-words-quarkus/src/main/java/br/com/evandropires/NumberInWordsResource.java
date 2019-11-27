package br.com.evandropires;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/rurunn")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class NumberInWordsResource {

  @POST
  public NumberResponse run(NumberInput input) {
    String numberInWords = new NumberInWordsService().numberInWords(input.getValue().getNumber());
    return new NumberResponse(numberInWords);
  }
}
