package com.mod.omnitrixmod.screens;

import com.ibm.icu.impl.data.ResourceReader;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.widget.button.ImageButton;
import net.minecraft.util.ResourceLocation;

public class transformbutton extends ImageButton {
    ResourceLocation background;
    public transformbutton(int p_i51134_1_, int p_i51134_2_, int p_i51134_3_, int p_i51134_4_, ResourceLocation p_i51134_8_, IPressable p_i51134_9_) {
        super(p_i51134_1_, p_i51134_2_, p_i51134_3_, p_i51134_4_, 0, 0, 0, p_i51134_8_, p_i51134_9_);
        background = p_i51134_8_;
    }

    @Override
    public void render(MatrixStack p_230430_1_, int p_230430_2_, int p_230430_3_, float p_230430_4_) {
        super.render(p_230430_1_, p_230430_2_, p_230430_3_, p_230430_4_);
        Minecraft.getInstance().getTextureManager().bind(background);
        RenderSystem.disableDepthTest();
        blit(p_230430_1_,this.x,this.y,0,0,0,64,32,1,1);
        RenderSystem.enableDepthTest();
    }
}
