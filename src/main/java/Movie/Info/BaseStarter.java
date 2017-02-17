package Movie.Info;

import java.io.FileInputStream;
import java.util.Properties;

public class BaseStarter {


	public static Properties prop;

	public static void initialize(){
		//initialize the prop file
		System.out.println("Inside initialize");
		if(prop==null){
			prop=new Properties();
			try {
				FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"//src//main//resources//config.properties");
				prop.load(fs);
				System.out.println("loaded property file");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String args[]) throws Exception{
		initialize();
		MovieRefactor movieimdb = new MovieRefactor();
		String name;
		//Get movie name
		name = prop.getProperty("movieName");
		System.out.println("Movie Name is : "+name);
		name = name.replaceAll(" ", "%20");
		//Get Movie Info
		movieimdb.MovieInfo(name);

	}
}
