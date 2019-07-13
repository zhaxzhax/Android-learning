package com.foy.foy;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Window;
import android.view.WindowManager;

class Utils {
    public static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }
    public static int px2dip(Context context, float pxValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }

    /**
     * 将px值转换为sp值，保证文字大小不变
     */
    public static int px2sp(Context context, float pxValue) {
        final float fontScale = context.getResources().getDisplayMetrics().scaledDensity;
        return (int) (pxValue / fontScale + 0.5f);
    }

    /**
     * 将sp值转换为px值，保证文字大小不变
     */
    public static int sp2px(Context context, float spValue) {
        final float fontScale = context.getResources().getDisplayMetrics().scaledDensity;
        return (int) (spValue * fontScale + 0.5f);
    }
    //获取屏幕的宽度
    public static int getScreenWidth(Context ctx){
        //从系统服务中获取窗口管理器
        WindowManager wm =(WindowManager) ctx.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics dm = new DisplayMetrics();
        //从默认显示器中获取显示参数保存到dm对象中
        wm.getDefaultDisplay().getMetrics(dm);
        return  dm.widthPixels;
    }
    //获取屏幕的高度
    public static int getScreenHeight(Context ctx){
        //从系统服务中获取窗口管理器
        WindowManager wm =(WindowManager) ctx.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics dm = new DisplayMetrics();
        //从默认显示器中获取显示参数保存到dm对象中
        wm.getDefaultDisplay().getMetrics(dm);
        return  dm.heightPixels;
    }
    //获取屏幕的高度
    public static float getScreenDensity(Context ctx){
        //从系统服务中获取窗口管理器
        WindowManager wm =(WindowManager) ctx.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics dm = new DisplayMetrics();
        //从默认显示器中获取显示参数保存到dm对象中
        wm.getDefaultDisplay().getMetrics(dm);
        return  dm.density;
    }
}
