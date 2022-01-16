package com.mod.omnitrixmod.items.materials;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;

public class superconductivepaste extends Item {

    public static final ResourceLocation model = new ResourceLocation("assets/models/item/superconductivepaste");
    public static Item INSTANCE = new superconductivepaste(new Properties().tab(ItemGroup.TAB_MISC)).setRegistryName("superconductivepaste");

    public superconductivepaste(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }
}
