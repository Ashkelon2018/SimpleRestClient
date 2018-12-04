package telran.restclient.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;

import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import telran.restclient.domein.Post;

public class RestClientAppl {

	public static void main(String[] args) throws URISyntaxException {
		RestTemplate restTemplate = new RestTemplate();
		RequestEntity<String> request = 
				new RequestEntity<>(HttpMethod.GET, 
						new URI("https://jsonplaceholder.typicode.com/posts"));
		
		ResponseEntity<Post[]> response = 
				restTemplate.exchange(request,
						Post[].class);
		
		Post[] posts = response.getBody();
		Arrays.stream(posts).forEach(System.out::println);

	}

}
