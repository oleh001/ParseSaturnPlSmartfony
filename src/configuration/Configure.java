package configuration;

/**
 * Created by user on 04.07.2016.
 */
public class Configure {
    private final static Configure configure = new Configure();

    public Configure() {
    }

    private String filePath = "http://allegro.pl/listing/listing.php?order=m&string=iphone+6&bmatch=engagement-v6-promo-sm-sqm-dyn-fall-v2-ele-1-3-0205";

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    private final String title = "Allegro.pl Parser";

    public String getTitle() {
        return title;
    }

    public static Configure getConfigure() {
        return configure;
    }
}
