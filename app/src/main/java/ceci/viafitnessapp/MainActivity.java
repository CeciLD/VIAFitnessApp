package ceci.viafitnessapp;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import static ceci.viafitnessapp.R.id.nav_view;
import static ceci.viafitnessapp.R.id.progressBar;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawer;
    private ActionBarDrawerToggle abdt1;
    private Button button250;
    private Button button500;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creating the NavigationDrawer
        drawer = (DrawerLayout)findViewById(R.id.d1);
        abdt1 = new ActionBarDrawerToggle(this, drawer, R.string.open, R.string.close);
        abdt1.setDrawerIndicatorEnabled(true);
        drawer.addDrawerListener(abdt1);
        abdt1.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        NavigationView nav_view = (NavigationView)findViewById(R.id.nav_view);



        //Navigation Drawer Action Listener
        nav_view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener()
        {
            //ACTIONS WHEN YOU CLICK ITEMS IN THE NAVIGATION BAR
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();

                if (id == R.id.exercises) {
                    Toast.makeText(MainActivity.this, "Exercises", Toast.LENGTH_SHORT).show();
                }
                else if (id == R.id.custom_workout) {
                    Toast.makeText(MainActivity.this, "Creating a Custom Workout", Toast.LENGTH_SHORT).show();
                }
                    else if (id == R.id.diets) {
                    Toast.makeText(MainActivity.this, "Diets", Toast.LENGTH_SHORT).show();
                }
                else if(id== R.id.pedometer) {
                    Toast.makeText(MainActivity.this, "Pedometer", Toast.LENGTH_SHORT).show();
                }
                else if(id== R.id.water_consumption) {
                    Toast.makeText(MainActivity.this, "Water Consumption", Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.water_consumption);

                    //Creating progress bar
                    progressBar = (ProgressBar) findViewById(R.id.progressBar);
                    button250 = (Button) findViewById(R.id.button);
                    button500 = (Button) findViewById(R.id.button2);
                }
                return true;
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        return abdt1.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);
    }

    private int progress = 0;
    public void add250Button(View view){

        if(progress<100){
            progressBar.setProgress(progress + 8);
            progress += 8;
        }else progress = 100;

        if(progress == 100)
            Toast.makeText(MainActivity.this, "Congratulations, you reached your daily goal", Toast.LENGTH_LONG).show();
    }

    public void add500Button(View view){

        if(progress<100){
            progressBar.setProgress(progress + 16);
            progress += 16;
        }else progress = 100;

        if(progress == 100)
            Toast.makeText(MainActivity.this, "Congratulations, you reached your daily goal", Toast.LENGTH_LONG).show();
    }

}
