package acentMCB.mods.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class LuniteOre extends Block {
    public LuniteOre() {
        super(Block.Properties.create(Material.IRON)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE)
                .sound(SoundType.ANCIENT_DEBRIS)
                .hardnessAndResistance(16.0f, 900000.0f)
        );
    }
}
