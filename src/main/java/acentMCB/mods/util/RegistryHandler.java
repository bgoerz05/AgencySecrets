package acentMCB.mods.util;

import acentMCB.mods.AgencySecrets;
import acentMCB.mods.block.BlockItemBase;
import acentMCB.mods.block.LuniteBlock;
import acentMCB.mods.block.LuniteOre;
import acentMCB.mods.item.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ForgeRegistry;

public class RegistryHandler {

    //Registries
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AgencySecrets.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AgencySecrets.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Items
    public static final RegistryObject<Item> LUNITE_SHARD = ITEMS.register("lunite_shard", ItemBase::new);

    //Blocks
    public static final RegistryObject<Block> LUNITE_BLOCK = BLOCKS.register("lunite_block", LuniteBlock::new);
    public static final RegistryObject<Block> LUNITE_ORE = BLOCKS.register("lunite_ore", LuniteOre::new);

    //BlockItems
    public static final RegistryObject<Item> LUNITE_BLOCK_ITEM = ITEMS.register("lunite_block", () -> new BlockItemBase(LUNITE_BLOCK.get()));
    public static final RegistryObject<Item> LUNITE_ORE_ITEM = ITEMS.register("lunite_ore", () -> new BlockItemBase(LUNITE_ORE.get()));

    public static final RegistryObject<Item> LUNITESHARD = ITEMS.register("lunite_shard", ItemBase::new);
    public static final RegistryObject<Item> LUNITE_DISK = ITEMS.register("lunite_disk", ItemBase::new);

}
