package com.example.appintermedia;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appintermedia.databinding.ActivityContactBinding;

public class ContactActivity extends AppCompatActivity {

    private ActivityContactBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityContactBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        mBinding.idLinkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent linkedinIntent = new Intent(Intent.ACTION_VIEW);
                linkedinIntent
                    .setData(Uri.parse("https://www.linkedin.com/in/vedacede%C3%B1opic%C3%B3n/"));
                startActivity(linkedinIntent);

                Toast.makeText(ContactActivity.this, "Si pasa", Toast.LENGTH_SHORT)
                        .show();

                          }
        });

    }
}