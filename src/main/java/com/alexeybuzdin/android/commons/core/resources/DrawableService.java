package com.alexeybuzdin.android.commons.core.resources;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

public class DrawableService {

    Context context;

    public DrawableService(Context context) {
        this.context = context;
    }

    public Drawable loadDrawable(String photo) {
        Resources resources = context.getResources();
        int id = resources.getIdentifier(photo, "drawable", context.getPackageName());
        return resources.getDrawable(id);
    }

    public Drawable loadDrawable(int photo) {
        Resources resources = context.getResources();
        return resources.getDrawable(photo);
    }
}