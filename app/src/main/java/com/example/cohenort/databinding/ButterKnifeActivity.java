package com.example.cohenort.databinding;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by cohenort on 14/07/2016.
 */
public class ButterKnifeActivity extends AppCompatActivity {

    private static final String DATA = "data";

    @BindView(R.id.text1)
    TextView text1;

    @BindView(R.id.text2)
    TextView text2;

    public static Intent createIntent(Data data, Context context) {
        Intent intent = new Intent(context, ButterKnifeActivity.class);
        intent.putExtra(DATA, data);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        ButterKnife.bind(this);
        Data data = getIntent().getParcelableExtra(DATA);

        text1.setText(data.getText1());
        text2.setText(data.getTime() + " ms");
    }


    @OnClick(R.id.button)
    public void button(Button button) {
        startActivity(new Intent(this, MainActivity.class));
    }
}
