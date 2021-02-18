package com.gmail.nmessaoudene.tp01_messaoudene_nael;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.gmail.nmessaoudene.tp01_messaoudene_nael.databinding.ActivityHomeBinding;
import com.gmail.nmessaoudene.tp01_messaoudene_nael.databinding.ActivityMainBinding;

public class HomeActivity extends AppCompatActivity {


    ActivityHomeBinding  binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initViews();
        Log.v("bonjour","test");

    }

    private Button Mail;
    private Button Calculate;

    private void initViews() {
        Mail = binding.Mail;
        Calculate = binding.Calculate;


        Mail.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

             sendEmail();

                //System.out.print(mailto);
                Log.v("mailENvoyer","OKOKOKOKOKOKOKOKOKOK");
            }
        });

        Calculate.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                //counter ++;

                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                Log.v("oparation","firstNumber");

                Log.v("clique","opération !!!!!!");
            }
        });




    }

    protected void sendEmail() {
        Log.i("Send email", "");
        String[] TO = {"nael.messaoudene@pistil-studio.fr"};
        String[] CC = {"nael.messaoudene@pistil-studio.fr"};
        Intent emailIntent = new Intent(Intent.ACTION_SEND);

        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
        emailIntent.putExtra(Intent.EXTRA_CC, CC);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Your subject");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Email message goes here");

        try {
            startActivity(Intent.createChooser(emailIntent, "Send mail..."));
            finish();
            Log.i("Finished sending email...", "");
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(HomeActivity.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
        }
    }


}
