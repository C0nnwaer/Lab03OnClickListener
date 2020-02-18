package com.chungbella.lab03_onclicklistener;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.content.SharedPreferences;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView top_left ;
    TextView top_right;
    TextView bottom_left;
    TextView bottom_right;
    SharedPreferences myPreferences;


    public void cornerClick(View view){
        Context context = getApplicationContext();
        CharSequence text;
        int duration = Toast.LENGTH_SHORT;
        Toast toast;

        switch(view.getId()){
            case R.id.top_left:
                Log.i("cornerClick","top left corner clicked");
                text = "Top left";
                toast = Toast.makeText(context, text, duration);
                toast.show();
                break;
            case R.id.top_right:
                Log.i("cornerClick","top right corner clicked");
                text = "Top right";
                toast = Toast.makeText(context, text, duration);
                toast.show();
                break;
            case R.id.bottom_left:
                Log.i("cornerClick","bottom left corner clicked");
                text = "Bottom left";
                toast = Toast.makeText(context, text, duration);
                toast.show();
                break;
            case R.id.bottom_right:
                Log.i("cornerClick","bottom right corner clicked");
                text = "Bottom right";
                toast = Toast.makeText(context, text, duration);
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

        myPreferences = getSharedPreferences("com.chungbella.lab03_onclicklistener.sharedprefs",
                MODE_PRIVATE);

        SharedPreferences.Editor prefsEditor = myPreferences.edit();
        prefsEditor.putInt("top_left", 0);
        prefsEditor.putInt("top_right", 0);
        prefsEditor.putInt("bottom_left", 0);
        prefsEditor.putInt("bottom_right", 0);
    }

}
