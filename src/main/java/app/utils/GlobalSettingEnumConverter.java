package app.utils;

import app.model.enums.GlobalSettingType;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class GlobalSettingEnumConverter implements AttributeConverter<GlobalSettingType, String> {
    @Override
    public String convertToDatabaseColumn(GlobalSettingType globalSettingType) {
        return globalSettingType.toString();
    }

    @Override
    public GlobalSettingType convertToEntityAttribute(String s) {
        return GlobalSettingType.toGlobalSettingType(s);
    }
}
