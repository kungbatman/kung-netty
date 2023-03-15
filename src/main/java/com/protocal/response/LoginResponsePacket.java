package com.protocal.response;

import com.protocal.DataPacket;
import lombok.Data;

import static com.protocal.command.Command.LOGIN_RESPONSE;

@Data
public class LoginResponsePacket extends DataPacket {
    private String userId;

    private String userName;

    private boolean success;

    private String reason;


    @Override
    public Byte getCommand() {
        return LOGIN_RESPONSE;
    }
}
