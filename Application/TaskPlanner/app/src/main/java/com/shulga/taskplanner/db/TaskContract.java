package com.shulga.taskplanner.db;

import android.provider.BaseColumns;

public class TaskContract {
    public TaskContract(){}

    public static abstract class TaskEntry implements BaseColumns {
        public static final String TABLE_NAME = "tasks";
        public static final String COLUMN_NAME_TASK_ID = "task_id";
        public static final String COLUMN_NAME_DETAIL = "detail";
        public static final String COLUMN_NAME_DUE_DATE = "due_date";
        public static final String COLUMN_NAME_TASK_NOTES = "task_notes";
    }
}
