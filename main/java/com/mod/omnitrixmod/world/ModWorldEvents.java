package com.mod.omnitrixmod.world;

import com.mod.omnitrixmod.OmnitrixMod;
import com.mod.omnitrixmod.world.gen.OreGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = OmnitrixMod.MODID)
public class ModWorldEvents {

    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        OreGeneration.generateOres(event);

    }

}
