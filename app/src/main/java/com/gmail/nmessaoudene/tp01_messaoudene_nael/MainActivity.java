package com.gmail.nmessaoudene.tp01_messaoudene_nael;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        Log.v("bonjour","test");

    }

    private Button buttonToast;
    private Button buttonInc;
    private TextView textViewCount;

    private void initViews() {
        buttonToast = findViewById(R.id.toast);
        buttonInc = findViewById(R.id.count);
        textViewCount = findViewById(R.id.txtView);

        buttonInc.setOnClickListener(new View.OnClickListener() {

            int counter = 0;
            @Override
            public void onClick(View view) {
                counter ++;
                textViewCount.setText(""+counter);
                Log.v("clique","OKOKOKOKOKOKOKOKOKOK");
            }
        });

        buttonToast.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Click", Toast.LENGTH_SHORT).show();
            }
        });
    }


}
