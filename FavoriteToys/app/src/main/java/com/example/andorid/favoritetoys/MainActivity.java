package com.example.andorid.favoritetoys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.android.favoritetoys.ToyBox;

public class MainActivity extends AppCompatActivity {

    private TextView mToysListTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToysListTextView = (TextView) findViewById(R.id.tv_toys_name);

        String[] toyNames = ToyBox.getToyNames();

        for (String toyName : toyNames) {
            mToysListTextView.append(toyName + "\n\n\n");
        }
    }
}
