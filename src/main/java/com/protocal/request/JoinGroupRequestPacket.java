package com.protocal.request;

import com.protocal.DataPacket;
import lombok.Data;

import static com.protocal.command.Command.JOIN_GROUP_REQUEST;

@Data
public class JoinGroupRequestPacket extends DataPacket {

    private String groupId;

    @Override
    public Byte getCommand() {

        return JOIN_GROUP_REQUEST;
    }
}
