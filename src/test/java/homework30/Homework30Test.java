package homework30;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

public class Homework30Test {

    @Test
    public void testLogoutResponse() {
        Response response = RestAssured
                .given()
                .when()
                .get("https://qauto.forstudy.space/api/auth/logout");

        int statusCode = response.getStatusCode();
        String status = response.jsonPath().getString("status");

        SoftAssertions softly = new SoftAssertions();

        softly.assertThat(statusCode)
                .as("Статус-код повинен бути 200")
                .isEqualTo(200);

        softly.assertThat(status)
                .as("Поле 'status' повинно дорівнювати 'ok'")
                .isEqualTo("ok");

        softly.assertAll();
    }
}
