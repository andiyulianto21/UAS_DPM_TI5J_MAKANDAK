package ac.id.atmaluhur.mhs.makandakapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import ac.id.atmaluhur.mhs.makandakapp.R;

public class PencarianActivity extends AppCompatActivity {

    Button btnSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pencarian);

        btnSearch = findViewById(R.id.btnSearch);

        btnSearch.setOnClickListener(view -> {
            Intent toDetail = new Intent(PencarianActivity.this, DetailMakananActivity.class);
            startActivity(toDetail);
        });
    }
}