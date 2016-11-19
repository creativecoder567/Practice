package com.sarath.practice;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by sarath on 11/14/2016.
 */

public class A1Result extends AppCompatActivity {
    private static final int PICK_CONTACT =1 ;
    TextView tva1;
    Button  btna1;
    Button contact;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a1result);
        tva1 = (TextView)findViewById(R.id.tva1);
        btna1 = (Button)findViewById(R.id.btna1);
        contact = (Button)findViewById(R.id.btnContact);
        btna1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(A1Result.this,A2Result.class);
                startActivityForResult(intent,2);
            }
        });
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);
                startActivityForResult(intent, PICK_CONTACT);

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==2){
            String message = data.getStringExtra("MESSAGE");
            tva1.setText(message);
        }
        if (resultCode == Activity.RESULT_OK) {
            Uri contactData = data.getData();
            Cursor c =  getContentResolver().query(contactData, null, null, null, null);
            if (c.moveToFirst()) {
                String name = c.getString(c.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME));
                // TODO Whatever you want to do with the selected contact name.
                tva1.setText(name);
            }
        }
    }

}
