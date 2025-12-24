package org.example.model;

import java.util.List;

public class DashboardData {
    private List<DashboardStats> stats;
    private List<RecentActivity> activities;

    public DashboardData(List<DashboardStats> stats, List<RecentActivity> activities) {
        this.stats = stats;
        this.activities = activities;
    }

    // Getters and Setters
    public List<DashboardStats> getStats() { return stats; }
    public void setStats(List<DashboardStats> stats) { this.stats = stats; }

    public List<RecentActivity> getActivities() { return activities; }
    public void setActivities(List<RecentActivity> activities) { this.activities = activities; }
}
