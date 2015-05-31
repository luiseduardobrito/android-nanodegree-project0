package io.github.luiseduardobrito.nanodegree.zero.list;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import io.github.luiseduardobrito.nanodegree.zero.myapplication.R;

/**
 * The main menu list adapter.
 *
 * Created by luiseduardobrito on 5/30/15.
 */
public class MenuListAdapter extends BaseAdapter {

    Integer min = 0;

    String[] url;

    String[] labels;

    Context context;

    public MenuListAdapter(Context context) {

        this.context = context;

        this.labels = context
                .getResources()
                .getStringArray(R.array.menu_items);

        this.url = context
                .getResources()
                .getStringArray(R.array.menu_items_url);

    }

    @Override
    public int getCount() {
        return Math.min(labels.length, url.length);
    }

    @Override
    public Object getItem(int i) {
        return labels[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        MenuListItem menuListItem;

        if (view != null && view instanceof MenuListItem) {
            menuListItem = (MenuListItem) view;
        } else {
            menuListItem = new MenuListItem(context);
        }

        menuListItem.bind(labels[i], url[i]);
        return menuListItem;
    }
}
