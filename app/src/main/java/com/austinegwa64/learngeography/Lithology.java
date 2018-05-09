package com.austinegwa64.learngeography;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Lithology extends AppCompatActivity {
    TextView intro;
    Button more;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lithology);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        intro = findViewById(R.id.rockIntro);
        String formatedstring = getString(R.string.RocksIntro);
        Spanned txt = Html.fromHtml(formatedstring);
        intro.setText(txt);

        more = findViewById(R.id.more);
    }

    public void moreContent(View v){

        Intent i = new Intent(this, RocksInfo.class);
        startActivity(i);
    }

}
