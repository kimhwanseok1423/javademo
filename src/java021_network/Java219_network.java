package java021_network;

import java.net.MalformedURLException;
import java.net.URL;

public class Java219_network {
public static void main(String[] args) {
	URL url;
	try {
		url = new URL("https://movie.daum.net/moviedb/main?movieId=3212");
		System.out.println("getHost():"+url.getHost());
		System.out.println("getProtocol(): "+ url.getProtocol());
		System.out.println("getPort():" +url.getPort());
		System.out.println("getPath(): "+url.getPath());
		System.out.println("getQuery():"+url.getQuery());
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
