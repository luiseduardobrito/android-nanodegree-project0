package io.github.luiseduardobrito.nanodegree.zero;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import io.github.luiseduardobrito.nanodegree.zero.list.MenuListAdapter;
import io.github.luiseduardobrito.nanodegree.zero.myapplication.R;

/**
 * The main activity of the application.
 *
 * Created by luiseduardobrito on 5/30/15.
 */
public class MainActivity extends ActionBarActivity {

    /**
     * The List.
     */
    ListView mList;

    /**
     * The Adapter.
     */
    MenuListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new MenuListAdapter(this);

        mList = (ListView) findViewById(R.id.list);
        mList.setAdapter(adapter);
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
