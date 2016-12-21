package com.kevin.cqsubway.utils;

import android.text.TextUtils;
import android.util.Log;

import com.kevin.cqsubway.BuildConfig;

/**
 * Created by Kevin Liu on 2016/12/20.
 * Function：
 */

public class LogUtils {
    private static boolean debug = BuildConfig.DEBUG;//是否开启debug,默认根据运行方式选择
    private static String separator = ",";//分隔符
    private static boolean showInfo = true;//是否显示log附加信息,包括线程名+方法名+行数

    public static void setDebug(boolean iSDebug) {
        LogUtils.debug = iSDebug;
    }


    public static void setSeparator(String separator) {
        LogUtils.separator = separator;
    }

    public static void setShowInfo(boolean showInfo) {
        LogUtils.showInfo = showInfo;
    }

    public static void v(String message) {
        if (debug) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            String tag = getDefaultTag(stackTraceElement);
            Log.v(tag, message + getLogInfo(stackTraceElement));
        }
    }

    public static void v(String tag, String message) {
        if (debug) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            if (TextUtils.isEmpty(tag)) {
                tag = getDefaultTag(stackTraceElement);
            }
            Log.v(tag, message + getLogInfo(stackTraceElement));
        }
    }

    public static void d(String message) {
        if (debug) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            String tag = getDefaultTag(stackTraceElement);
            Log.d(tag, message + getLogInfo(stackTraceElement));
        }
    }

    public static void d(String tag, String message) {
        if (debug) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            if (TextUtils.isEmpty(tag)) {
                tag = getDefaultTag(stackTraceElement);
            }
            Log.d(tag, message + getLogInfo(stackTraceElement));
        }
    }

    public static void i(String message) {
        if (debug) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            String tag = getDefaultTag(stackTraceElement);
            Log.i(tag, message + getLogInfo(stackTraceElement));
        }
    }

    public static void i(String tag, String message) {
        if (debug) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            if (TextUtils.isEmpty(tag)) {
                tag = getDefaultTag(stackTraceElement);
            }
            Log.i(tag, message + getLogInfo(stackTraceElement));
        }
    }

    public static void w(String message) {
        if (debug) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            String tag = getDefaultTag(stackTraceElement);
            Log.w(tag, message + getLogInfo(stackTraceElement));
        }
    }

    public static void w(String tag, String message) {
        if (debug) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            if (TextUtils.isEmpty(tag)) {
                tag = getDefaultTag(stackTraceElement);
            }
            Log.w(tag, message + getLogInfo(stackTraceElement));
        }
    }

    public static void e(String tag, String message) {
        if (debug) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            if (TextUtils.isEmpty(tag)) {
                tag = getDefaultTag(stackTraceElement);
            }
            Log.e(tag, message + getLogInfo(stackTraceElement));
        }
    }

    /**
     * 获取默认的TAG名称.
     * 比如在MainActivity.java中调用了日志输出.
     * 则TAG为MainActivity
     */
    public static String getDefaultTag(StackTraceElement stackTraceElement) {
        String fileName = stackTraceElement.getFileName();
        String stringArray[] = fileName.split("\\.");
        String tag = stringArray[0];
        return tag;
    }

    /**
     * 输出日志所包含的信息
     */
    public static String getLogInfo(StackTraceElement stackTraceElement) {
        if (!showInfo) return "";
        StringBuilder logInfoStringBuilder = new StringBuilder();
        // 获取线程名
        String threadName = Thread.currentThread().getName();
        // 获取线程ID
        long threadID = Thread.currentThread().getId();
        // 获取文件名.即xxx.java
        String fileName = stackTraceElement.getFileName();
        // 获取类名.即包名+类名
        String className = stackTraceElement.getClassName();
        // 获取方法名称
        String methodName = stackTraceElement.getMethodName();
        // 获取生日输出行数
        int lineNumber = stackTraceElement.getLineNumber();

        logInfoStringBuilder.append("  ==>[ ");
//        logInfoStringBuilder.append("threadID=" + threadID).append(separator);
        logInfoStringBuilder.append("threadName=" + threadName).append(separator);
//        logInfoStringBuilder.append("fileName=" + fileName).append(separator);
//        logInfoStringBuilder.append("className=" + className).append(separator);
        logInfoStringBuilder.append("methodName=" + methodName).append(separator);
        logInfoStringBuilder.append("lineNumber=" + lineNumber);
        logInfoStringBuilder.append(" ] ");
        return logInfoStringBuilder.toString();
    }
}

