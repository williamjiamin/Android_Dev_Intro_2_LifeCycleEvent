package com.lexueoude.lifecycleevents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("lift Cycle Event:","onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("lift Cycle Event:","onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lift Cycle Event:","onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lift Cycle Event:","onPause()");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lift Cycle Event:","onStop()");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lift Cycle Event:","onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lift Cycle Event:","onRestart()");
    }
}
