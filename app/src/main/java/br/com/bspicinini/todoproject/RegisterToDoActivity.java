package br.com.bspicinini.todoproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class RegisterToDoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_to_do);
        Intent intent = getIntent();
        Bundle bd = intent.getExtras();
        Toast toast = Toast.makeText(getApplicationContext(), (String) bd.get("Login"),Toast.LENGTH_LONG);
        toast.show();
    }
}
