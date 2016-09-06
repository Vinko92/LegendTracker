package com.master.pmaproject.dal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.master.pmaproject.dal.Contracts.MarkerContract;

/**
 * Created by Vinko on 27.8.2016..
 */
public class DBHandler extends SQLiteOpenHelper {


    public DBHandler(Context context) {
        super(context, Config.DATABASE_NAME, null, Config.DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(MarkerContract.Marker.SQL_CREATE_MARKERS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion,
                          int newVersion) {

        db.execSQL(MarkerContract.Marker.SQL_DELETE_ENTRIES);
        onCreate(db);

    }
}
