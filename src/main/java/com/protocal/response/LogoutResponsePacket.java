package com.protocal.response;

import com.protocal.DataPacket;
import lombok.Data;

import static com.protocal.command.Command.LOGOUT_RESPONSE;


@Data
public class LogoutResponsePacket extends DataPacket {

    private boolean success;

    private String reason;


    @Override
    public Byte getCommand() {

        return LOGOUT_RESPONSE;
    }
}
