package com.platzi.play.persistence.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public class StateMapper {
    @Named("stringToBoolean")
    public Boolean stringToBoolean(String state) {
        if (state == null) return null;
        return switch (state.toUpperCase()){
            case "D" -> true;
            case "N" -> false;
            default -> null;
        };
    }
    @Named("booleanToString")
    public String booleanToString(Boolean state) {
        if (state == null) return null;
        return state ? "D" : "N";
    }
}
