package com.example.riabirthday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class tanvivoicenote extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tanvivoicenote);
    }

    public void tanvivid(View view) {

        Intent intent = new Intent(this, tanvivid.class);
        startActivity(intent);


    }
}
