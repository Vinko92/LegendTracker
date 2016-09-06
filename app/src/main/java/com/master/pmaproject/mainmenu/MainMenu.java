package com.master.pmaproject.mainmenu;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.master.pmaproject.R;
import com.master.pmaproject.dal.Contracts.MarkerContract;
import com.master.pmaproject.dal.DBHandler;
import com.master.pmaproject.online.OnlinePage;
import com.master.pmaproject.settings.SettingsMenu;

/**
 * Created by Bojan on 6/19/2016.
 */
public class MainMenu extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_menu);

        Button btnGoOnline = (Button)findViewById(R.id.btnGoOnline);
        Button btnSettings = (Button)findViewById(R.id.btnSettings);

        btnGoOnline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainMenu.this, OnlinePage.class);
                startActivity(i);
            }
        });
        btnSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainMenu.this, SettingsMenu.class);
                startActivity(i);
            }
        });
    }
}
