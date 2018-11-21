package com.example.aliwaris.mplab3task3;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
   EditText message;
   CardView sendMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        message=findViewById(R.id.message);
        sendMessage=findViewById(R.id.sendMessage);
        Intent intent=getIntent();

    }
    public void sendMessage(View v){
        if(message.getText().toString().equals("")){
            Toast.makeText(getApplicationContext(),"Please type some Message!",Toast.LENGTH_LONG).show();
        }
        else{
            Intent intent=new Intent();
            intent.putExtra("Message",message.getText().toString().toString());
            setResult(RESULT_OK,intent);
            finish();

        }
    }
}
