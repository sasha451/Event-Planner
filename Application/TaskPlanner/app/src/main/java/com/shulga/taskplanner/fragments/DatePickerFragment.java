package com.shulga.taskplanner.fragments;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.DatePicker;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

import com.shulga.taskplanner.interfaces.IDatePickerDialogListener;

import java.util.Calendar;

/**
 * Date picker dialog for the app
 */
public class DatePickerFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener{

    private static Context sContext;
    private static IDatePickerDialogListener sListener;

    /**
     * Returns the instance
     * @param context
     * @param titleResource
     * @return
     */
    public static DatePickerFragment newInstance(Context context, int titleResource){
        DatePickerFragment dialog  = new DatePickerFragment();
        sContext = context;

        Bundle args = new Bundle();
        args.putInt("title", titleResource);
        dialog.setArguments(args);
        return dialog;
    }
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the current date as the default date in the picker
        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        // Create a new instance of DatePickerDialog and return it
        return new DatePickerDialog(getActivity(), this, year, month, day);
    }

    @Override
    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
        // NO implementation required here
        sListener.setDate(year, monthOfYear, dayOfMonth);
    }

    /**
     * Method to set the listener to be called once date is set
     * @param listener
     */
    public void setDatePickerDialogListener(IDatePickerDialogListener listener){
        sListener = listener;
    }
}
