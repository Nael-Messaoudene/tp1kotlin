package com.gmail.nmessaoudene.tp01_messaoudene_nael;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.gmail.nmessaoudene.tp01_messaoudene_nael.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding  binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initViews();
        Log.v("bonjour","test");

    }

    private Button buttonToast;
    private Button buttonInc;
    private TextView textViewCount;
    private Button buttonOperation;
    private TextView resultOperationView;
    private EditText firstNumber;
    private EditText secondNumber;

    private void initViews() {
        buttonToast = binding.toast;
        buttonInc = binding.count;
        textViewCount = binding.txtView;
        buttonOperation = binding.buttonOperation;
        resultOperationView = binding.resultOperationView;
        firstNumber = binding.firstNumber;
        secondNumber = binding.secondNumber;

        buttonInc.setOnClickListener(new View.OnClickListener() {

            int counter = 0;
            @Override
            public void onClick(View view) {
                counter ++;
                textViewCount.setText(""+counter);
                Log.v("clique","OKOKOKOKOKOKOKOKOKOK");
            }
        });

        buttonOperation.setOnClickListener(new View.OnClickListener() {

            //nt counter = 0;
            //int sum = Integer.parseInt(String.valueOf(firstNumber.getText())) + Integer.parseInt(String.valueOf(secondNumber.getText()));
            @Override
            public void onClick(View view) {
                //counter ++;
                int sum1 = Integer.parseInt(String.valueOf(binding.firstNumber.getText()));
                int sum2 = Integer.parseInt(String.valueOf(binding.secondNumber.getText()));
                
                  Log.v("oparation","firstNumber");
                resultOperationView.setText(String.valueOf(sum1 + sum2));
                Log.v("clique","opération !!!!!!");
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
