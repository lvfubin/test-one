package com.example.demo.dto;

/**
 * 返回工厂类
 */
public class ResultDtoFactory {
    
    public ResultDtoFactory() {
    }

    public static ResultDto toSuccess(String reason) {
        return toSuccess(reason, null);
    }

    public static ResultDto toSuccess(){
        return toSuccess("success", null);
    }

    public static ResultDto toSuccess(Object data) {
        return toSuccess(null, data);
    }

    public static ResultDto toSuccess(String reason, Object result) {
        ResultDto dto = new ResultDto();
        dto.setResultCode("0");
        dto.setReason(reason);
        dto.setResult(result);
        return dto;
    }

    public static ResultDto toError(String resultCode,String reason){
        ResultDto dto = new ResultDto();
        dto.setResultCode(resultCode);
        dto.setReason(reason);
        return dto;
    }

    public static ResultDto toError(String reason) {
        ResultDto dto = new ResultDto();
        dto.setReason(reason);
        dto.setResultCode("-1");
        return dto;
    }
    
    public static ResultDto toUnknownError(){
    	ResultDto dto = new ResultDto();
        dto.setResultCode("-1");
        dto.setReason("UnknownError");
        dto.setResult(null);
        return dto;
    }
    
    public static ResultDto toError(ResultCode rc) {
        ResultDto dto = new ResultDto();
        dto.setResultCode(rc.getCode());
        dto.setReason(rc.getMessage());
        dto.setResult(null);
        return dto;
    }
}
