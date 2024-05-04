package us.hydradev.hydradoors.items;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import us.hydradev.hydradoors.HydraDoors;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HydraDoors.MOD_ID);

    public static final RegistryObject<Item> SUSAN = ITEMS.register("susan",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> HYDRADOOR = ITEMS.register("hydradoor",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
