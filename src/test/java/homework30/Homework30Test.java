package homework30;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Homework30Test {

    @Test
    public void testLogoutResponse() {
        Response response = RestAssured
                .given()
                .when()
                .get("https://qauto.forstudy.space/api/auth/logout");

        int statusCode = response.getStatusCode();
        String responseBody = response.getBody().asString();

        assertAll("logout response",
                () -> assertEquals(200, statusCode, "Response code should be 200"),
                () -> assertEquals("{\"status\":\"ok\"}", responseBody, "Body response should be {\"status\":\"ok\"}")
        );
    }
}
