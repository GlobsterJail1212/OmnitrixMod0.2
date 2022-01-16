package com.mod.omnitrixmod.transformations.controls;

import com.mod.omnitrixmod.OmnitrixMod;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.client.renderer.entity.PlayerRenderer;
import net.minecraft.client.renderer.entity.model.PlayerModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.common.MinecraftForge;

public class playermodels extends LivingRenderer {
    public PlayerModel<LivingEntity> currentmodel;
    public static final ResourceLocation ghostfreakstandard = new ResourceLocation(OmnitrixMod.MODID,"textures/entities/ghostfreakstandard.png");
    public playermodels(EntityRendererManager p_i46102_1_, PlayerModel model) {
        super(p_i46102_1_, model,.01f);
        currentmodel = model;
    }

    public ResourceLocation getTextureLocation(AbstractClientPlayerEntity p_110775_1_) {
        return ghostfreakstandard;
    }

    public void renderLeftHand(MatrixStack p_229146_1_, IRenderTypeBuffer p_229146_2_, int p_229146_3_, AbstractClientPlayerEntity p_229146_4_) {
    }

    public void renderRightHand(MatrixStack p_229144_1_, IRenderTypeBuffer p_229144_2_, int p_229144_3_, AbstractClientPlayerEntity p_229144_4_) {
    }

    public void setmodelproperties(AbstractClientPlayerEntity player){
        if (player.isSpectator()){
            currentmodel.setAllVisible(false);
        }
        else{
            currentmodel.setAllVisible(true);
        }
    }

    @Override
    public ResourceLocation getTextureLocation(Entity p_110775_1_)
    {return ghostfreakstandard;}
}
