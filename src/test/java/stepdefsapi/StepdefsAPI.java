package stepdefsapi;

import com.fasterxml.jackson.databind.ObjectMapper;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.Assert;
import rough.Placeholders;

import java.io.IOException;
import java.util.Arrays;

public class StepdefsAPI {
    private DefaultHttpClient httpClient = new DefaultHttpClient();
    private HttpGet getRequest;
    private HttpPost postRequest;
    private HttpResponse response;
    private HttpEntity httpEntity;

    @Given("^I set user service api endpoint \"([^\"]*)\"$")
    public void i_set_user_service_api_endpoint(String url){
        getRequest = new HttpGet(url);
    }

    @Given("^I set user service api endpoint POST \"([^\"]*)\"$")
    public void i_set_user_service_api_endpoint_POST(String url){
        postRequest = new HttpPost(url);
    }

    @When("^I Set request HEADER$")
    public void i_Set_request_HEADER() {
        getRequest.addHeader("accept", "application/xml");
    }

    @When("^I Set request POST HEADER$")
    public void i_Set_request_POST_HEADER() {
        postRequest.addHeader("accept", "application/xml");
    }

    @When("^Send a GET HTTP request$")
    public void send_a_GET_HTTP_request() throws IOException {
        response = httpClient.execute(getRequest);
        int statusCode = response.getStatusLine().getStatusCode();
        if (statusCode != 200)
        {
            throw new RuntimeException("Failed with HTTP error code : " + statusCode);
        }
    }
    @When("^Send a POST HTTP request$")
    public void send_a_POST_HTTP_request() throws IOException {

        postRequest.setEntity(new StringEntity("{\"userId\": 100,\"id\": 100,\"title\": \"Automation test\",\"body\": \"Let's do it\"}"));

        response = httpClient.execute(postRequest);

        int statusCode = response.getStatusLine().getStatusCode();
        if (statusCode != 201)
        {
            throw new RuntimeException("Failed with HTTP error code : " + statusCode);
        }
    }

    @When("^Send a POST 404 HTTP request$")
    public void send_a_POST_404_HTTP_request() throws IOException {

        postRequest.setEntity(new StringEntity("{\"userId\": 100,\"id\": 100,\"title\": \"Automation test\",\"body\": \"Let's do it\"}"));

        response = httpClient.execute(postRequest);

        int statusCode = response.getStatusLine().getStatusCode();
        if (statusCode != 404)
        {
            throw new RuntimeException("Failed with HTTP error code : " + statusCode);
        }
    }
    @Then("^I receive valid Response \"([^\"]*)\"$")
    public void i_receive_valid_Response(String arg1) throws IOException {
        httpEntity = response.getEntity();
        System.out.println(response.getStatusLine());

        String apiOutput = EntityUtils.toString(httpEntity);

       System.out.println(apiOutput);
        ObjectMapper objectMapper = new ObjectMapper();

        Placeholders [] root = objectMapper.readValue(apiOutput, Placeholders[].class);

        for (Placeholders placeholders: Arrays.asList(root) ){
            Assert.assertEquals(placeholders.getId(),"7");
            Assert.assertEquals(placeholders.getTitle(), "magnam facilis autem");
            }

    }



}
