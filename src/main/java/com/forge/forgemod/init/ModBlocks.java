package com.forge.forgemod.init;

import com.forge.forgemod.blocks.AnvilBlock;
import com.forge.forgemod.blocks.BlockBase;
import com.forge.forgemod.blocks.BlockModeledBase;
import com.forge.forgemod.blocks.OreWasher;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<Block>();
    public static final Block ANVIL_BLOCK = new AnvilBlock("anvil_block",Material.ANVIL);
    public static final Block ORE_WASHER = new OreWasher("ore_washer",Material.WOOD);
    public static final Block FORGE_BLOCK = new BlockModeledBase("forge_block", Material.ROCK);
}
