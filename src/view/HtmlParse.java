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

        Elements linkHref = document.select("div.m-productItem");
        String key;
        String[] value;
        //String value;
        for (Element ele : linkHref) {
            key = ele.select("a.js-product-name").text();
            //value = ele.select("span.formatted-price__formatted-price__amount__3AiMe").text().split(" ");
            value = ele.select("div.price").text().split(",");
            mapa.put(key, value[0] + " zł");
            //mapa.put(key, value);
        }
    }

    private HashMap<String, String> mapa = new HashMap<String, String>();

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
