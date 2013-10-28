package com.alexeybuzdin.android.commons.core.resources;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

public class StringService {

    Context context;

    public StringService(Context context) {
        this.context = context;
    }

    public String loadString(String photo) {
        Resources resources = context.getResources();
        int id = resources.getIdentifier(photo, "string", context.getPackageName());
        return resources.getString(id);
    }

    public String loadString(int photo) {
        Resources resources = context.getResources();
        return resources.getString(photo);
    }

    public String[] loadStringArray(String name) {
        Resources resources = context.getResources();
        int id = resources.getIdentifier(name, "array", context.getPackageName());
        return resources.getStringArray(id);
    }

    public String[] loadStringArray(int id) {
        Resources resources = context.getResources();
        return resources.getStringArray(id);
    }

    public String loadStringArrayItem(int id, int index) {        
        return loadStringArray(id)[index];
    }
    
    public String loadStringArrayItem(String name, int index) {        
        return loadStringArray(name)[index];
    }
}
