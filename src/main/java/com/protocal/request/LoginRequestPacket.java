package com.protocal.request;

import com.protocal.DataPacket;
import lombok.Data;

import static com.protocal.command.Command.LOGIN_REQUEST;

@Data
public class LoginRequestPacket extends DataPacket {

    private String userName;

    private String password;

    @Override
    public Byte getCommand() {
        return LOGIN_REQUEST;
    }
}
