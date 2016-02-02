package sidespell.tech.midtermexam.entities;

import android.graphics.Bitmap;

/**
 * Created by daleg on 02/02/2016.
 */
public class Album {

    private String mName;
    private String mArtist;
    private String mUrl;
    private String mThumbnailSrc;

    private int mId;
    private int mLimit;

    public Album() {
    }

    public Album(String mName, String mArtist, String mUrl, String mThumbnailSrc, int mId, int mLimit, Bitmap mAlbumThumbnail) {
        this.mName = mName;
        this.mArtist = mArtist;
        this.mUrl = mUrl;
        this.mThumbnailSrc = mThumbnailSrc;
        this.mId = mId;
        this.mLimit = mLimit;
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

    public String getmUrl() {
        return mUrl;
    }

    public Album setmUrl(String url) {
        mUrl = url;
        return this;
    }

    public String getmThumbnailSrc() {
        return mThumbnailSrc;
    }


    public Album setmThumbnailStc(String url) {
        mUrl = url;
        return this;
    }

    public int getmId() {
        return mId;
    }

    public Album setmId(int id) {
        mId = id;
        return this;
    }

    public int getmLimit() {
        return mLimit;
    }

    public Album setmLimit(int limit) {
        mLimit = limit;
        return this;
    }

}
