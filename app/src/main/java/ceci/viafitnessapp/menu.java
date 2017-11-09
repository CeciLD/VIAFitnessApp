package ceci.viafitnessapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class menu extends AppCompatActivity {

    TextView diet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        diet = (TextView) findViewById(R.id.textView);
        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            diet.setText(bundle.getString("TheDiet"));
        }
    }
}
