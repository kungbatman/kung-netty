package com.codec;

import com.protocal.DataPacket;
import com.protocal.PacketCodeC;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

public class PacketEncoder extends MessageToByteEncoder<DataPacket> {

    @Override
    protected void encode(ChannelHandlerContext ctx, DataPacket packet, ByteBuf out) {
        PacketCodeC.INSTANCE.encode(out, packet);
    }
}
