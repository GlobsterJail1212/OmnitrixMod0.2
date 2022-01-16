package com.mod.omnitrixmod.transformations.controls;

import com.mod.omnitrixmod.OmnitrixMod;
import com.mod.omnitrixmod.network.message.inputmessage;
import com.mod.omnitrixmod.network.omnitrixnetworkchannel;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import java.awt.event.KeyEvent;

@Mod.EventBusSubscriber(modid = OmnitrixMod.MODID,bus = Mod.EventBusSubscriber.Bus.FORGE,value = Dist.CLIENT)

public class controlmanager {

    public static final KeyBinding untransform=new KeyBinding("key.omnitrixmod.untransform", KeyEvent.VK_UNDEFINED,"key.categories.omnitrixmod");
    public static final KeyBinding ultimate=new KeyBinding("key.omnitrixmod.ultimate", KeyEvent.VK_UNDEFINED,"key.categories.omnitrixmod");
    public static final KeyBinding control1=new KeyBinding("key.omnitrixmod.control1", KeyEvent.VK_UNDEFINED,"key.categories.omnitrixmod");
    public static final KeyBinding control2=new KeyBinding("key.omnitrixmod.control2", KeyEvent.VK_UNDEFINED,"key.categories.omnitrixmod");
    public static final KeyBinding control3=new KeyBinding("key.omnitrixmod.control3", KeyEvent.VK_UNDEFINED,"key.categories.omnitrixmod");
    public static final KeyBinding control4=new KeyBinding("key.omnitrixmod.control4", KeyEvent.VK_UNDEFINED,"key.categories.omnitrixmod");
    public static final KeyBinding control5=new KeyBinding("key.omnitrixmod.control5", KeyEvent.VK_UNDEFINED,"key.categories.omnitrixmod");
    public static final KeyBinding control6=new KeyBinding("key.omnitrixmod.ultimateability", KeyEvent.VK_UNDEFINED, "key.categories.omnitrixmod");
    static boolean isinvisible = false;
    static boolean isintangible = false;

    @SubscribeEvent
    public static void onKeyPress(InputEvent.KeyInputEvent event) {
        if (event.getKey()==untransform.getKey().getValue()){
            ceo.changetransformation("defaultmodel");
        }
        if (event.getKey()==control1.getKey().getValue())
        {
            omnitrixnetworkchannel.CHANNEL.sendToServer(new inputmessage(event.getKey()));
            }
        }

    public static void invisplayer(ServerPlayerEntity Player){
            if (isinvisible) {
                Minecraft.getInstance().player.removeEffect(Effect.byId(14));
                isinvisible = false;
            } else {
                Player.addEffect(new EffectInstance(Effect.byId(14),500));
                isinvisible = true;
            }
    }

    @SubscribeEvent
    public static void ClientSetup(final FMLClientSetupEvent event){
        ClientRegistry.registerKeyBinding(untransform);
        ClientRegistry.registerKeyBinding(ultimate);
        ClientRegistry.registerKeyBinding(control1);
        ClientRegistry.registerKeyBinding(control2);
        ClientRegistry.registerKeyBinding(control3);
        ClientRegistry.registerKeyBinding(control4);
        ClientRegistry.registerKeyBinding(control5);
        ClientRegistry.registerKeyBinding(control6);
    }
}
