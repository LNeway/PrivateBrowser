package org.mozilla.focus.utils;

import android.content.Context;

/**
 * Created by tomliu on 2018/1/14.
 */

public class ResUtils {

    public static int getImage(Context context, String imageName) {
        int drawableResourceId = context.getResources().getIdentifier(imageName, "drawable",
                context.getPackageName());
        return drawableResourceId;
    }

}
