package com.protocal.response;

import com.protocal.DataPacket;
import lombok.Data;

import static com.protocal.command.Command.MESSAGE_RESPONSE;
@Data
public class MessageResponsePacket extends DataPacket {

    private String message;

    private String fromUserId;

    private String fromUserName;

    @Override
    public Byte getCommand() {

        return MESSAGE_RESPONSE;
    }
}
