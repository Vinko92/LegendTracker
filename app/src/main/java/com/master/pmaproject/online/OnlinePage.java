package com.master.pmaproject.online;

import android.app.Activity;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;

import com.master.pmaproject.R;
import com.master.pmaproject.dal.Contracts.MarkerContract;
import com.master.pmaproject.dal.DBHandler;

/**
 * Created by Bojan on 6/19/2016.
 */
public class OnlinePage extends Activity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.online_page);


    }
}
