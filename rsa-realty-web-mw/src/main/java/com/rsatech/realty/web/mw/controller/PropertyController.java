package com.rsatech.realty.web.mw.controller;

import com.rsatech.realty.core.shared.facade.property.RentPropertyFacade;
import com.rsatech.realty.core.shared.facade.property.SellPropertyFacade;
import com.rsatech.realty.core.shared.dto.property.common.PropertyActionDto;
import com.rsatech.realty.core.shared.dto.property.rent.RentPropertyDto;
import com.rsatech.realty.core.shared.dto.property.sell.SellPropertyDto;
import com.rsatech.realty.web.mw.constant.common.WebMwConst;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
public class PropertyController implements WebMwConst {
    private static final Logger logger = LoggerFactory.getLogger(PropertyController.class);

    @Autowired
    private RentPropertyFacade rentPropertyFacade;

    @Autowired
    private SellPropertyFacade sellPropertyFacade;


    @GetMapping(URL_REALTY_PROPERTY_RENT)
    public Map<String, Object> findAllRentProperties() {
        return rentPropertyFacade.findAllRentProperties().getResMap();
    }

    @PostMapping(URL_REALTY_PROPERTY_RENT)
    public Map<String, Object> addRentProperty(@RequestBody RentPropertyDto dto) {
        dto.setPropertyId(0);
        return rentPropertyFacade.saveRentProperty(dto, createPropertyActionDto()).getResMap();
    }

    @PutMapping(URL_REALTY_PROPERTY_RENT_ID)
    public Map<String, Object> updateRentProperty(@RequestBody RentPropertyDto dto, @PathVariable("propertyId") long propertyId) {
        dto.setPropertyId(propertyId);
        return rentPropertyFacade.saveRentProperty(dto, createPropertyActionDto()).getResMap();
    }


    @GetMapping(URL_REALTY_PROPERTY_SELL)
    public Map<String, Object> findAllSellProperties() {
        return sellPropertyFacade.findAllSellProperties().getResMap();
    }

    @PostMapping(URL_REALTY_PROPERTY_SELL)
    public Map<String, Object> addSellProperty(@RequestBody SellPropertyDto dto) {
        dto.setPropertyId(0);
        return sellPropertyFacade.saveSellProperty(dto, createPropertyActionDto()).getResMap();
    }

    @PutMapping(URL_REALTY_PROPERTY_SELL_ID)
    public Map<String, Object> updateSellProperty(@RequestBody SellPropertyDto dto, @PathVariable("propertyId") long propertyId) {
        dto.setPropertyId(propertyId);
        return sellPropertyFacade.saveSellProperty(dto, createPropertyActionDto()).getResMap();
    }

    private PropertyActionDto createPropertyActionDto() {
        PropertyActionDto actionDto = new PropertyActionDto();
        actionDto.setLoginId("rahulk");
        return actionDto;
    }

}
