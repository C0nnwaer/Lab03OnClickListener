package com.chungbella.lab03_onclicklistener;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView top_left ;
    TextView top_right;
    TextView bottom_left;
    TextView bottom_right;


    public void cornerClick(View view){
        Context context = getApplicationContext();
        CharSequence text = "Hello toast!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);

        switch(view.getId()){
            case R.id.top_left:
                Log.i("cornerClick","top left corner clicked");
                toast.show();
                break;
            case R.id.top_right:
                Log.i("cornerClick","top right corner clicked");
                toast.show();
                break;
            case R.id.bottom_left:
                Log.i("cornerClick","bottom left corner clicked");
                toast.show();
                break;
            case R.id.bottom_right:
                Log.i("cornerClick","bottom right corner clicked");
                toast.show();
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        top_left = findViewById(R.id.top_left);
        top_right = findViewById(R.id.top_right);
        bottom_left = findViewById(R.id.bottom_left);
        bottom_right = findViewById(R.id.bottom_right);


    }

}
