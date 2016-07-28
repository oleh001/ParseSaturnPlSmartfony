package view;

import configuration.Configure;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by user on 04.07.2016.
 */
public class HtmlParse {
    Configure configure = new Configure();

    public HtmlParse() {
        Document document = getDocument();

        Elements linkHref = document.select("article.offer");
        String key;
        String[] value;
        for (Element ele : linkHref) {
            key = ele.select("a.offer-title").text();
            value = ele.select("span.statement").text().split(" ");
            mapa.put(key, value[0] + " " + value[1]);
        }
    }

    private HashMap<String, String> mapa = new HashMap<>();

    public Document getDocument() {
        try {
            return Jsoup.connect(configure.getFilePath()).get();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public HashMap<String, String> getMapa() {
        return mapa;
    }

    public void setMapa(String str1, String str2) {
        this.mapa.put(str1, str2);
    }
}
