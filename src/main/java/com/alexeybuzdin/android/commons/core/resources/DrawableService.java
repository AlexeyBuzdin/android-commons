package com.alexeybuzdin.android.commons.core.resources;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.alexeybuzdin.android.commons.core.AndroidService;

public class DrawableService extends AndroidService {

    public Drawable loadDrawable(String photo) {
        Resources resources = getContext().getResources();
        int id = resources.getIdentifier(photo, "drawable", getContext().getPackageName());
        return resources.getDrawable(id);
    }

    public Drawable loadDrawable(int photo) {
        Resources resources = getContext().getResources();
        return resources.getDrawable(photo);
    }
}