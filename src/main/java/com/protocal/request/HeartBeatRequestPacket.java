package com.protocal.request;

import com.protocal.DataPacket;

import static com.protocal.command.Command.HEARTBEAT_REQUEST;

public class HeartBeatRequestPacket extends DataPacket {
    @Override
    public Byte getCommand() {
        return HEARTBEAT_REQUEST;
    }
}
