package me.nerbzzz.com;

import me.nerbzzz.com.common.index.ModBlocks;
import me.nerbzzz.com.common.index.ModItems;
import me.nerbzzz.com.common.index.ModTabs;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(RolledHomongenous.MOD_ID)
public class RolledHomongenous {
    public static final String MOD_ID = "rha";
    public static final Logger LOGGER = LogUtils.getLogger();

    public RolledHomongenous(IEventBus modEventBus) {
        ModItems.initialize(modEventBus);
        ModBlocks.initialize(modEventBus);
        ModTabs.initialize(modEventBus);
    }
}