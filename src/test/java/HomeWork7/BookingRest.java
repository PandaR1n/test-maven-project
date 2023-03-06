package HomeWork7;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;


public class BookingRest {


    public static String testGetToken() {
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";
        Response response = given()
                .contentType(ContentType.JSON)
                .body("{ \"username\": \"admin\", \"password\": \"password123\" }")
                .post("/auth");
        String token = response.jsonPath().getString("token");
        System.out.println("Token: " + token);
        return token;

    }


    public static String createBookingId() {
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";
        Response response = given()
                .contentType(ContentType.JSON)
                .body("{\n" +
                        "    \"firstname\" : \"Ринат\",\n" +
                        "    \"lastname\" : \"Саликов\",\n" +
                        "    \"totalprice\" : 111,\n" +
                        "    \"depositpaid\" : true,\n" +
                        "    \"bookingdates\" : {\n" +
                        "        \"checkin\" : \"2023-01-01\",\n" +
                        "        \"checkout\" : \"2023-01-03\"\n" +
                        "    },\n" +
                        "    \"additionalneeds\" : \"Breakfast\"\n" +
                        "}")
                .post("/booking");
        response.then()
                .statusCode(200)
                .body("bookingid", notNullValue());
        String id = response.jsonPath().getString("bookingid");
        System.out.println("Booking ID: " + id);
        return id;
    }


    public static void putBooking(String id, String token) {
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";
        String response = RestAssured.given()
                .header("Cookie", "token=" + token)
                .header("Content-Type", "application/json")
                .body("{\n" +
                        "    \"firstname\" : \"Ринат\",\n" +
                        "    \"lastname\" : \"Саликов\",\n" +
                        "    \"totalprice\" : 11111,\n" +
                        "    \"depositpaid\" : true,\n" +
                        "    \"bookingdates\" : {\n" +
                        "        \"checkin\" : \"2023-01-01\",\n" +
                        "        \"checkout\" : \"2023-01-03\"\n" +
                        "    },\n" +
                        "    \"additionalneeds\" : \"Breakfast\"\n" +
                        "}")

                .put("/booking/" + id)
                .then()
                .statusCode(200)
                .extract()
                .response().asString();
        System.out.println("Изменил бронь: " + response);

    }

    public static void examinationBooking(String id) {
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";
        String response = RestAssured.given()
                .header("Content-Type", "application/json")
                .get("/booking/" + id).then()
                .statusCode(200)
                .extract()
                .response().asString();
        System.out.println("Проверил бронь " + response);
    }

    public static void delBooking(String id, String token) {
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";
        Response response = RestAssured.given()
                .header("Cookie", "token=" + token)
                .header("Content-Type", "application/json")
                .delete("/booking/" + id)
                .then()
                .statusCode(201)
                .extract()
                .response();
        System.out.println("Бронь удалил");

    }

    public static void examinationBookingDel(String id) {
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";
        String response = RestAssured.given()
                .header("Content-Type", "application/json")
                .get("/booking/" + id).then()
                .statusCode(404)
                .extract()
                .response().asString();
        System.out.println("Проверил что брони нет " + response);


    }
}

