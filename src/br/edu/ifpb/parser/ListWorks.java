package br.edu.ifpb.parser;

import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Example program to list links from a URL.
 */
public class ListWorks {
    public static void main(String[] args) throws IOException {
    	
        String url = "http://www.dicio.com.br/";
        String nome = "definir/";
        String complete = url.concat(nome);

        System.out.println(complete);
        
        print("Fetching %s...", complete);

        Document doc = Jsoup.connect(complete).get();
        Elements links = doc.select("p");
        
        System.out.println(links);
    }

    private static void print(String msg, Object... args) {
        System.out.println(String.format(msg, args));
    }

    private static String trim(String s, int width) {
        if (s.length() > width)
            return s.substring(0, width-1) + ".";
        else
            return s;
    }
}