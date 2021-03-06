package com.alexeybuzdin.android.commons.core.resources;

import android.content.Context;
import android.content.res.AssetManager;
import com.alexeybuzdin.android.commons.core.ClassLogger;

import javax.inject.Inject;
import java.io.IOException;
import java.io.InputStream;

public class AssetsService {

    ClassLogger logger = new ClassLogger(AssetsService.class);

    @Inject
    public Context context;

    public InputStream loadAssetStream(String filename) {
        try {
            AssetManager assets = context.getAssets();
            return assets.open(filename);
        } catch (IOException e) {
            logger.e("Failed to open file " + filename, e);
            return null;
        }
    }

}
