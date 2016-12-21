package com.kevin.cqsubway.utils;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;

import com.kevin.cqsubway.R;

/**
 * Created by Kevin Liu on 2016/12/20.
 * Function：
 */

public class PopupWindowUtils {

    public static PopupWindow getGuidePopup(Activity activity) {
        PopupWindow mPopupWindow;
        View popupView = activity.getLayoutInflater().inflate(R.layout.view_guide_popupwindow_guide, null);

        mPopupWindow = new PopupWindow(popupView, WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT, true);
        mPopupWindow.setTouchable(true);
        mPopupWindow.setOutsideTouchable(true);
        mPopupWindow.setBackgroundDrawable(new BitmapDrawable(activity.getResources(), (Bitmap) null));
        return mPopupWindow;
    }
}
