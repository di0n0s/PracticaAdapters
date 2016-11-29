package netmind.com.practicaadapters;

/**
 * Created by A5Alumno on 11/29/2016.
 */

public class Item {

    private String mImage;
    private String mTitle;
    private String mBody;

    public Item(String mImage, String mTitle, String mBody) {
        this.mImage = mImage;
        this.mTitle = mTitle;
        this.mBody = mBody;
    }

    public String getmImage() {
        return mImage;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmBody() {
        return mBody;
    }
}
