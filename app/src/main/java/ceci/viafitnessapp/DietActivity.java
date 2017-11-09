package ceci.viafitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

/**
 * Created by lenovo on 04-Nov-17.
 */

public class DietActivity extends AppCompatActivity {

    private ListView mListView;
    ArrayList<Diets> data;

    private PlaceAdapter mPlaceAdapter;
    private FloatingActionButton floatingActionButton;
    SearchView searchView;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet);
        floatingActionButton = (FloatingActionButton) findViewById(R.id.floatingActionButton2);
        data = new ArrayList<Diets>();
        data.add(new Diets("The 4-week fat-burning meal plan", 7, "Fat Burning",R.drawable.a,"The get-lean grocery shopping list\n" +
                "\n" +
                "Make sure your spice cabinet is stocked and go to the grocery store to get the following items:\n" +
                "\n" +
                "Plain Greek yogurt\n" +
                "Fresh/frozen berries\n" +
                "Other fresh fruit (bananas, grapefruit, apple etc)\n" +
                "High-fiber high-protein breakfast cereal\n" +
                "High-fiber/high-protein frozen waffles\n" +
                "Natural peanut butter\n" +
                "Eggs\n" +
                "Low-fat/fat-free milk\n" +
                "High-fiber/high-protein whole-grain bread\n" +
                "High-fiber/high-protein whole-grain tortillas\n" +
                "Large chicken breast\n" +
                "Lean skirt steak\n" +
                "Lean deli meat (turkey, roast beef)\n" +
                "Ground lean turkey breast\n" +
                "Canned tuna/salmon\n" +
                "Fresh/frozen fish (salmon, tilapia etc.)\n" +
                "Canned beans (black, lentil, pinto etc)\n" +
                "Fresh/frozen vegetables\n" +
                "Butternut squash\n" +
                "Baked/sweet potato\n" +
                "Avocado\n" +
                "Low-fat cheese (sliced and shredded)\n" +
                " \n" +
                "CARB FOODS\n" +
                "What you need to know about 'super starch'\n" +
                "The new macro can help you burn more fat.\n" +
                "The 4-week fat-burning workout plans \n" +
                "\n" +
                "The 6-day trim up plan\n" +
                "The 5-day built for the beach plan\n" +
                "The 3-day detox plan\n" +
                "\n" +
                "The 4-week fat-burning meal plan "));
        data.add(new Diets("Test", 7, "test",R.drawable.ab,null));
        data.add(new Diets("Test", 7, "test",R.drawable.abc,null));

        searchView = (SearchView) findViewById(R.id.searchView);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                mPlaceAdapter.getFilter().filter(s);
                return false;
            }
        });
        mListView = (ListView) findViewById(R.id.myListView);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DietActivity.this,Calculator.class);
                startActivity(intent);
            }
        });
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Diets diet = (Diets)adapterView.getItemAtPosition(i);
                Intent intent1 = new Intent(DietActivity.this,menu.class);
                intent1.putExtra("TheDiet",diet.getTheDiet());

                startActivity(intent1);
            }
        });
        mPlaceAdapter = new PlaceAdapter(this,data);

        mListView.setAdapter(mPlaceAdapter);

    }

}
