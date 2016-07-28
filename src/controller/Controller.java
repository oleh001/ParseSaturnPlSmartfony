package controller;

import view.HtmlParse;

import java.util.HashMap;

/**
 * Created by user on 04.07.2016.
 */
public class Controller {
    public Controller() {
    }

    private HtmlParse htmlParse = new HtmlParse();

    private HashMap<String, String> mapa = htmlParse.getMapa();

    public HtmlParse getHtmlParse() {
        return htmlParse;
    }

    public HashMap<String, String> getMapa() {
        return mapa;
    }
}
