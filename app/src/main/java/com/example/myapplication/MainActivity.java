package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String cake = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void showOder(View view) {
        if (view.getId()==R.id.donut) {
            Toast.makeText(this, getString(R.string.donut_order_message), Toast.LENGTH_SHORT).show();
            cake = "Donut";
        } else if (view.getId()==R.id.icecream) {
            Toast.makeText(this, getString(R.string.ice_cream_order_message), Toast.LENGTH_SHORT).show();
            cake = "Ice cream Sandwich";
        } else if (view.getId()==R.id.froyo) {
            Toast.makeText(this, getString(R.string.froyo_order_message), Toast.LENGTH_SHORT).show();
            cake = "Froyo";
        }
    }

    public void onClick(View view) {
        Intent intent = new Intent(this, OrderActivity.class);
        intent.putExtra("cake",cake);

        startActivity(intent);
    }
}