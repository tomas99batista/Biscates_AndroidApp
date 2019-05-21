package com.example.biscates;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.biscates.models.Biscates;

public class BiscatesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biscates);
        try {this.getSupportActionBar().hide();} catch(NullPointerException e){}

        // NavBar
        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_profile:
                        Intent intent = new Intent(BiscatesActivity.this, PerfilActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.navigation_dashboard:
                        break;
                    case R.id.navigation_configuration:
                        Intent intent2 = new Intent(BiscatesActivity.this, ConfigsActivity.class);
                        startActivity(intent2);
                        break;
                }
                return false;
            }
        });

        configureNextButton();
    }

    private void configureNextButton(){
        Button nextButton = (Button) findViewById(R.id.nextButton);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BiscatesActivity.this, MeusBiscateActivity.class));
            }
        });
    }
}
