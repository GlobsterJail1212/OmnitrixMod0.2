package com.mod.omnitrixmod;

import com.mod.omnitrixmod.transformations.controls.ceo;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = OmnitrixMod.MODID,bus = Mod.EventBusSubscriber.Bus.FORGE,value = Dist.CLIENT)

public class renderingregistry {

    @SubscribeEvent
    public static void onRenderPlayer(final RenderPlayerEvent.Pre event){
        if (ceo.currenttransformation.equals("ghostfreak")){
            event.setCanceled(true);
            ceo.renderGhostFreak(event);
        }
    }
    @SubscribeEvent
    public static void onRenderPlayer2(final RenderPlayerEvent.Post event){
     //   event.setCanceled(true);
    }
}
