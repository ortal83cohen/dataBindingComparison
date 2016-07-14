package com.example.cohenort.databinding;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by cohenort on 14/07/2016.
 */
public class DaggerActivity extends AppCompatActivity {


    private static final String DATA = "data";

    public static Intent createIntent(Data data, Context context) {
        Intent intent = new Intent(context, DaggerActivity.class);
        intent.putExtra(DATA, data);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

    }
}
