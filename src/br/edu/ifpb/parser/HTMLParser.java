package br.edu.ifpb.parser;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class HTMLParser extends Object{

	public static void main(String[] args){
		
		HTMLParser.parse("", ""); //deverá retornar uma String
	}
	
	public static Document parse(String html, String baseUri) {
		// html - HTML para analisar		
		// baseUri - A URL onde o HTML foi recuperada
		
		Document doc = null;
		
		String title = null;
		
		try {
			doc = Jsoup.connect("https://github.com/").get();
			title = doc.title();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(title);
		return doc;

	}
	
}
