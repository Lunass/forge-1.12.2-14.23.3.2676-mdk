package com.forge.forgemod.TileEntities.slots;

import com.forge.forgemod.TileEntities.TileEntityOreWasher;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotOreWasherFuel extends Slot {
    public SlotOreWasherFuel(IInventory inventoryIn, int index, int xPosition, int yPosition) {
        super(inventoryIn, index, xPosition, yPosition);
    }
    @Override
    public boolean isItemValid(ItemStack stack){
        return TileEntityOreWasher.isItemFuel(stack);
    }
    @Override
    public int getItemStackLimit(ItemStack stack){
        return super.getItemStackLimit(stack);
    }
}
