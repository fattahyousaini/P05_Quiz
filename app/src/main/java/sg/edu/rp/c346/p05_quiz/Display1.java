package sg.edu.rp.c346.p05_quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Display1 extends AppCompatActivity {

    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display1);

        String text="";
        String text2="";


        tvDisplay = findViewById(R.id.textView3);
        tvDisplay.setText("")
    }
}
