package life.echo.community.exception;

public enum CustomizeErrorCode implements ICustomizeErrorCode {
    QUESTION_NOT_FOUND(2001, "你找的问题不在了，要不换个试试"),
    TARGET_PARAM_NOT_FOUND(2002, "未选中任何评论"),
    NO_LOGIN(2003, "当前用户未登录，请登录后重试"),
    SYS_ERROR(2004, "服务器冒烟了"),
    TYPE_PARAM_WRONG(2005,"评论类型错误或者不存在"),
    COMMENT_NOT_FOUND(2006, "你找的评论不在了，要不换个试试"),
    CONTENT_IS_EMPTY(2007, "输入内容不能为空"),
    READ_NOTIFICATION_FAIL(2008, "不属于你的信息"),
    NOTIFICATION_NOT_FOUND(2009, "消息不翼而飞了"),
    FILE_UPLOAD_FAIL(2010, "图片上传失败"),
    ;


    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Integer getCode() {
        return code;
    }
    private Integer code;
    private String message;
    CustomizeErrorCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
