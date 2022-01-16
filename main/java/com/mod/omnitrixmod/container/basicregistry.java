package com.mod.omnitrixmod.container;

import com.mod.omnitrixmod.items.materials.galvanicpolymer;
import com.mod.omnitrixmod.items.materials.superconductivepaste;
import com.mod.omnitrixmod.items.materials.superconductivepowder;
import com.mod.omnitrixmod.items.materials.superconductiverod;
import com.mod.omnitrixmod.items.omnitrices.*;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class basicregistry {

    @SubscribeEvent
    public static void onItemRegistry(final RegistryEvent.Register<Item> itemRegisteryEvent){
        itemRegisteryEvent.getRegistry().register(omnitrixprototype.INSTANCE);
        itemRegisteryEvent.getRegistry().register(galvanicpolymer.Instance);
        itemRegisteryEvent.getRegistry().register(omnitrix.INSTANCE);
        itemRegisteryEvent.getRegistry().register(nemetrix.INSTANCE);
        itemRegisteryEvent.getRegistry().register(ultimatrixprototype.INSTANCE);
        itemRegisteryEvent.getRegistry().register(ultimatrix.INSTANCE);
        itemRegisteryEvent.getRegistry().register(biomnitrix.INSTANCE);
        itemRegisteryEvent.getRegistry().register(superconductiverod.INSTANCE);
        itemRegisteryEvent.getRegistry().register(superconductivepowder.INSTANCE);
        itemRegisteryEvent.getRegistry().register(superconductivepaste.INSTANCE);
    }

    @SubscribeEvent
    public static void onBlockRegistry(final RegistryEvent.Register<Block> blockRegisteryEvent){
    }

    @SubscribeEvent
    public static void onEntityRegistry(final RegistryEvent.Register<EntityType<?>> event) {
    }
}
