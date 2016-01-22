package com.dzartek.myappportfollio;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnSpotify, btnScores, btnLibrary, btnBuildItBigger, btnXyzReader, btnCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //  Possibly use this later for feedback via email
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        initializeWidgets();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void initializeWidgets(){
        btnBuildItBigger = (Button) findViewById(R.id.btnBuildItBigger);
        btnSpotify = (Button) findViewById(R.id.btnSpotifyStreamer);
        btnScores= (Button) findViewById(R.id.btnScoresApp);
        btnLibrary = (Button) findViewById(R.id.btnLibraryApp);
        btnXyzReader= (Button) findViewById(R.id.btnXyzReader);
        btnCapstone= (Button) findViewById(R.id.btnCapstone);
        btnBuildItBigger.setOnClickListener(this);
        btnSpotify.setOnClickListener(this);
        btnScores.setOnClickListener(this);
        btnLibrary.setOnClickListener(this);
        btnXyzReader.setOnClickListener(this);
        btnCapstone.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnSpotifyStreamer:
                showMyToast("This button will launch Spotify Streamer!");
                break;
            case R.id.btnScoresApp:
                showMyToast("This button will launch Scores App!");

                break;
            case R.id.btnLibraryApp:
                showMyToast("This button will launch Library App!");

                break;
            case R.id.btnBuildItBigger:
                showMyToast("This button will launch Build it Bigger!");
                break;
            case R.id.btnXyzReader:
                showMyToast("This button will launch XYZ Reader!");
                break;
            case R.id.btnCapstone:
                showMyToast("This button will launch my capstone app!");
                break;
            default:
                break;
        }
    }

    public void showMyToast(String msg) {

        TextView tv = new TextView(this);

        tv.setTextColor(ContextCompat.getColor(this, R.color.colorPrimary));
        tv.setTextSize(17);
        tv.setTypeface(null, Typeface.BOLD);
        tv.setText(msg);

        Toast tt = new Toast(this);

        //tt.setGravity(Gravity.BOTTOM, 0, 350);
        tt.setGravity(Gravity.BOTTOM|Gravity.CENTER_HORIZONTAL, 0, 150);
        tt.setView(tv);
        tt.show();

    }
}
