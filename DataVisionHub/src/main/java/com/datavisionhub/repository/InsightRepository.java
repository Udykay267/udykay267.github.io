package com.datavisionhub.repository;

import com.datavisionhub.model.Insight;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface InsightRepository extends JpaRepository<Insight, Long> {
    List<Insight> findByMetricContainingIgnoreCase(String metric);
}
