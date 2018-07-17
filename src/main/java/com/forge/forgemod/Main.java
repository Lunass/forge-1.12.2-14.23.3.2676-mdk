package com.forge.forgemod;

import com.forge.forgemod.TileEntities.TileEntityOreWasher;
import com.forge.forgemod.proxy.CommonProxy;
import com.forge.forgemod.util.Handlers.GuiHandler;
import com.forge.forgemod.util.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {

    @Mod.Instance
    public static Main instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public static void PreInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public static void PostInit(FMLPostInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public static void Init(FMLInitializationEvent event)
    {

        NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new GuiHandler());

    }

}
