package helper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

import static helper.Utility.generateRandomEmail;

public class Models {
    private static RequestSpecification request;
    public static void setupHeaders(){
        request = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("Authorization", "Bearer 71ef1c41a232a022e5498ce061b0ad9e879b13da8184780eaf95a7e80ed33d0a");
    }
    public static Response getListUser(String endpoint){
        System.out.println("endpoint:"+endpoint);
        setupHeaders();
        return request.get(endpoint);
    }
    public static Response postCreateUser(String endpoint){
        String name = "Heri Setyo Aji";
        String gender = "Male";
        String email = generateRandomEmail();
        String status = "active";
        JSONObject payload = new JSONObject();
        payload.put("name", name);
        payload.put("gender", gender);
        payload.put("email", email);
        payload.put("status", status);
        setupHeaders();
        return request.body(payload.toString()).when().post(endpoint);
    }
    public static Response deleteUser(String endpoint, String user_id){
        setupHeaders();
        String finalEndpoint = endpoint + "/" + user_id;
        return request.when().delete(finalEndpoint);
    }
    public static Response updateUser(String endpoint, String user_id){
        setupHeaders();
        String name = "Heri Edit";
        String gender = "Male";
        String email = generateRandomEmail();
        String status = "active";
        JSONObject payload = new JSONObject();
        payload.put("name", name);
        payload.put("gender", gender);
        payload.put("email", email);
        payload.put("status", status);
        String finalEndpoint = endpoint + "/" + user_id;
        return request.body(payload.toString()).when().patch(finalEndpoint);
    }
}
