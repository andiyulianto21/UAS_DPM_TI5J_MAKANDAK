package ac.id.atmaluhur.mhs.makandakapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MenuUtamaActivity extends AppCompatActivity {

    Button btnLihatDetail;
    ImageButton btnChat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        btnLihatDetail = findViewById(R.id.btnLihatDetail);
        btnChat = findViewById(R.id.btnChat);

        btnLihatDetail.setOnClickListener(view -> {
            Intent i = new Intent(MenuUtamaActivity.this, MenuTokoActivity.class);
            startActivity(i);
        });

        btnChat.setOnClickListener(view -> {
            Intent toChat = new Intent(MenuUtamaActivity.this, ChatActivity.class);
            startActivity(toChat);
        });
    }
}