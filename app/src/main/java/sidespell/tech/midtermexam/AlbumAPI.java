//package sidespell.tech.midtermexam;
//
//import android.net.Uri;
//import android.support.annotation.NonNull;
//import android.text.TextUtils;
//
//import org.json.JSONException;
//import org.json.JSONObject;
//
//import sidespell.tech.midtermexam.entities.Album;
//import sidespell.tech.midtermexam.utils.HttpUtils;
//
///**
// * Created by daleg on 02/02/2016.
// */
//public class AlbumAPI {
//
//    public static final String BASE_URL = "http://ws.audioscrobbler.com/2.0/";
//    public static final String IMG_BASE_URL = "http://img2-ak.lst.fm/i/u/174s/";
//
//    public static final String IMG_SIZE = "large";
//
//    public static final String PARAM_METHOD = "?method";
//    public static final String PARAM_API_KEY = "api_key";
//    public static final String PARAM_LIMIT = "limit";
//
//    private static final String LFM_RESULTS = "results";
//    private static final String LFM_ALBUM_MATCHES = "albummatches";
//    private static final String LFM_ALBUM = "album";
//    private static final String LFM_NAME = "name";
//    private static final String LFM_ARTIST = "artist";
//    private static final String LFM_IMAGE = "image";
//    private static final String LFM_SIZE_TEXT = "#text";
//
//    public static Album getAlbum(Uri uri, @NonNull String requestMethod) {
//        String json = HttpUtils.getResponse(uri, requestMethod);
//
//        if (TextUtils.isEmpty(json)) {
//            return null;
//        }
//
//        // Here we will now parse the json response and convert it into a Album object.
//        final String name;
//        final String artist;
//        final String imgSize;
//        final int index;
//
//        try {
//            // 1) Convert the json string response into an actual JSON Object
//            JSONObject jsonObject = new JSONObject(json);
//
//            // 2) Get the results from the "results" object
//            JSONObject results = jsonObject.getJSONObject(LFM_RESULTS);
//
////            results.getJSONObject(LFM_ALBUM_MATCHES)
////                    .getJSONArray(LFM_ALBUM)
////                    .get(0);
//
//        } catch (JSONException e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
//}
