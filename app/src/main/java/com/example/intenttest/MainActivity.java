package com.example.intenttest;

import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SearchView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button send = findViewById(R.id.submit);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = findViewById(R.id.web);
                String website = editText.getText().toString();
                Intent sendIntent=new Intent();
                sendIntent.setAction(Intent.ACTION_VIEW);
                sendIntent.setData(Uri.parse(website));
                startActivity(sendIntent);
            }
        });

    }
}
