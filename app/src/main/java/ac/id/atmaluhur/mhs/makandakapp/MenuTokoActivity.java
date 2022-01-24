package ac.id.atmaluhur.mhs.makandakapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ac.id.atmaluhur.mhs.makandakapp.R;

public class MenuTokoActivity extends AppCompatActivity {

    Button btnCheckout_nasgorbiasa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_toko);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.setTitle("Menu");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.blueButton)));

        btnCheckout_nasgorbiasa = findViewById(R.id.btnCheckout_nasgorbiasa);

        btnCheckout_nasgorbiasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MenuTokoActivity.this, CheckoutActivity.class);
                startActivity(i);
            }
        });

    }


}