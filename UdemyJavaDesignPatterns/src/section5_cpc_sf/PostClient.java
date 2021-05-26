package section5_cpc_sf;

public class PostClient {

	public static void main(String[] args) {
		Post post = PostFactory.createPost("blog");
		System.out.println(post);

	}

}
