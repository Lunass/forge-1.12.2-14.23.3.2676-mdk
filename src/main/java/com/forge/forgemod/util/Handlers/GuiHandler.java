package com.forge.forgemod.util.Handlers;

import com.forge.forgemod.TileEntities.ContainerOreWasher;
import com.forge.forgemod.TileEntities.GuiOreWasher;
import com.forge.forgemod.TileEntities.TileEntityOreWasher;
import com.forge.forgemod.util.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

import javax.annotation.Nullable;

public class GuiHandler implements IGuiHandler {
    @Nullable
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if(ID == Reference.GUI_ORE_WASHER)return new ContainerOreWasher(player.inventory, (TileEntityOreWasher)world.getTileEntity(new BlockPos(x,y,z)));
        return null;
    }

    @Nullable
    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if(ID == Reference.GUI_ORE_WASHER)return new GuiOreWasher(player.inventory, (TileEntityOreWasher)world.getTileEntity(new BlockPos(x,y,z)));
        return null;
    }
}
