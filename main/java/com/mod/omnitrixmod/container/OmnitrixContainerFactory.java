package com.mod.omnitrixmod.container;

import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.network.PacketBuffer;
import net.minecraftforge.fml.network.IContainerFactory;

public class OmnitrixContainerFactory implements IContainerFactory<Container> {

    @Override
    public Container create(int windowId, PlayerInventory inv, PacketBuffer data) {
        return new omnitrixdatacontainer1(windowId, inv, data);
    }
}
