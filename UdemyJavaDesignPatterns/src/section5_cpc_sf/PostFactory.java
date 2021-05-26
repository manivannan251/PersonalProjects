package section5_cpc_sf;

public class PostFactory {
	
	
	public static Post createPost(String type) {
		
		switch(type) {
		
		case "news": 
				return new NewsPost();
				
		case "blog":
			    return new BlogPost();
		case "product":
				return new ProductPost();
		default:
				throw new IllegalArgumentException("Unknown Post Type");
		
		}
	}
}
