package com.wladek.Gmart.repository;

import com.wladek.Gmart.domain.SellingPointCost;
import com.wladek.Gmart.domain.enumeration.PointCostStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by wladek on 6/8/16.
 */
@Repository
public interface SellingPointsRepo extends JpaRepository<SellingPointCost , Long> {
    public SellingPointCost findByStatus(PointCostStatus status);
}
