package com.wladek.Gmart.repository;

import com.wladek.Gmart.domain.BuyingPointCost;
import com.wladek.Gmart.domain.enumeration.PointCostStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by wladek on 6/8/16.
 */
@Repository
public interface BuyingPointsRepo extends JpaRepository<BuyingPointCost , Long>{
    public BuyingPointCost findByStatus(PointCostStatus status);
}
