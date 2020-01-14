package life.echo.community.enums;

public enum NotificationTypeEnum {
    REPLY_QUESTION(1,"回复了问题"),
    REPLY_COMMENT(2,"回复了评论")
    ;

    NotificationTypeEnum(Integer type, String name) {
        this.type = type;
        this.name = name;
    }

    public static String nameOf(int type) {
        for (NotificationTypeEnum notificationTypeEnum : NotificationTypeEnum.values()) {
            if (notificationTypeEnum.getType() == type) {
                return notificationTypeEnum.getName();
            }
        }
        return "";
    }

    public Integer getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    private Integer type;
    private String name;

}
