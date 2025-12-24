package org.example.controller;

import org.example.model.DashboardData;
import org.example.model.DashboardStats;
import org.example.model.RecentActivity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/dashboard")
@CrossOrigin(origins = "*")
public class DashboardController {

    @GetMapping
    public DashboardData getDashboardData() {
        // Hardcoded Stats
        List<DashboardStats> stats = new ArrayList<>();
        stats.add(new DashboardStats("Total Sales", "$160,000", "Up 10% from last month", "Total Sales", "bg-primary"));
        stats.add(new DashboardStats("Total Purchase", "$80,000", "Down 5% from last month", "Total Purchase", "bg-success"));
        stats.add(new DashboardStats("Pending Invoices", "12", "Urgent attention needed", "Pending Invoices", "bg-warning"));
        stats.add(new DashboardStats("Low Stock Items", "5", "Reorder immediately", "Low Stock Items", "bg-danger"));

        // Hardcoded Recent Activities
        List<RecentActivity> activities = new ArrayList<>();
        activities.add(new RecentActivity(1, "New Sale Order #1001", "2024-12-24", "Completed"));
        activities.add(new RecentActivity(2, "Purchase Order #5002", "2024-12-23", "Pending"));
        activities.add(new RecentActivity(3, "Invoice Generated #INV-202", "2024-12-22", "Sent"));

        return new DashboardData(stats, activities);
    }
}
