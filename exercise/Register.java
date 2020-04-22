package exercise;

import static exercise.Constance.*;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import static exercise.RandomString.generateRandomString;
import static io.restassured.RestAssured.*;
import static org.hamcrest.core.Is.is;

public class Register {
    @Test
    public void registrationSuccessful() {

        baseURI = "http://restapi.demoqa.com/customer";
        RequestSpecification request = given();
        JSONObject requestParams = new JSONObject();
        requestParams.put("FirstName" , generateRandomString());
        requestParams.put("LastName" , generateRandomString());
        requestParams.put("UserName" , generateRandomString());
        requestParams.put("Password" , generateRandomString());
        requestParams.put("Email" , generateRandomString() + "@gmail.com");
       request.header("content-type","application/json");
       request.body(requestParams.toJSONString());
       Response response = request.post("/register");
        Assert.assertEquals( CREATED_USER ,response.getStatusCode());
        Assert.assertThat("correct success code" ,
                response.jsonPath().get("SuccessCode"), is(successCodeOfRegistration));
    }
}
