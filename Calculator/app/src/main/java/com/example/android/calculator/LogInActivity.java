package com.example.android.calculator;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import static android.provider.AlarmClock.EXTRA_MESSAGE;
public class LogInActivity extends AppCompatActivity {
    TextView IDText;
    TextView PasswordView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        IDText = (TextView) findViewById(R.id.editText2);
        PasswordView = (TextView) findViewById(R.id.editText3);
    }
    public void sendMessage(View view) {
        String message = IDText.getText().toString();
        Intent intent = new Intent(this, welcomeActivity.class);
        intent.putExtra("ID", message);
        startActivity(intent);
        Toast toast = Toast.makeText(getApplicationContext(), "Login Succesfull : ", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void ResetButton(View view) {
        IDText.setText("");
        PasswordView.setText("");
    }
    public void RegistarButton(View view) {
        Intent i = new Intent(getApplicationContext(), SingupActivity.class);
        startActivity(i);
    }
}