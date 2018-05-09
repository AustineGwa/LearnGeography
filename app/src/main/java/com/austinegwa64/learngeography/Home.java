package com.austinegwa64.learngeography;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Home extends AppCompatActivity implements RecyclerAdapter.ItemClickListener {
    RecyclerView recyclerView;
    RecyclerAdapter adapter;
    RecyclerView.LayoutManager layoutManager;


    String [] titles = {"Geomatics","Orology","Biogeography","Geomophology"," pedology", "Lithology","Potamology ", "Hydrology", "climatology", "Oceanography" };
    int [] images = {R.drawable.ic_people_black_24dp, R.drawable.ic_people_black_24dp, R.drawable.ic_people_black_24dp , R.drawable.ic_people_black_24dp,R.drawable.ic_people_black_24dp,
            R.drawable.ic_people_black_24dp , R.drawable.ic_people_black_24dp, R.drawable.ic_people_black_24dp,
            R.drawable.ic_people_black_24dp, R.drawable.ic_people_black_24dp };
    String [] description = {"Gathering , storing and delivering geographic info","The study of mountains ","the discipline involved in the study of distribution of plants and animals",
            "involves the study of landForms","The study of soils in their natural habitats", "Deals with the Study of rocks and their Characteristics","The study of rivers",
            "Atmosphere", "The study of weather patterns of the earth and the way in which they affect the climates of the earth ", "Deals with the study of ocean currents, waves and tides", };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        recyclerView = findViewById(R.id.recycler);
        adapter = new RecyclerAdapter(titles, images, description, this );
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);



    }
    @Override
    public void onItemClick(View view , int position){

        startTopical(position);

    }

    private void startTopical(int position) {

        switch (position) {
            case 0 :
            //Intent a = new Intent(this, Geomatics.class);
           // startActivity(a);
            break;
            case 1 :
              //  Intent b = new Intent(this, Orology.class);
               // startActivity(b);
                break;

            case 2 :
               // Intent c = new Intent(this, Biogeography.class);
                //startActivity(c);
                break;
            case 3 :
                //Intent d= new Intent(this, Geomophology.class);
                //startActivity(d);
                break;
            case 4 :
                //Intent e = new Intent(this, Pedology.class);
                //startActivity(e);
                break;
            case 5 :
                Intent f = new Intent(this, Lithology.class);
                startActivity(f);
                break;
            case 6 :
               // Intent g = new Intent(this, Potamology.class);
                //startActivity(g);
                break;
            case 7 :
                //Intent h = new Intent(this, Hydrology.class);
                //startActivity(h);
                break;
            case 8 :
               // Intent i = new Intent(this, Climatology.class);
                //startActivity(i);
                break;
            case 9 :
                //Intent j = new Intent(this, Oceanography.class);
               // startActivity(j);
                break;
        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.settings) {
            return true;
        }

        else if(id==R.id.search){
            onSearchRequested();

        }
        if (id == R.id.favourites) {
            Intent i = new Intent(this, Detail.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }

}
