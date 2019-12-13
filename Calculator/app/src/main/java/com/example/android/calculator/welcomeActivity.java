package com.example.android.calculator;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
public class welcomeActivity extends AppCompatActivity {
    TextView IDText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        IDText = (TextView) findViewById(R.id.editText33);
        Intent intent = getIntent();
        String message = getIntent().getExtras().getString("ID");
        IDText.setText(message);
    }
    public void CalculatorBtn(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void SMSBtn(View view) {
        Uri uri = Uri.parse("smsto:12346556");
        Intent SMSIntent = new Intent(Intent.ACTION_SENDTO, uri);
        SMSIntent.putExtra("Umer", "Hi");
        startActivity(SMSIntent);
    }
    public void PhoneBtn(View view) {
        String phone = "+03060084827";
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
        startActivity(intent);
    }
    public void InternatBtn(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com")));
    }
}