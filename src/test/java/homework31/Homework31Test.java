package homework31;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

public class Homework31Test {

    final String expectedCarJsonFragment = "{\"id\":1,\"title\":\"Audi\"";


    @Test
    @DisplayName("Check server data response use HttpClient")
    public void responseTest() throws Exception {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://qauto.forstudy.space/api/cars/brands"))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        assertAll("response",
                () -> assertEquals(200, response.statusCode(), "Status code must be 200"),
                () -> assertTrue(
                        response.body().contains(expectedCarJsonFragment),
                        "Response must contain an object with \"id\": 1 та \"title\": \"Audi\""));
    }

    @Test
    @DisplayName("Check server data response use Rest-assured")
    public void responseTest2() {
        Response response = RestAssured
                .given()
                .when()
                .get("https://qauto.forstudy.space/api/cars/brands");

        response.then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("data.id", hasItem(1))
                .body("data.title", hasItem("Audi"));
    }

}
