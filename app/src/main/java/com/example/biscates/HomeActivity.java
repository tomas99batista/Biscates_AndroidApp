package com.example.biscates;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.biscates.models.Biscates;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
    static List<Biscates> biscates = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        biscates.add(new Biscates("Biscate 1", 20.20, "Cortar a relva", "Aveiro"));
        biscates.add(new Biscates("Biscate 2", 21.20, "Cortar a juba", "Porto"));
        biscates.add(new Biscates("Biscate 3", 22.20, "Lavar a mão", "Porto"));
        biscates.add(new Biscates("Biscate 4", 23.20, "Lavar o teto", "Coimbra"));
        biscates.add(new Biscates("Biscate 5", 24.20, "Queimar o teto", "Viseu"));

        generateBiscatesComponent();
    }

    public void generateBiscatesComponent() {
        LinearLayout linearLayout = findViewById(R.id.linearLayout);
        for(int i = 0; i < biscates.size() - 1; i++) {
            Biscates biscate = biscates.get(i);
            TextView textView = new TextView(this);
            textView.setId(i);
            textView.setText(biscate.getName());
            linearLayout.addView(textView);
        }

    }
}