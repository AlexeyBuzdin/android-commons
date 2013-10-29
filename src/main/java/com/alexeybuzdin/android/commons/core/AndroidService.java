package com.alexeybuzdin.android.commons.core;

import android.content.Context;

import javax.inject.Inject;

public abstract class AndroidService {

    @Inject
    Context context;

    public Context getContext() {
        return context;
    }

    public AndroidService withContext(Context context) {
        this.context = context;
        return this;
    }
}
