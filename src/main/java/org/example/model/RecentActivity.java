package org.example.model;

public class RecentActivity {
    private int id;
    private String activity;
    private String date;
    private String status;

    public RecentActivity(int id, String activity, String date, String status) {
        this.id = id;
        this.activity = activity;
        this.date = date;
        this.status = status;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getActivity() { return activity; }
    public void setActivity(String activity) { this.activity = activity; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
