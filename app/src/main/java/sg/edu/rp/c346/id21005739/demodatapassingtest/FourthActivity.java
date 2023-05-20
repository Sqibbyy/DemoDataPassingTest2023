package sg.edu.rp.c346.id21005739.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    TextView tvValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        tvValue = findViewById(R.id.textViewWord);
        Intent intentReceived3 = getIntent();
        double value3 = intentReceived3.getDoubleExtra("value", 00.00);
        tvValue.setText("Double value received is: " + value3);
    }
}
