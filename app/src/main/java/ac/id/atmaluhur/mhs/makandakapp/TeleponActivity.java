package ac.id.atmaluhur.mhs.makandakapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ac.id.atmaluhur.mhs.makandakapp.R;

public class TeleponActivity extends AppCompatActivity {

    Button btnEndCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telepon);

        btnEndCall = findViewById(R.id.btnEndCall);

        btnEndCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(TeleponActivity.this, ChatActivity.class);
                startActivity(i);
            }
        });
    }
}