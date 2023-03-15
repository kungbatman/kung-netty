package com.protocal.request;

import com.protocal.DataPacket;
import lombok.Data;

import static com.protocal.command.Command.QUIT_GROUP_REQUEST;


@Data
public class QuitGroupRequestPacket extends DataPacket {

    private String groupId;

    @Override
    public Byte getCommand() {

        return QUIT_GROUP_REQUEST;
    }
}
