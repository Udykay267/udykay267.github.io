package com.datavisionhub.model;

import jakarta.persistence.*;

@Entity
public class Insight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String metric;
    private double value;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getMetric() { return metric; }
    public void setMetric(String metric) { this.metric = metric; }

    public double getValue() { return value; }
    public void setValue(double value) { this.value = value; }
}
