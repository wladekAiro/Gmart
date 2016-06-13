package com.wladek.Gmart.service;

import com.wladek.Gmart.domain.BuyingPointCost;
import com.wladek.Gmart.domain.SellingPointCost;
import com.wladek.Gmart.domain.enumeration.PointCostStatus;

/**
 * Created by wladek on 6/8/16.
 */
public interface PointsService {
    public BuyingPointCost setBuyingCost(BuyingPointCost buyingPointCost);
    public SellingPointCost setSellingCost(SellingPointCost sellingPointCost);
    public BuyingPointCost getActiveBuyingPointCost(PointCostStatus status);
    public SellingPointCost getActiveSellingPointCost(PointCostStatus status);
}
