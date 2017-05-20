package com.example.mylearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {


    String susername,spassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button=(Button)findViewById(R.id.button);

        final EditText username=(EditText)findViewById(R.id.username);

        final EditText password=(EditText)findViewById(R.id.password);

        final LinearLayout linearLayout=(LinearLayout)findViewById(R.id.lala);

        final TextView textView=(TextView)findViewById(R.id.error);

        //binding done

        //hiding vala part

        linearLayout.setVisibility(View.GONE);


        //actual reading will start after onclick button

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                susername= username.getText().toString();

                spassword= password.getText().toString();

                //extracted text from user input

                if (susername.equals("Admin") && spassword.equals("Admin"))
                {
                    Toast.makeText(getApplicationContext(),"Success",Toast.LENGTH_SHORT).show();
                }
                else
                {

                  linearLayout.setVisibility(View.VISIBLE);

                    textView.setText("Failed");



                    Toast.makeText(getApplicationContext(),"Failed",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
