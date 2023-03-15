package com.protocal.response;

import com.protocal.DataPacket;
import lombok.Data;

import static com.protocal.command.Command.QUIT_GROUP_RESPONSE;

@Data
public class QuitGroupResponsePacket extends DataPacket {

    private String groupId;

    private boolean success;

    private String reason;

    @Override
    public Byte getCommand() {

        return QUIT_GROUP_RESPONSE;
    }
}
