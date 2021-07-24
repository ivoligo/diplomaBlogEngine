package app.model.enums;

import lombok.Getter;

@Getter
public enum GlobalSettingType {

    MULTIUSER_MODE {
        @Override
        public String toString() {
            return "Многопользовательский режим";
        }
    }, POST_PREMODERATION {
        @Override
        public String toString() {
            return "Премодерация постов";
        }
    }, STATISTICS_IS_PUBLIC {
        @Override
        public String toString() {
            return "Показывать всем статистику блога";
        }
    };

    private boolean value;

    public static GlobalSettingType toGlobalSettingType(String s){
        if (s.equals(GlobalSettingType.MULTIUSER_MODE.toString())) {
            return GlobalSettingType.MULTIUSER_MODE;
        }
        if (s.equals(GlobalSettingType.POST_PREMODERATION.toString())) {
            return GlobalSettingType.POST_PREMODERATION;
        }
        if (s.equals(GlobalSettingType.STATISTICS_IS_PUBLIC.toString())) {
            return GlobalSettingType.STATISTICS_IS_PUBLIC;
        }
        throw new IllegalArgumentException("Неверный тип настройки. " + s);
    }
}
