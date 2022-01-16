package com.mod.omnitrixmod.items.omnitrices;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;

public class nemetrix extends Item {
    public static final ResourceLocation model = new ResourceLocation("assets/models/item/nemetrix");
    public static Item INSTANCE = new nemetrix(new Item.Properties().tab(ItemGroup.TAB_TOOLS).stacksTo(1).fireResistant()).setRegistryName("nemetrix");

    public nemetrix(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }
}
