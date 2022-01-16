package com.mod.omnitrixmod.network.message;

import com.mod.omnitrixmod.transformations.controls.ceo;
import com.mod.omnitrixmod.transformations.controls.controlmanager;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.PacketBuffer;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraftforge.event.world.NoteBlockEvent;
import net.minecraftforge.fml.network.NetworkEvent;

import java.util.function.Supplier;

public class inputmessage {
    public int key;
    public inputmessage(){

    }
    public inputmessage(int key){
        this.key=key;
    }
    public static void encode(inputmessage message, PacketBuffer Buffer){
        Buffer.writeInt(message.key);
    }
    public static inputmessage decode(PacketBuffer Buffer){
        return new inputmessage(Buffer.readInt());
    }
    public static void handle(inputmessage message, Supplier<NetworkEvent.Context> context){
        NetworkEvent.Context c = context.get();
        c.enqueueWork(()->{
            ServerPlayerEntity Player = c.getSender();
            Player.addItem(new ItemStack(Items.AIR));
            controlmanager.invisplayer(Player);
        });
        c.setPacketHandled(true);
    }
}
