package com.datavisionhub.controller;

import com.datavisionhub.model.Insight;
import com.datavisionhub.service.InsightService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/insights")
@CrossOrigin(origins = "*")
public class InsightController {

    private final InsightService service;

    public InsightController(InsightService service) {
        this.service = service;
    }

    @GetMapping
    public List<Insight> getInsights(@RequestParam(value = "metric", required = false) String metric) {
        return (metric != null) ? service.getInsightsByMetric(metric) : service.getAllInsights();
    }
}
