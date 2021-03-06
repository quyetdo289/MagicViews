package com.ivankocijan.magicviews;

import android.content.Context;

/**
 * @author Koc
 *         ivan.kocijan@infinum.hr
 * @since 19.12.14.
 */
public class MagicViews {

    private static String defaultTypeFace;

    private MagicViews() {
    }

    public static void setFontFolderPath(Context ctx, String fontFolderPath) {
        MagicFont.getInstance(ctx).setFontFolderPath(fontFolderPath);
    }

    /**
     * @param typeFace a default typeface to use if no typeface is set
     */
    public static void setDefaultTypeFace(Context ctx, String typeFace) {
        if (MagicFont.getInstance(ctx).getTypeface(typeFace) != null) {
            defaultTypeFace = typeFace;
        } else {
            throw new RuntimeException(
                    String.format(ctx.getString(R.string.no_default_font), typeFace));
        }
    }

    public static String getDefaultTypeFace() {
        return defaultTypeFace;
    }
}
