package com.example.fishnclick;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

<<<<<<< Updated upstream
=======
import com.google.android.material.bottomnavigation.BottomNavigationView;

>>>>>>> Stashed changes
public class MainActivity extends AppCompatActivity {
<<<<<<< Updated upstream
    private int clicks = 0;
    TextView FishView;
=======
    private static TextView FishView = (TextView) findViewById(R.id.FishView);
    private static Fish fish1 = new Fish("bar",1);
>>>>>>> Stashed changes
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FishView = (TextView) findViewById(R.id.FishView);
<<<<<<< Updated upstream
=======

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setSelectedItemId(R.id.fish);
        bottomNav.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
                switch(item.getItemId()){
                    case R.id.upgrades:
                        startActivity(new Intent(getApplicationContext(),Upgrades.class));
                        break;
                    case R.id.fish:
                        break;
                    case R.id.shop:
                        startActivity(new Intent(getApplicationContext(),Shop.class));
                        break;
                }
            }
        });
>>>>>>> Stashed changes
    }


    public void FishClick(View view) {
        clicks++;
        FishView.setText(clicks+ " clicks!");
    }

}