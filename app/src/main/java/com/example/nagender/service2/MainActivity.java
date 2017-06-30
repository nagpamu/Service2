package com.example.nagender.service2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void startservice(View view)
    {
        startservice(new Intent(getBaseContext(),MyService.class));

    }



    public void stopservice(View view)
     {
         stopservice(new Intent(getBaseContext(),MyService.class));

     }




}

