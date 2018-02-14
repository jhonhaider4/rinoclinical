package com.example.karigarhub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class KarigarPhoneAuthentication extends AppCompatActivity {
private String fn;
    private String ln;
    private String cn;
    private String pswrd;
    private String mech="";
    private String elec="";
    private String gaspl="";
    private String waterpl="";
    private String appinstaller="";
    private String apprepair="";
    private String paint="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karigar_phone_authentication);
       Bundle  b=getIntent().getExtras();
        fn= (String) b.getCharSequence("firstName");
        ln= (String) b.getCharSequence("lastName");
        cn= (String) b.getCharSequence("CNIC");
        pswrd= (String) b.getCharSequence("password");
        mech= (String) b.getCharSequence("mechanic");
        gaspl= (String) b.getCharSequence("gasPlumber");
        waterpl= (String) b.getCharSequence("waterPlumber");
        elec= (String) b.getCharSequence("electrician");
        appinstaller= (String) b.getCharSequence("applianceInstaller");
        apprepair= (String) b.getCharSequence("applianceRepair");
        paint= (String) b.getCharSequence("paint");

    }
    public void getCode(View view){


    }

}
