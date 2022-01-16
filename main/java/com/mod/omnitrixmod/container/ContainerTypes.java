package com.mod.omnitrixmod.container;

import com.mod.omnitrixmod.OmnitrixMod;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ContainerTypes {

    public static final DeferredRegister<ContainerType<?>> CONTAINER_TYPES = DeferredRegister.create(ForgeRegistries.CONTAINERS, OmnitrixMod.MODID);

    public static final RegistryObject<ContainerType<omnitrixdatacontainer1>> OMNITRIX_CONTAINER = CONTAINER_TYPES.register(OmnitrixMod.MODID, () -> IForgeContainerType.create(omnitrixdatacontainer1::new));

}
