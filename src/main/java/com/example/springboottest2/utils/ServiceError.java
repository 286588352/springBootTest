package com.example.springboottest2.utils;

/**
 * Created by gld on 2020/6/21.
 */
public enum ServiceError {

    //================服务端错误====================

    /**
     * 服务器内部错误
     */
    SERVER_ERROR("00000", "系统内部错误"),
    SERVER_BUSY_ERROR("00001", "服务器忙，超出流控"),
    IO_ERROR("00002", "文件IO异常"),
    SOCKET_ERROR("00003", "网络异常"),


    //================客户端错误====================
    /**
     * 客户端错误（1xxx）
     */
    INVALID_PARAM("1000", "参数不正确"),

    ERROR_NO_OPERATION_POWER("1001", "没有此操作权限"),

    OPERATION_NOT_SUPPORTED("1002", "不支持此操作"),

    DATE_FORMAT_ERROR("1004", "日期格式不正确"),

    //================业务异常====================
    /**
     * 业务异常（2xxx）
     */
    REFRESH_TOKEN_ERROR("2000", "refresh TOKEN失效"),
    TOKEN_ERROR("2001", "TOKEN校验失败"),

    FILE_UPLOAD_ERROR("2002", "上传文件失败"),
    FILE_DOWNLOAD_ERROR("2003", "下载文件失败"),
    FILE_DELETE_ERROR("2004", "删除文件失败"),
    FILE_CAN_NOT_EMPTY("2005", "需要上传的文件不可为空"),
    FILE_NOT_SUPPORT_TYPE("2006", "文件格式不支持"),
    DEPART_EXISTS("2007", "部门已存在"),
    ROLE_EXISTS("2008", "角色已存在"),
    USER_EXISTS("2009", "用户已存在"),
    USER_NOT_EXISTS("2010", "用户不存在"),
    HOSPITAL_SITE_EXISTS("2011", "医院站点已存在"),
    HOSPITAL_SITE_NOT_EXISTS("2012", "医院站点不存在"),
    HOSPITAL_SITE_IMG_NOT_EXISTS("2020", "医院资质证明不存在"),
    POLICE_SITE_EXISTS("2013", "该区域下的公安站点已存在"),
    POLICE_SITE_NOT_EXISTS("2014", "公安站点不存在"),
    PET_NOT_EXISTS("2015", "犬类信息不存在"),
    VALID_CODE_ERROR("2016", "验证码不正确"),
    ACCOUNT_OR_PASSWORD_ERROR("2017", "用户名或密码错误"),
    FEED_BACK_NOT_EXISTS("2018", "反馈信息不存在"),
    PERMISSION_NOT_EXISTS("2019", "权限信息不存在"),
    PETMARK_NOT_CHOOSE("2021", "请选择犬类牌子"),
    POLICE_SITE_NOT_SHARED("2022", "没有可分配的公安站点"),
    ERROR_OPERATION("2023", "对不起,您的操作有误"),
    NOT_HOSPITAL_ACCOUNT("2024", "当前账户不是医院角色"),
    NOT_ROLE_TO_USER("2025", "当前账户未分配角色或当前角色未分配权限"),
    SAME_PARENT_DEPNAME("2026", "选择上级部门的时候不能选择自身"),
    SERVER_BUSSINESS("2027", "当前请求人数过多，请稍后重试"),
    PET_ID_NOT_NULL("2028", "petId不能为空"),
    DEPT_NAME_NOT_NULL("2029", "petId不能为空");


    private String code;
    private String message;

    ServiceError(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return getCode() + '-' + getMessage();
    }
}
