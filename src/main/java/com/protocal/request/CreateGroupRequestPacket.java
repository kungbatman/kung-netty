package com.protocal.request;

import com.protocal.DataPacket;
import lombok.Data;

import java.util.List;

import static com.protocal.command.Command.CREATE_GROUP_REQUEST;


@Data
public class CreateGroupRequestPacket extends DataPacket {

    private List<String> userIdList;

    @Override
    public Byte getCommand() {

        return CREATE_GROUP_REQUEST;
    }
}
