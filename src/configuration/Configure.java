package configuration;

/**
 * Created by user on 04.07.2016.
 */
public class Configure {
    private final static Configure configure = new Configure();

    public Configure() {
    }


    private String filePath = "https://saturn.pl/telefony-i-smartfony/smartfony";

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    private final String title = "Saturn.pl Parser";

    public String getTitle() {
        return title;
    }

    public static Configure getConfigure() {
        return configure;
    }
}
