package app.model;

import app.model.enums.GlobalSettingType;
import app.utils.GlobalSettingEnumConverter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "global_settings")
public class GlobalSetting {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @Enumerated(EnumType.STRING)
    private GlobalSettingType code;

    @NotNull
    @Convert(converter = GlobalSettingEnumConverter.class)
    private GlobalSettingType name;

    @NotNull
    @Enumerated(EnumType.STRING)
    private GlobalSettingType value;
}
