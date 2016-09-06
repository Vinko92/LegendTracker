package com.master.pmaproject.start;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.master.pmaproject.R;
import com.master.pmaproject.dal.Contracts.MarkerContract;
import com.master.pmaproject.dal.DBHandler;
import com.master.pmaproject.helpers.FourSquareHelper;
import com.master.pmaproject.mainmenu.MainMenu;
import com.master.pmaproject.online.OnlinePage;

/**
 * Created by Bojan on 6/19/2016.
 */
public class FirstPage extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.start_screen);

        Button btnStart = (Button)findViewById(R.id.buttonStart);
        Button btnOnline = (Button)findViewById(R.id.buttonOnline);

        String markersData = FourSquareHelper.getMarkers("40.7", "-74");
        btnStart.setText(markersData);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FirstPage.this,MainMenu.class);
                startActivity(i);
            }
        });

        btnOnline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FirstPage.this,OnlinePage.class);
                startActivity(i);
            }
        });
    }


}

