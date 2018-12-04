package telran.restclient.domein;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@ToString
public class Post {
	int id;
	int userId;
	String title;
	String body;

}
