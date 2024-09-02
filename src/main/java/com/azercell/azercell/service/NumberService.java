package com.azercell.azercell.service;

import java.util.List;
import com.azercell.azercell.entity.Number;

import com.azercell.azercell.model.NumberInputModel;

public interface NumberService {
    
        List<Number> getAll();
        int add(NumberInputModel numberInputModel);
        int topUp(long id, Integer topUpAmount);
        int purchase(long id, Integer purchaseAmount);
}
