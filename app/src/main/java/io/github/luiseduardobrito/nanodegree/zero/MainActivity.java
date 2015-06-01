/**
 * Copyright (C) 2015 - Luis Eduardo Brito
 */
package io.github.luiseduardobrito.nanodegree.zero;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import io.github.luiseduardobrito.nanodegree.zero.list.MenuListAdapter;

/**
 * The main activity of the application.
 * <p/>
 * Created by luiseduardobrito on 5/30/15.
 */
public class MainActivity extends AppCompatActivity {

    /**
     * The List.
     */
    ListView mList;

    /**
     * The Adapter.
     */
    MenuListAdapter mAdapter;

    Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Inflate activity state and layout
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set support toolbar instance
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);

        // Initialize enu list mAdapter
        mAdapter = new MenuListAdapter(this);

        // Initialize list view for menu
        mList = (ListView) findViewById(R.id.list);
        mList.setAdapter(mAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
