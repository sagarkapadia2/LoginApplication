package com.sagar.loginapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText username_txt,password_txt;
    private Button login_bnt,clear_bnt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username_txt= (EditText) findViewById(R.id.usernameEditText);
        password_txt= (EditText) findViewById(R.id.passwordEditText);

        login_bnt= (Button) findViewById(R.id.loginButton);
        clear_bnt= (Button) findViewById(R.id.resetButton);

        login_bnt.setOnClickListener(this);
        clear_bnt.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.loginButton:
                String user=username_txt.getText().toString();
                String pass=password_txt.getText().toString();
                if(user.equals("sagar")&&pass.equals("sagar")) {
                    Toast.makeText(this, "Login Successfully", Toast.LENGTH_LONG).show();

                    Intent intent=new Intent(this,SecondActivity.class);
                    intent.putExtra("user",user);
                    startActivity(intent);
                }else{
                    Toast.makeText(this, "Username and Password is Invalid", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.resetButton:
                username_txt.setText(null);
                password_txt.setText(null);
                break;
            default:
                break;
        }
    }

}
