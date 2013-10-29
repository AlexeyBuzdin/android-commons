package com.alexeybuzdin.android.commons.core.resources;

import android.content.res.Resources;
import com.alexeybuzdin.android.commons.core.AndroidService;

public class StringService extends AndroidService {

    public String loadString(String name) {
        Resources resources = getContext().getResources();
        int id = resources.getIdentifier(name, "string", getContext().getPackageName());
        return resources.getString(id);
    }

    public String loadString(int id) {
        Resources resources = getContext().getResources();
        return resources.getString(id);
    }

    public String[] loadStringArray(String name) {
        Resources resources = getContext().getResources();
        int id = resources.getIdentifier(name, "array", getContext().getPackageName());
        return resources.getStringArray(id);
    }

    public String[] loadStringArray(int id) {
        Resources resources = getContext().getResources();
        return resources.getStringArray(id);
    }

    public String loadStringArrayItem(int id, int index) {
        return loadStringArray(id)[index];
    }

    public String loadStringArrayItem(String name, int index) {
        return loadStringArray(name)[index];
    }
}
