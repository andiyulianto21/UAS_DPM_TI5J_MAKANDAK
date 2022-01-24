package ac.id.atmaluhur.mhs.makandakapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import ac.id.atmaluhur.mhs.makandakapp.R;

public class ChatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.setTitle("Chat");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.blueButton)));
    }
}