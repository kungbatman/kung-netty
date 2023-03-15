package com.protocal.response;


import com.protocal.DataPacket;

import static com.protocal.command.Command.HEARTBEAT_RESPONSE;

public class HeartBeatResponsePacket extends DataPacket {
    @Override
    public Byte getCommand() {
        return HEARTBEAT_RESPONSE;
    }
}
