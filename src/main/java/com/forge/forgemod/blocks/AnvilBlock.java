package com.forge.forgemod.blocks;

import javafx.geometry.BoundingBox;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class AnvilBlock extends BlockModeledBase {

    public AnvilBlock(String name, Material material) {
        super(name, material);
        setSoundType(SoundType.ANVIL);
        setHardness(5.0f);
        setResistance(6000.0f);
        setHarvestLevel("pickaxe", 1);

    }

}
