package com.forge.forgemod.util.Handlers;

import com.forge.forgemod.Main;
import com.forge.forgemod.init.ModBlocks;
import com.forge.forgemod.init.ModItems;
import com.forge.forgemod.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

@Mod.EventBusSubscriber
public class RegistryHandler
{
    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
    }
    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event){
        event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
        TileEntityHandler.registerTileEntities();
    }
    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event)
    {
        for(Item item : ModItems.ITEMS)
            if (item instanceof IHasModel)
            {
                ((IHasModel)item).registerModels();
            }
        for(Block block : ModBlocks.BLOCKS)
            if (block instanceof IHasModel)
            {
                ((IHasModel)block).registerModels();
            }

    }
    public static void initRegistries(){

    }
}
