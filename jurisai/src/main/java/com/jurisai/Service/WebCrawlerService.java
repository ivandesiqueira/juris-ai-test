package com.jurisai.Service;

import com.jurisai.model.Movie;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class WebCrawlerService {

    private static final String URL = "https://www.rottentomatoes.com/browse/movies_in_theaters/sort:top_box_office";

    public List<Movie> getTopMovies() {
        List<Movie> movies = new ArrayList<>();
        try {
            // Conecta ao site e obtém o HTML
            Document doc = Jsoup.connect(URL)
                    .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/110.0.0.0 Safari/537.36")
                    .timeout(10_000)
                    .get();

            // 🔍 DEPURAÇÃO: Exibir HTML retornado no console
            System.out.println("===== HTML OBTIDO =====");
            System.out.println(doc.html());  // Exibe todo o HTML da página

            // Seleciona os elementos que contêm os filmes
            Elements movieElements = doc.select("tile-dynamic a[data-qa='discovery-media-list-item-caption']");

            int count = 0;
            for (Element element : movieElements) {
                if (count >= 10) break; // Pegamos apenas os 10 primeiros filmes

                String title = element.text();
                String releaseDate = element.parent().select("span[data-qa='discovery-media-list-item-start-date']").text();

                movies.add(new Movie(title, releaseDate));
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return movies;
    }
}