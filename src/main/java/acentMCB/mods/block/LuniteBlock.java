package acentMCB.mods.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class LuniteBlock extends Block {
    public LuniteBlock() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(36.0f, 9000000.0f)
                .harvestTool(ToolType.PICKAXE)
                .sound(SoundType.ANCIENT_DEBRIS)
                .harvestLevel(3)
        );
    }
}
