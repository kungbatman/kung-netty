package com.protocal.request;

import com.protocal.DataPacket;
import lombok.Data;

import static com.protocal.command.Command.LOGOUT_REQUEST;


@Data
public class LogoutRequestPacket extends DataPacket {
    @Override
    public Byte getCommand() {

        return LOGOUT_REQUEST;
    }
}
