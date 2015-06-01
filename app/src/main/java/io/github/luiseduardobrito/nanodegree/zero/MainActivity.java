/**
 * Copyright (C) 2015 - Luis Eduardo Brito
 */
package io.github.luiseduardobrito.nanodegree.zero;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.HapticFeedbackConstants;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

import com.gc.materialdesign.views.ButtonFloat;

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

    /**
     * The Toolbar.
     */
    Toolbar mToolbar;

    /**
     * The floating button.
     */
    ButtonFloat mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Inflate activity state and layout
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize toolbar instance
        initSupportToolbar(R.id.toolbar);

        // Initialize enu list mAdapter
        mAdapter = new MenuListAdapter(this);

        // Initialize list view for menu
        mList = (ListView) findViewById(R.id.list);
        mList.setAdapter(mAdapter);

        // Prepare floating action button
        mButton = (ButtonFloat) findViewById((R.id.button_float));
        mButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
                openUrl();
            }
        });
    }

    /**
     * Initialize the support action toolbar
     *
     * @param id The support toolbar id
     */
    public void initSupportToolbar(int id) {

        // Set support toolbar instance
        mToolbar = (Toolbar) findViewById(id);
        setSupportActionBar(mToolbar);
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
        if (id == R.id.action_about) {
            openUrl();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void openUrl() {
        String url = getString(R.string.action_github_url);
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
    }
}
