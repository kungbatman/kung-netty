package com.protocal.response;

import com.protocal.DataPacket;
import lombok.Data;

import java.util.List;

import static com.protocal.command.Command.CREATE_GROUP_RESPONSE;


@Data
public class CreateGroupResponsePacket extends DataPacket {
    private boolean success;

    private String groupId;

    private List<String> userNameList;

    @Override
    public Byte getCommand() {

        return CREATE_GROUP_RESPONSE;
    }
}
