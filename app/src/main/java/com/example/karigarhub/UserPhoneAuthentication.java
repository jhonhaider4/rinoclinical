package com.example.karigarhub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class UserPhoneAuthentication extends AppCompatActivity {
    private String fn;
    private String ln;
    private String cn;
    private String pswrd;
   private String em;
   private String ph;

    DatabaseReference databaseUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_phone_authentication);
        databaseUser= FirebaseDatabase.getInstance().getReference("karigar");
        Bundle  b=getIntent().getExtras();
        fn= (String) b.getCharSequence("firstName");
        ln= (String) b.getCharSequence("lastName");
        cn= (String) b.getCharSequence("CNIC");
        pswrd= (String) b.getCharSequence("password");
        em=(String)b.getCharSequence("Email");
        ph=(String)b.getCharSequence("PhoneNo");

        Toast.makeText(this,ph+em+fn+ln+pswrd+cn,Toast.LENGTH_LONG).show();

    }
    public void getCode(View view){

    }
    public void VerifyCode(View view){


        if(!TextUtils.isEmpty(fn)){
            String id=databaseUser.push().getKey();
            userDB userdb=new userDB(id,ph,fn,ln,cn,em,pswrd);
            databaseUser.child(id).setValue(userdb);
            Toast.makeText(this, "User Added Successfully", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this, "You should Enter correct Verification code", Toast.LENGTH_LONG).show();
        }
    }
}
