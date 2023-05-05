package project;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.oauth2;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;

public class RestAssuredGitHubProject {
    RequestSpecification requestSpec;
    ResponseSpecification responseSpec;
    String keyid;
    int id;
    @BeforeClass
    public void setUp() {

        requestSpec = new RequestSpecBuilder().
                setBaseUri("https://api.github.com").
                addHeader("Content-Type", "application/json").
                setAuth(oauth2("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")).
                build();

        responseSpec = new ResponseSpecBuilder().
                //expectStatusCode(200).
                        expectResponseTime(lessThan(5000L)).
                build();
    }
    @Test(priority = 1)
    public void postRequestTest() {

        Map<String, Object> req = new HashMap<>();
        req.put("title", "TestAPIKey");
        req.put("key", "ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAILvfO37DvTZiBr0Qcb3We6EjEj0zi6U+yzEu2rzsqDjf");

        Response response = given().
                spec(requestSpec).
                basePath("/user/keys").
                body(req).
                log().all().
                when().
                post();

        id = response.then().
                extract().
                path("id");

        //Assertions
        response.then().
                spec(responseSpec).
                statusCode(201).
                log().all();

        //Assertions
        response.then().
                spec(responseSpec).
                body("title", equalTo("TestAPIKey"));

    }

    @Test(priority = 2)
    public void getRequest() {

        given().
                spec(requestSpec).
                pathParam("id", id).
                log().all().
                when().
                get("/user/keys/{id}").
                then().
                spec(responseSpec).
                statusCode(200).
                body("id", equalTo(id)).
                body("title", equalTo("TestAPIKey")).
                log().all();

    }

    @Test(priority = 3)
    public void deleteRequest(){

        given().
                spec(requestSpec).
                pathParam("id", id).
                log().all().
                when().
                delete("/user/keys/{id}").
                then().
                spec(responseSpec).
                statusCode(204).
                log().all();

    }


}
