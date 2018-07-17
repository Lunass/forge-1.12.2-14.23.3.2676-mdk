package com.forge.forgemod.blocks;

import com.forge.forgemod.Main;
import com.forge.forgemod.TileEntities.TileEntityOreWasher;
import com.forge.forgemod.util.Reference;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class OreWasher extends BlockModeledBase implements ITileEntityProvider {
    public OreWasher(String name, Material material) {
        super(name, material);
    }


    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if(!worldIn.isRemote)
        {
            playerIn.openGui(Main.instance, Reference.GUI_ORE_WASHER, worldIn, pos.getX(), pos.getY(), pos.getZ());
        }

        return true;
    }

    @Nullable
    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntityOreWasher() {
        };
    }
}
