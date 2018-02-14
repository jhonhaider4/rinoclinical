package com.example.karigarhub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterUser extends AppCompatActivity {
    EditText firstname, lastname, email, phone, password, cnicno;
    Button btnRegister;
    Boolean checkEditTextVerification = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);
        firstname = findViewById(R.id.userFirstName);
        lastname = findViewById(R.id.userLastName);
        email = findViewById(R.id.userEmail);
        cnicno = findViewById(R.id.UserCNICNo);
        phone = findViewById(R.id.userPhoneNo);
        password = findViewById(R.id.userPassword);
        btnRegister = findViewById(R.id.button5);
    }

    public void registerClick(View view) {
        String fn, ln, em, cnic, ph, pass;
        fn = firstname.getText().toString();
        ln = lastname.getText().toString();
        em = email.getText().toString();
        cnic = cnicno.getText().toString();
        ph = phone.getText().toString();
        pass = password.getText().toString();

        if (fn.length() > 2 && ln.length() > 2 && !em.isEmpty() && cnic.length() == 13 && ph.length() == 11 && pass.length() > 5) {
            checkEditTextVerification = true;

        }


        if (checkEditTextVerification == true) {

            Intent i = new Intent(this, UserPhoneAuthentication.class);


            Bundle b = new Bundle();


            b.putString("firstName", firstname.getText().toString());
            b.putString("lastName", lastname.getText().toString());
            b.putString("password", password.getText().toString());
            b.putString("CNIC", cnicno.getText().toString());
            b.putString("PhoneNo", phone.getText().toString());
            b.putString("Email", email.getText().toString());

            i.putExtras(b);
            startActivity(i);
            fn = "";
            ln = "";
            cnic = "";
            pass = "";
            ph = "";
            em = "";
            checkEditTextVerification = false;
        } else {

            Toast.makeText(this, "Kindly Fill All Fields Properly and Check atleast one Category", Toast.LENGTH_LONG).show();
        }
    }

    public Boolean checkEditText() {
        if (firstname.getText().toString() == "" && lastname.getText().toString() == "" && cnicno.length() != 13 && password.length() < 5 && phone.length() != 11 && email.getText().toString() == "") {
            return false;

        }
        return true;
    }

}

