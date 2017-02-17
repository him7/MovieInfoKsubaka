package Movie.Info;

import java.io.IOException;

public class MovieRefactor {

	public void MovieInfo(String movieName) throws Exception{
		//Using public API omdb to fetch the IMDB rating and Genre of the movie
		String link="http://www.omdbapi.com/?t="+movieName+ "&y=&plot=full&r=json";
		try {
			MovieInfo imdbInfo = new MovieInfo();
			imdbInfo.getinfo(link);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
