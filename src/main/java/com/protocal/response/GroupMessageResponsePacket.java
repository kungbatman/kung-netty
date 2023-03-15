package com.protocal.response;

import com.protocal.DataPacket;
import com.session.Session;
import lombok.Data;

import static com.protocal.command.Command.GROUP_MESSAGE_RESPONSE;


@Data
public class GroupMessageResponsePacket extends DataPacket {

    private String fromGroupId;

    private Session fromUser;

    private String message;

    @Override
    public Byte getCommand() {

        return GROUP_MESSAGE_RESPONSE;
    }
}
