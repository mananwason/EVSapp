package com.group1.evs.iiitd.evsapp;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.widget.TextView;

/**
 * Created by manan on 21-03-2015.
 */
public class SettingsActivity extends ActionBarActivity{

    @Override
    protected void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.fragment_main);

        TextView mtxtTitle = (TextView) findViewById(R.id.txtTitle);
        mtxtTitle.setText(getString(R.string.settings));
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        finish();
        return super.onOptionsItemSelected(item);
    }
}
