package com.mod.omnitrixmod.transformations.controls;

import com.mod.omnitrixmod.OmnitrixMod;
import com.mod.omnitrixmod.transformations.ghostfreak.ghostfreakstandard;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ClientPlayerNetworkEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.network.FMLNetworkConstants;

@Mod.EventBusSubscriber(modid = OmnitrixMod.MODID,bus = Mod.EventBusSubscriber.Bus.FORGE,value = Dist.CLIENT)
public class ceo {
    public static String currenttransformation;

    public static void renderGhostFreak(final RenderPlayerEvent.Pre event) {
        playermodels render = new playermodels(Minecraft.getInstance().getEntityRenderDispatcher(), new ghostfreakstandard());
        MatrixStack m=event.getMatrixStack();
        m.scale(.35f,.35f,.35f);
        render.render(event.getPlayer(),event.getPlayer().yBodyRot,0f,m,event.getBuffers(),event.getLight());
    }
    public static void changetransformation(String name){
        currenttransformation=name;
    }

    @SubscribeEvent
    public static void onPlayerJoin(ClientPlayerNetworkEvent event) {
        if(event.getPlayer() instanceof ClientPlayerEntity) {
            ClientPlayerEntity Player = (ClientPlayerEntity) event.getPlayer();
            currenttransformation = Player.getModelName();
        }
    }
}
