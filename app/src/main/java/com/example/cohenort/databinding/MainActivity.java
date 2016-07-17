package com.example.cohenort.databinding;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.button1)
    Button button1;

//    @BindView(R.id.button2)
//    Button button2;

    @BindView(R.id.button3)
    Button button3;

    @BindView(R.id.button4)
    Button button4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        button1.setText("ButterKnife");
//        button2.setText("Dagger");
        button3.setText("Data Bindings");
        button4.setText("Find by");
    }


    @OnClick(R.id.button1)
    public void button1(Button button) {
        Intent myIntent = ButterKnifeActivity.createIntent(createData(), this);
        startActivity(myIntent);
    }

//    @OnClick(R.id.button2)
//    public void button2(Button button) {
//        Intent myIntent = DaggerActivity.createIntent(createData(), this);
//        startActivity(myIntent);
//    }

    @OnClick(R.id.button3)
    public void button3(Button button) {
        Intent myIntent = BindingsActivity.createIntent(createData(), this);
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
