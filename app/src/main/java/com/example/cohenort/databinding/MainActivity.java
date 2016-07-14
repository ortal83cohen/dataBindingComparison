package com.example.cohenort.databinding;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.text1)
    TextView text1;

    @BindView(R.id.text2)
    TextView text2;

    @BindView(R.id.text3)
    TextView text3;

    @BindView(R.id.text4)
    TextView text4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.setDebug(true);
        ButterKnife.bind(this);

        text1.setText("ButterKnife");
        text2.setText("Dagger");
        text3.setText("Data Bindings");
        text4.setText("Find by");
    }


    @OnClick(R.id.button1)
    public void button1(Button button) {
        Intent myIntent = ButterKnifeActivity.createIntent(createData(), this);
        startActivity(myIntent);
    }

    @OnClick(R.id.button2)
    public void button2(Button button) {
        Intent myIntent = DaggerActivity.createIntent(createData(), this);
        startActivity(myIntent);
    }

    @OnClick(R.id.button3)
    public void button3(Button button) {
        Intent myIntent = DataBindingsActivity.createIntent(createData(), this);
        startActivity(myIntent);
    }

    @OnClick(R.id.button4)
    public void button4(Button button) {
        Intent myIntent = FindByActivity.createIntent(createData(), this);
        startActivity(myIntent);
    }

    private Data createData() {
        return new Data(getString(R.string.string_example), getString(R.string.string_example), getString(R.string.string_example),
                getString(R.string.string_example), new Date().getTime());
    }
}
