package br.com.evandropires;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class NumberInWordsResourceTest {

  @Test
  public void run() {
    NumberInput input = new NumberInput();
    NumberValue value = new NumberValue();
    value.setNumber(1);
    input.setValue(value);

    given()
        .when()
        .body(input)
        .contentType(ContentType.JSON)
        .post("/run")
        .then()
        .statusCode(200)
        .body(is("{\"inWords\":\"one\"}"));
  }
}
