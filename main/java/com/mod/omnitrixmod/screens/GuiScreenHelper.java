package com.mod.omnitrixmod.screens;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "OmnitrixMod", bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class GuiScreenHelper {

    @SubscribeEvent
    public static void renderOverlay(RenderGameOverlayEvent.Pre event){
    }
}
