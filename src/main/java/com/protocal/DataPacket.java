package com.protocal;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public abstract class DataPacket {
    /**
     * 协议版本
     */
    @JSONField(deserialize = false, serialize = false)
    private Byte version = 1;

    /**
     * 指令
     */
    @JSONField(serialize = false)
    public abstract Byte getCommand();
}
