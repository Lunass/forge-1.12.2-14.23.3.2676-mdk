package com.forge.forgemod.util.Handlers;

import com.forge.forgemod.TileEntities.TileEntityOreWasher;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler {
    public static void registerTileEntities(){
        GameRegistry.registerTileEntity(TileEntityOreWasher.class,"ore_washer");
    }
}
