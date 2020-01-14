package life.echo.community.enums;

public enum NotificationStatusEnum {
    UNREAD(0),
    READ(1)
    ;

    NotificationStatusEnum(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }

    private Integer status;
}
