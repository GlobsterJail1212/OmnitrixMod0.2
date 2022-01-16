package com.mod.omnitrixmod.items.materials;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;

public class superconductivepowder extends Item {
    public static final ResourceLocation model = new ResourceLocation("assets/models/item/superconductivepowder");
    public static Item INSTANCE = new superconductivepowder(new Properties().tab(ItemGroup.TAB_MISC)).setRegistryName("superconductivepowder");

    public superconductivepowder(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }
}
