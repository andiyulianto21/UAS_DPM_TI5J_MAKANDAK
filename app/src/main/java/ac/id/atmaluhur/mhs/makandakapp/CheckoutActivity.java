package ac.id.atmaluhur.mhs.makandakapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ac.id.atmaluhur.mhs.makandakapp.R;

public class CheckoutActivity extends AppCompatActivity {

    Button btnVoucher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.setTitle("Check Out");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.blueButton)));

        btnVoucher = findViewById(R.id.btnVoucher);

        btnVoucher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CheckoutActivity.this, VoucherActivity.class);
                startActivity(i);
            }
        });
    }
}