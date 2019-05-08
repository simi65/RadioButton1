package com.miss.radiobutton;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroupNb;
    private RadioButton radioButtonNb;
    private Button btnJawab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroupNb = (RadioGroup) findViewById(R.id.radioGroupNb);
        btnJawab = (Button) findViewById(R.id.buttonJawab);
        addListenerOnButtonJawab();
    }

    public void addListenerOnButtonJawab() {

        btnJawab.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //pilih radio button yang ada di radio button group
                int selectedId = radioGroupNb.getCheckedRadioButtonId();

                // mencari radio button
                radioButtonNb = (RadioButton) findViewById(selectedId);
                //menampilkan pesan teks / toast
                Toast.makeText(getBaseContext(),
                        "Kamu Memilih Notebook " + radioButtonNb.getText(),
                        Toast.LENGTH_SHORT).show();

            }

        });

    }
}