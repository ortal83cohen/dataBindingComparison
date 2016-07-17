package com.example.cohenort.databinding;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by cohenort on 14/07/2016.
 */
public class FindByActivity extends AppCompatActivity {


    private static final String DATA = "data";

    public static Intent createIntent(Data data, Context context) {
        Intent intent = new Intent(context, FindByActivity.class);
        intent.putExtra(DATA, data);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        Data data = getIntent().getParcelableExtra(DATA);

        TextView text1 = (TextView) findViewById(R.id.text1);
        TextView text2 = (TextView) findViewById(R.id.text2);
        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), MainActivity.class));
            }
        });

        text1.setText(data.getText1());
        text2.setText(data.getTime() + " ms");
    }

}
