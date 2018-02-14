package com.example.karigarhub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void registerKarigar(View view){
      Intent intent;
      intent=new Intent(this,RegisterKarigar.class);
        startActivity(intent);

    }
    public void registerUser(View view){
        Intent intent;
        intent=new Intent(this,RegisterUser.class);
        startActivity(intent);

    }


}
