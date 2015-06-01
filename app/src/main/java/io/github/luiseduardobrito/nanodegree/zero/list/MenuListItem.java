/**
 * Copyright (C) 2015 - Luis Eduardo Brito
 */
package io.github.luiseduardobrito.nanodegree.zero.list;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import io.github.luiseduardobrito.nanodegree.zero.R;

/**
 * The button item in the main menu.
 *
 * Created by luiseduardobrito on 5/31/15.
 */
public class MenuListItem extends Button {

    /**
     * Instantiates a new Menu list item.
     *
     * @param context the context
     */
    public MenuListItem(Context context) {
        super(context);
    }

    /**
     * Instantiates a new Menu list item.
     *
     * @param context the context
     * @param attrs the attrs
     */
    public MenuListItem(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /**
     * Instantiates a new Menu list item.
     *
     * @param context the context
     * @param attrs the attrs
     * @param defStyleAttr the def style attr
     */
    public MenuListItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    /**
     * Instantiates a new Menu list item.
     *
     * @param context the context
     * @param attrs the attrs
     * @param defStyleAttr the def style attr
     * @param defStyleRes the def style res
     */
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public MenuListItem(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    /**
     * Bind the button to a label and an url.
     *
     * @param label the label
     * @param url the url
     */
    public void bind(final String label, final String url) {

        this.setText(label);

        this.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {

                if (url != null && !url.isEmpty()) {

                    Intent intent = new Intent(url);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    getContext().startActivity(intent);

                } else {

                    Toast.makeText(getContext(), R.string.soon, Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}
