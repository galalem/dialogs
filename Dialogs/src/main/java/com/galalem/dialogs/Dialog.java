package com.galalem.dialogs;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;

public class Dialog extends android.app.AlertDialog.Builder {

    public Dialog(@NonNull Context context) {
        super(context, R.style.Theme_Galalem_Dialog);
    }

    public Dialog(@NonNull Context context, @StyleRes int themeResId) {
        super(context, themeResId);
    }

    public Dialog(@NonNull Context context, String title, String message, String button) {
        super(context, R.style.Theme_Galalem_Dialog);
        setTitle(title);
        setMessage(message);
        setNegativeButton(button, (dialog, i) -> dialog.dismiss());
    }
}
