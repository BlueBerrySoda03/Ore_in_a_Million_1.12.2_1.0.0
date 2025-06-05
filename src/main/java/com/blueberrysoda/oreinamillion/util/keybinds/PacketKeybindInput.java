package com.blueberrysoda.oreinamillion.util.keybinds;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class PacketKeybindInput implements IMessage {
    private boolean isFlying;
    private boolean isDescending;
    private boolean speedUp;
    private boolean speedDown;
    private boolean isHover;
    private boolean isEnabled;

    public PacketKeybindInput() {}

    public PacketKeybindInput(boolean isFlying, boolean isDescending, boolean speedUp, boolean speedDown, boolean isHover, boolean isEnabled) {
        this.isFlying = isFlying;
        this.isDescending = isDescending;
        this.speedUp = speedUp;
        this.speedDown = speedDown;
        this.isHover = isHover;
        this.isEnabled = isEnabled;
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        isFlying = buf.readBoolean();
        isDescending = buf.readBoolean();
        speedUp = buf.readBoolean();
        speedDown = buf.readBoolean();
        isHover = buf.readBoolean();
        isEnabled = buf.readBoolean();
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeBoolean(isFlying);
        buf.writeBoolean(isDescending);
        buf.writeBoolean(speedUp);
        buf.writeBoolean(speedDown);
        buf.writeBoolean(isHover);
        buf.writeBoolean(isEnabled);
    }

    public static class Handler implements IMessageHandler<PacketKeybindInput, IMessage> {
        @Override
        public IMessage onMessage(PacketKeybindInput msg, MessageContext ctx) {
            EntityPlayerMP serverPlayer = ctx.getServerHandler().player;

            SyncHandler.setKeyDown(serverPlayer, SyncHandler.CustomKey.Fly, msg.isFlying);
            SyncHandler.setKeyDown(serverPlayer, SyncHandler.CustomKey.Descend, msg.isDescending);
            SyncHandler.setKeyDown(serverPlayer, SyncHandler.CustomKey.SpeedUp, msg.speedUp);
            SyncHandler.setKeyDown(serverPlayer, SyncHandler.CustomKey.SpeedDown, msg.speedDown);
            SyncHandler.setKeyDown(serverPlayer, SyncHandler.CustomKey.Hover, msg.isHover);
            SyncHandler.setKeyDown(serverPlayer, SyncHandler.CustomKey.Enable, msg.isEnabled);

            return null;
        }
    }
}
