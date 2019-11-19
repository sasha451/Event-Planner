package com.shulga.taskplanner.model;

import java.util.UUID;

public class Task {

    private UUID taskId;
    private String taskName;
    private String date;
    private String sqlDate;
    private String taskNotes;

    /**
     * Constructor to initialize the default values
     */
    public Task() {
        taskId = UUID.randomUUID();
        date = "";
        sqlDate = "";
        taskNotes = "";
    }

    /**
     * Returns taskId
     * @return
     */
    public UUID getTaskId(){
        return taskId;
    }

    /**
     * Sets taskName Id
     * @param strUUID
     */
    public void setTaskId(String strUUID){
        taskId = UUID.fromString(strUUID);
    }

    /**
     * Returns taskName name
     * @return
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * Sets task name
     * @param taskName
     */
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    /**
     * Returns display date as required
     * @return
     */
    public String getDisplayDate() {
        if(date.equalsIgnoreCase("")){
            return "No due date";
        }
        return "Due date: " + date;
    }

    /**
     * Returns just the date
     * @return
     */
    public String getDate(){
        return date;
    }

    /**
     * Sets the display date
     * @param displayDate
     */
    public void setDate(String displayDate) {
        this.date = displayDate;
    }

    /**
     * Returns SQL date
     * @return
     */
    public String getSqlDate() {
        return sqlDate;
    }

    /**
     * Sets SQL date
     * @param sqlDate
     */
    public void setSqlDate(String sqlDate) {
        this.sqlDate = sqlDate;
    }

    /**
     * Returns task notes
     * @return
     */
    public String getTaskNotes() {
        return taskNotes;
    }

    /**
     * Sets task notes
     * @param taskNotes
     */
    public void setTaskNotes(String taskNotes) {
        this.taskNotes = taskNotes;
    }
}

