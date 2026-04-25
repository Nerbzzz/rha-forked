package me.nerbzzz.com.common.index;

import me.nerbzzz.com.RolledHomongenous;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public interface ModTabs {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RolledHomongenous.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> RHA_TAB =
            TABS.register("rolledhomogenous", () -> CreativeModeTab.builder()
                    .title(Component.translatable("item_group.rha.rolledhomogenous"))
                    .icon(() -> new ItemStack(ModItems.HARDSTEEL_4BO.get()))
                    .displayItems((parameters, output) -> {
                        ModItems.ITEMS.getEntries().forEach(item -> output.accept(item.get()));
                    })
                    .build());

    public static void initialize(IEventBus bus) {
        TABS.register(bus);
    }
}
