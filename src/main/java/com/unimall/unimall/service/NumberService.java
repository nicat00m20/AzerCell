package com.unimall.unimall.service;

import java.util.List;
import com.unimall.unimall.entity.Number;

import com.unimall.unimall.model.NumberInputModel;

public interface NumberService {
    
        List<Number> getAll();
        int add(NumberInputModel numberInputModel);
        int topUp(long id, Integer topUpAmount);
        int purchase(long id, Integer purchaseAmount);
}
