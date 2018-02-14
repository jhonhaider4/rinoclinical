package com.example.karigarhub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterKarigar extends AppCompatActivity {

    EditText firstName, lastName, CNIC, password;
    CheckBox mechanic, electrician, gasPlumber, waterPlumber, applianceInstaller, applianceRepair, painter;
    Button btnNext;
    Boolean checkEditTextVerification=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_karigar);

        firstName = findViewById(R.id.karigarFirstName);
        lastName = findViewById(R.id.karigarLastName);
        CNIC = findViewById(R.id.karigarCNIC);
        password = findViewById(R.id.karigarPassword);

        mechanic = findViewById(R.id.checkMechanic);
        electrician = findViewById(R.id.checkElectrician);
        gasPlumber = findViewById(R.id.checkGasPlumber);
        waterPlumber = findViewById(R.id.checkWaterPlumber);
        applianceInstaller = findViewById(R.id.checkAppliance_Installer);
        applianceRepair = findViewById(R.id.checkApplianceRepairMaintenance);
        painter = findViewById(R.id.checkPainter);
        btnNext = findViewById(R.id.btnNext);


    }

    public void nextClick(View view) {
         String fn, ln, cn, pswrd, mech="", elec="", gaspl="", waterpl="", appinstaller="", apprepair="", paint="";
        fn = firstName.getText().toString();
        ln = lastName.getText().toString();
        cn = CNIC.getText().toString();
        pswrd = password.getText().toString();


        if (mechanic.isChecked()) {

            mech = "Mechanic";
        }
        if (electrician.isChecked()) {

            elec = "Electrician";
        }

        if (gasPlumber.isChecked()) {

            gaspl = "Gas Plumber";
        }
        if (waterPlumber.isChecked()) {

            waterpl = "Water Plumber";
        }
        if (applianceInstaller.isChecked()) {

            appinstaller = "Appliance Installer";
        }
        if (applianceRepair.isChecked()) {

            apprepair = "Appliance Repair";
        }
        if (painter.isChecked()) {

            paint = "Painter";
        }

        if(fn.length()>2&&ln.length()>2&&cn.length()==13&&pswrd.length()>5){
            checkEditTextVerification=true;
        }

        if(checkBox()==true&&checkEditTextVerification==true){


            Intent i=new Intent(this,KarigarPhoneAuthentication.class);


            Bundle b= new Bundle();


            b.putString("firstName",firstName.getText().toString());
            b.putString("lastName",lastName.getText().toString());
            b.putString("password",password.getText().toString());
            b.putString("CNIC",CNIC.getText().toString());
            b.putString("mechanic",mech);
            b.putString("gasPlumber",gaspl);
            b.putString("waterPlumber",waterpl);
            b.putString("electrician",elec);
            b.putString("applianceInstaller",appinstaller);
            b.putString("applianceRepair",apprepair);
            b.putString("paint",paint);

            i.putExtras(b);
            startActivity(i);
            fn="";
            ln="";
            cn="";
            pswrd="";
            mech="";
            elec="";
            gaspl="";
            waterpl="";
            appinstaller="";
            apprepair="";
            paint="";
            checkEditTextVerification=false;


        }
        else{

            Toast.makeText(this,"Kindly Fill All Fields Properly and Check atleast one Category",Toast.LENGTH_LONG).show();
        }

    }

    public boolean checkBox() {

        if (mechanic.isChecked() == true || painter.isChecked() == true || waterPlumber.isChecked() == true || gasPlumber.isChecked() == true || applianceRepair.isChecked() == true || applianceInstaller.isChecked() == true || painter.isChecked() == true ||electrician.isChecked()==true) {

            return true;
        }
return false;
    }

    public boolean checkEditText(){
        if(firstName.getText().toString()==""&&lastName.getText().toString()==""&&CNIC.getText().toString().length()!=13&&password.getText().toString().length()<4){
            return false;

        }
        return true;
        }


}