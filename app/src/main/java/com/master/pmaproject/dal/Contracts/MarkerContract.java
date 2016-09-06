package com.master.pmaproject.dal.Contracts;

import android.provider.BaseColumns;

/**
 * Created by Vinko on 27.8.2016..
 */
public final class MarkerContract {

    // To prevent someone from accidentally instantiating the contract class,
    // make the constructor private.
    private MarkerContract() {}

    /* Inner class that defines the table contents */
    public static class Marker implements BaseColumns {

        public static final String TABLE_NAME = "marker";

        public static final String TITLE = "title";
        public static final String DESCRIPTION = "Description";
        public static final String LONGITUDE = "longitude";
        public static final String LATITUDE = "latitude";

        private static final String TEXT_TYPE = " TEXT";
        private static final String COMMA =  ",";

        public static final String SQL_CREATE_MARKERS_TABLE =
                "CREATE TABLE " + MarkerContract.Marker.TABLE_NAME + " (" +
                        Marker._ID + " INTEGER PRIMARY KEY," +
                        Marker.TITLE + TEXT_TYPE + COMMA +
                        Marker.DESCRIPTION + TEXT_TYPE + COMMA +
                        Marker.LONGITUDE + TEXT_TYPE + COMMA +
                        Marker.LATITUDE + TEXT_TYPE + " )";

        public static final String SQL_DELETE_ENTRIES =
                "DROP TABLE IF EXISTS " + Marker.TABLE_NAME;
    }
}
