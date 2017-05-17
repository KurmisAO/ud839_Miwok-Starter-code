package com.example.android.miwok;

import android.content.DialogInterface;
import android.view.View;
import android.widget.Toast;


/**
 * Created by doz on 2017-05-01.
 */

public class NumbersClickListener implements View.OnClickListener {
    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(), "Open the list of numbers", Toast.LENGTH_SHORT).show();
    }
}
