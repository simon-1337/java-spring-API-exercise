package at.upstream_mobility.itacademy.bored;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BoredApiClient {

	//final declare that overriding the value after initiation is impossible
    private static final String API_URL = "https://www.boredapi.com/api/activity";

    private final RestTemplate restTemplate;

    public BoredApiClient() {
        this.restTemplate = new RestTemplate();
    }

    //return type of this function is an object of the class BoredActivity
    public BoredActivity getActivity() {
    	//getForObject is used to make a GET request to a specified URL and retrieve the response as an object
        return restTemplate.getForObject(API_URL, BoredActivity.class);
    }
}