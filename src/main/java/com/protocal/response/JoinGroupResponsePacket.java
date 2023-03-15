package com.protocal.response;

import com.protocal.DataPacket;
import lombok.Data;

import static com.protocal.command.Command.JOIN_GROUP_RESPONSE;

@Data
public class JoinGroupResponsePacket extends DataPacket {
    private String groupId;

    private boolean success;

    private String reason;

    @Override
    public Byte getCommand() {

        return JOIN_GROUP_RESPONSE;
    }
}
