package sg.edu.rp.c346.p05_quiz;

import android.content.Intent;
import android.preference.CheckBoxPreference;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    TextView tv1;
    CheckBox checkBox;
    CheckBox checkBox2;
    Button Submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Display1.class);
                if (checkBox.isChecked()) {
                    intent.putExtra("Ticket Type", "CB1");
                } else if (checkBox2.isChecked()) {
                    intent.putExtra("Ticket Type", "CB2");
                } else {
                    Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                }

                int editNumber = 1;
                if (editNumber < 0) {

                    Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                }

            }



        });

    }
}
