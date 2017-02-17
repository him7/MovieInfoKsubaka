package Movie.Info;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class LinkReader{

	public static String ReadLink(String url)throws Exception{

		BufferedReader reader = null;
		try{
			
			//Getting the output in JSON response
			URL urlFormat = new URL(url);
			reader = new BufferedReader(new InputStreamReader(urlFormat.openStream()));
			StringBuffer buffer = new StringBuffer();
			int read;
			char[] character = new char[2048];
			while((read=reader.read(character)) != -1){
				buffer.append(character,0,read);
				return buffer.toString();
			}
		}
		finally{
			if(reader!=null){
				reader.close();
			}
		}

		return url;
	}
}
