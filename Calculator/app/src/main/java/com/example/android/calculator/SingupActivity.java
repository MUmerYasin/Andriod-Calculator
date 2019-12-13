package com.example.android.calculator;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
public class SingupActivity extends AppCompatActivity {
    TextView IDText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singup);
        IDText = (TextView) findViewById(R.id.txt1);
    }
    public void SubmitData(View v) {
        String message = IDText.getText().toString();

        Intent intent = new Intent(this, welcomeActivity.class);
        intent.putExtra("ID", message);
        startActivity(intent);
        Toast toast = Toast.makeText(getApplicationContext(), "Login Succesfull : ", Toast.LENGTH_SHORT);
        toast.show();
    }
}