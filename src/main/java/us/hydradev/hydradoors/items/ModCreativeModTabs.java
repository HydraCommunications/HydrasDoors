package us.hydradev.hydradoors.items;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import us.hydradev.hydradoors.HydraDoors;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HydraDoors.MOD_ID);

    public static final RegistryObject<CreativeModeTab> HYDRA_DOORS_TAB = CREATIVE_MODE_TABS.register("hydra_doors_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.HYDRADOOR.get()))
                    .title(Component.translatable("creativetab.hydra_doors_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.SUSAN.get());
                        pOutput.accept(ModItems.HYDRADOOR.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
