package com.imooc.enums;

public enum  OrderStatusEnum implements CodeEnum{
    NEW(0,"新订单"),
    FINISHED(1,"完结"),
    CANCEL(2,"已取消"),
    ;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private Integer code;
    private String message;
    OrderStatusEnum(Integer code,String message){
        this.code=code;
        this.message=message;
    }
   /* public static OrderStatusEnum getOrderStatusEnum(Integer code){
        for(OrderStatusEnum orderStatusEnum:OrderStatusEnum.values()){
            if(orderStatusEnum.getCode().equals(code)){
                return orderStatusEnum;
            }
        }
        return null;
    }*/
}
