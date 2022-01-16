package com.mod.omnitrixmod.items.materials;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;

public class superconductiverod extends Item {
    public static final ResourceLocation model = new ResourceLocation("assets/models/item/superconductiverod");
    public static Item INSTANCE = new superconductiverod(new Properties().tab(ItemGroup.TAB_MISC).fireResistant()).setRegistryName("superconductiverod");

    public superconductiverod(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }
}
