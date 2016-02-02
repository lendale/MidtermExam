package sidespell.tech.midtermexam.entities;

/**
 * Created by daleg on 02/02/2016.
 */
public class Album {

    private String mName;
    private String mArtist;
    private String mImgSize;

    public Album() {
    }

    public Album(String mName, String mArtist, String mImgSize) {
        this.mName = mName;
        this.mArtist = mArtist;
        this.mImgSize = mImgSize;
    }

    public String getmName() {
        return mName;
    }

    public Album setmName(String name) {
        mName = name;
        return this;
    }

    public String getmArtist() {
        return mArtist;
    }

    public Album setmArtist(String artist) {
        mArtist = artist;
        return this;
    }

    public String getmImgSize() {
        return mImgSize;
    }

    public Album setmImgSize(String thumbnailSrc) {
        mImgSize = thumbnailSrc;
        return this;
    }
}
