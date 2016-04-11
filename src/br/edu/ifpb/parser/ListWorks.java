package br.edu.ifpb.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class ListWorks {
    public static void main(String[] args) throws IOException {
    	
        String url = "http://www.dicio.com.br/";
        String nome = "catucar/";
        String complete = url.concat(nome);
        
        System.out.println(complete);
        
        print("Procurando em %s...", complete);

        Document doc = Jsoup.connect(complete).get();
        Elements links = doc.select("p"); 	//AQUI SE PROCURA PELA TAG HTML
        
        System.out.println(links);
    }

    private static void print(String msg, Object... args) {
        System.out.println(String.format(msg, args));
    }

}