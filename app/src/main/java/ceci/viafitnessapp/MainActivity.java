package ceci.viafitnessapp;

import android.content.Intent;
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
                    Intent intent = new Intent(MainActivity.this,ExcerciseActivity.class);
                    startActivity(intent);
                }
                else if (id == R.id.custom_workout) {
                    Intent intent = new Intent(MainActivity.this,CustomWorkout.class);
                    startActivity(intent);
                }
                else if (id == R.id.diets) {
                    Intent intent = new Intent(MainActivity.this,DietActivity.class);
                    startActivity(intent);
                }
                else if(id== R.id.pedometer) {
                    Intent intent = new Intent(MainActivity.this,Pedometer.class);
                    startActivity(intent);

                }
                else if(id== R.id.water_consumption) {
                    Intent intent = new Intent(MainActivity.this,WaterConsumation.class);
                    startActivity(intent);

                }
                return true;
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        return abdt1.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);
    }



}
