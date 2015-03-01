package com.androidpractice.fonticons;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;

/**
 * Created by MSaudi on 3/1/2015.
 */

public class FontUtils {


    private static final String ICONMOOON_FONT_PATH = "fonts/icomoon.ttf";


    public static void applyIconmoonFont(Context context, TextView view) {

        Typeface typeface = Typeface.createFromAsset(context.getAssets(), ICONMOOON_FONT_PATH);
        view.setTypeface(typeface);

    }
}
