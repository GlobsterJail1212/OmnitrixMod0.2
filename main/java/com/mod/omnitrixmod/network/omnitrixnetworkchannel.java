package com.mod.omnitrixmod.network;

import com.mod.omnitrixmod.OmnitrixMod;
import com.mod.omnitrixmod.network.message.inputmessage;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.network.NetworkRegistry;
import net.minecraftforge.fml.network.simple.SimpleChannel;

public class omnitrixnetworkchannel {
    public static final String NETWORKVERSION = "0.1.0";
    public static final SimpleChannel CHANNEL = NetworkRegistry.newSimpleChannel(new ResourceLocation(OmnitrixMod.MODID,"network"),()->NETWORKVERSION,version->version.equals(NETWORKVERSION),version->version.equals(NETWORKVERSION));
    public static void INIT (){
        CHANNEL.registerMessage(0, inputmessage.class,inputmessage::encode,inputmessage::decode,inputmessage::handle);
    }
}
