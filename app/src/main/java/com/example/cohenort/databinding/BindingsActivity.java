package com.example.cohenort.databinding;

import com.example.cohenort.databinding.databinding.ActivityBindingBinding;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by cohenort on 14/07/2016.
 */
public class BindingsActivity extends AppCompatActivity {


    private static final String DATA = "data";

    public static Intent createIntent(Data data, Context context) {
        Intent intent = new Intent(context, BindingsActivity.class);
        intent.putExtra(DATA, data);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityBindingBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_binding);
        Data data = getIntent().getParcelableExtra(DATA);
        binding.setData(data);

    }

    public void onButtonClick(View v) {
        startActivity(new Intent(this, MainActivity.class));
    }
}
