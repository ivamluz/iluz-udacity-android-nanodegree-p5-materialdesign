package com.example.xyzreader.ui.helper;

import android.content.Context;
import android.graphics.Typeface;

/**
 * Created by iluz on 3/7/16.
 */
public class TypefaceHelper {
    private Context mContext;
    private static TypefaceHelper sInstance;

    public enum Font {
        ROBOTO_BLACK("Roboto-Black"),
        ROBOTO_REGULAR("Roboto-Regular");

        private final String fontName;

        Font(String fontName) {
            this.fontName = fontName;
        }

        public String getFontName() {
            return fontName;
        }
    }

    private TypefaceHelper(Context context) {
        this.mContext = context;
    }

    public static TypefaceHelper getInstance(Context context) {
        if (sInstance == null) {
            sInstance = new TypefaceHelper(context);
        }

        return sInstance;
    }

    public Typeface getByFont(Font font) {
        return Typeface.createFromAsset(mContext.getResources().getAssets(), "fonts/" + font.getFontName() + ".ttf");
    }
}
