package org.example.model;

public class DashboardStats {
    private String title;
    private String value;
    private String change;
    private String description;
    private String colorClass; // e.g., "bg-primary", "bg-success"

    public DashboardStats(String title, String value, String change, String description, String colorClass) {
        this.title = title;
        this.value = value;
        this.change = change;
        this.description = description;
        this.colorClass = colorClass;
    }

    // Getters and Setters
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getValue() { return value; }
    public void setValue(String value) { this.value = value; }

    public String getChange() { return change; }
    public void setChange(String change) { this.change = change; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getColorClass() { return colorClass; }
    public void setColorClass(String colorClass) { this.colorClass = colorClass; }
}
