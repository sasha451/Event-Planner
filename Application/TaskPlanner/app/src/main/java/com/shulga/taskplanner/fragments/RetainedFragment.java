package com.shulga.taskplanner.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import com.shulga.taskplanner.model.Task;

import java.util.ArrayList;

public class RetainedFragment extends Fragment {

    private ArrayList<Task> data;

    // this method is only called once for this fragment
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // retain this fragment
        setRetainInstance(true);
    }

    public void setData(ArrayList<Task> data) {
        this.data = data;
    }

    public ArrayList<Task> getData() {
        return data;
    }
}
