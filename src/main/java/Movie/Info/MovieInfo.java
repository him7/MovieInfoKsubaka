package Movie.Info;


import org.json.JSONException;
import org.json.JSONObject;
public class MovieInfo {

	public void getinfo(String url) throws Exception{
		try {
			JSONObject json = new JSONObject(LinkReader.ReadLink(url));
			
			// Get IMDB from JSON response and print it
			String title = (String) json.get("imdbRating");
			System.out.println("IMDB is : " +title);
			
			// Get Genre from JSON response and print it
			String genre = (String) json.get("Genre");
			System.out.println("Genre is : " +genre);

		} catch (JSONException e) {
			e.printStackTrace();
		}
	}
}
