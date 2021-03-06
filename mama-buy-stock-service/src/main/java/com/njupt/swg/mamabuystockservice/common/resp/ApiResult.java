package com.njupt.swg.mamabuystockservice.common.resp;

import com.njupt.swg.mamabuystockservice.common.constants.Constants;
import lombok.Data;

/**
 * Created by JackWangon[www.coder520.com] 2018/1/9.
 */
@Data
public class ApiResult<T> {

    private int code = Constants.RESP_STATUS_OK;

    private String message;

    private T data;

    public ApiResult() {
    }

    public ApiResult(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
