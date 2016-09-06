package com.master.pmaproject.helpers;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Vinko on 28.8.2016..
 */
public class FourSquareHelper {

    private static final String baseUrl = "https://api.foursquare.com/v2/";
    private static final String ID = "&client_id=PZQDE4MVBD45M2OBO1MT5IOBVFBFYAYRQQMXOEA1PTJOF3OZ";
    private static final String SECRET  = "&client_secret=V3G2HZJ0LEDKXW5EQPIQLCPMGDUCZRLI1XYH3DAEYWZ14OKD";

    public static String getMarkers(String longitude, String latitude)
    {
        String stringURL = baseUrl + "venues/search?ll=" + longitude + "," + latitude + ID + SECRET;
        try {

            URL url = new URL(stringURL);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            try {
                InputStream in = new BufferedInputStream(urlConnection.getInputStream());
                return in.toString();
            }
                finally {
                    urlConnection.disconnect();
                }
        }
        catch(Exception ex) {}

        return "";
    }
}
