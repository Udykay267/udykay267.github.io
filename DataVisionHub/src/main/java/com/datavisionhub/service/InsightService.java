package com.datavisionhub.service;

import com.datavisionhub.model.Insight;
import com.datavisionhub.repository.InsightRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InsightService {
    private final InsightRepository repository;

    public InsightService(InsightRepository repository) {
        this.repository = repository;
    }

    public List<Insight> getAllInsights() {
        return repository.findAll();
    }

    public List<Insight> getInsightsByMetric(String metric) {
        return repository.findByMetricContainingIgnoreCase(metric);
    }
}
