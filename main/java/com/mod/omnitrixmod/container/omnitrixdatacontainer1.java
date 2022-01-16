package com.mod.omnitrixmod.container;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.network.PacketBuffer;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.wrapper.InvWrapper;

public class omnitrixdatacontainer1 extends Container {


    private final IItemHandler playerInventory;

    public omnitrixdatacontainer1(int id, final PlayerInventory playerInventory, PacketBuffer containerProvider){
        super(ContainerTypes.OMNITRIX_CONTAINER.get(),id);
        this.playerInventory = new InvWrapper(playerInventory);

    }
    public omnitrixdatacontainer1(int id, final PlayerInventory playerInventory, PlayerEntity playerEntity){
        super(ContainerTypes.OMNITRIX_CONTAINER.get(),id);
        this.playerInventory = new InvWrapper(playerInventory);

    }

    @Override
    public boolean stillValid(PlayerEntity p_75145_1_) {
        return true;
    }
}
