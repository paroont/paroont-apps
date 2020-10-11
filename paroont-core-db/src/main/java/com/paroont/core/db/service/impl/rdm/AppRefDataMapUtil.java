package com.paroont.core.db.service.impl.rdm;

import com.paroont.core.shared.dto.rdm.AppRefDataDto;

import java.util.*;

public class AppRefDataMapUtil {
    private AppRefDataMapUtil() {
    }

    public static Map<String, String> buildKeyValueMap(List<AppRefDataDto> dtos) {
        Map<String, String> map = new LinkedHashMap<>();
        Optional.ofNullable(dtos).orElse(new ArrayList<>()).forEach(d -> map.put(d.getKey(), d.getValue()));
        return map;
    }
}
