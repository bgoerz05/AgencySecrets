package acentMCB.mods.util;

import acentMCB.mods.AgencySecrets;
import acentMCB.mods.item.ItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ForgeRegistry;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AgencySecrets.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final RegistryObject<Item> LUNITESHARD = ITEMS.register("lunite_shard", ItemBase::new);
    public static final RegistryObject<Item> LUNITE_DISK = ITEMS.register("lunite_disk", ItemBase::new);

}
