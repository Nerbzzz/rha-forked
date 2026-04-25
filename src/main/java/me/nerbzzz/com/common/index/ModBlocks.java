package me.nerbzzz.com.common.index;

import me.nerbzzz.com.RolledHomongenous;

import me.nerbzzz.com.common.block.ArmorBlock;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public interface ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(RolledHomongenous.MOD_ID);

    // Hard Steel
    public static final DeferredHolder<Block, Block> HARDSTEEL_4BO = BLOCKS.register("hardsteel_4bo", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> HARDSTEELALGAE = BLOCKS.register("hardsteelalgae", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> HARDSTEELARDENNE = BLOCKS.register("hardsteelardenne", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> HARDSTEELAZURE = BLOCKS.register("hardsteelazure", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> HARDSTEELBLUSH = BLOCKS.register("hardsteelblush", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> HARDSTEELCACTUS = BLOCKS.register("hardsteelcactus", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> HARDSTEELCAMEL = BLOCKS.register("hardsteelcamel", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> HARDSTEELCHARCOAL = BLOCKS.register("hardsteelcharcoal", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> HARDSTEELCHERENKOV = BLOCKS.register("hardsteelcherenkov", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> HARDSTEELCORAL = BLOCKS.register("hardsteelcoral", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> HARDSTEELDESERT = BLOCKS.register("hardsteeldesert", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> HARDSTEELDUST = BLOCKS.register("hardsteeldust", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> HARDSTEELGARUPAN = BLOCKS.register("hardsteelgarupan", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> HARDSTEELGELB = BLOCKS.register("hardsteelgelb", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> HARDSTEELGINK = BLOCKS.register("hardsteelgink", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> HARDSTEELGORGE = BLOCKS.register("hardsteelgorge", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> HARDSTEELGRAVEL = BLOCKS.register("hardsteelgravel", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> HARDSTEELGRIZZLY = BLOCKS.register("hardsteelgrizzly", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> HARDSTEELHIDE = BLOCKS.register("hardsteelhide", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> HARDSTEELHORIZON = BLOCKS.register("hardsteelhorizon", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> HARDSTEELJET = BLOCKS.register("hardsteeljet", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> HARDSTEELKAMPFGRAU = BLOCKS.register("hardsteelkampfgrau", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> HARDSTEELKAT = BLOCKS.register("hardsteelkat", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> HARDSTEELLEY = BLOCKS.register("hardsteelley", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> HARDSTEELOLIVE = BLOCKS.register("hardsteelolive", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> HARDSTEELPANZERGRAU = BLOCKS.register("hardsteelpanzergrau", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> HARDSTEELPARADE = BLOCKS.register("hardsteelparade", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> HARDSTEELPATTON = BLOCKS.register("hardsteelpatton", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> HARDSTEELPINE = BLOCKS.register("hardsteelpine", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> HARDSTEELROTA = BLOCKS.register("hardsteelrota", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> HARDSTEELSCALE = BLOCKS.register("hardsteelscale", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> HARDSTEELSENSHA = BLOCKS.register("hardsteelsensha", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> HARDSTEELSLATE = BLOCKS.register("hardsteelslate", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> HARDSTEELSNOW = BLOCKS.register("hardsteelsnow", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> HARDSTEELTYPE = BLOCKS.register("hardsteeltype", ArmorBlock::new);

    // Layered Steel
    public static final DeferredHolder<Block, Block> LAYEREDSTEEL_4BO = BLOCKS.register("layeredsteel_4bo", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> LAYEREDSTEELALGAE = BLOCKS.register("layeredsteelalgae", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> LAYEREDSTEELARDENNE = BLOCKS.register("layeredsteelardenne", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> LAYEREDSTEELAZURE = BLOCKS.register("layeredsteelazure", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> LAYEREDSTEELBLUSH = BLOCKS.register("layeredsteelblush", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> LAYEREDSTEELCACTUS = BLOCKS.register("layeredsteelcactus", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> LAYEREDSTEELCAMEL = BLOCKS.register("layeredsteelcamel", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> LAYEREDSTEELCHARCOAL = BLOCKS.register("layeredsteelcharcoal", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> LAYEREDSTEELCHERENKOV = BLOCKS.register("layeredsteelcherenkov", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> LAYEREDSTEELCORAL = BLOCKS.register("layeredsteelcoral", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> LAYEREDSTEELDESERT = BLOCKS.register("layeredsteeldesert", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> LAYEREDSTEELDUST = BLOCKS.register("layeredsteeldust", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> LAYEREDSTEELGARUPAN = BLOCKS.register("layeredsteelgarupan", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> LAYEREDSTEELGELB = BLOCKS.register("layeredsteelgelb", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> LAYEREDSTEELGINK = BLOCKS.register("layeredsteelgink", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> LAYEREDSTEELGORGE = BLOCKS.register("layeredsteelgorge", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> LAYEREDSTEELGRAVEL = BLOCKS.register("layeredsteelgravel", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> LAYEREDSTEELGRIZZLY = BLOCKS.register("layeredsteelgrizzly", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> LAYEREDSTEELHIDE = BLOCKS.register("layeredsteelhide", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> LAYEREDSTEELHORIZON = BLOCKS.register("layeredsteelhorizon", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> LAYEREDSTEELJET = BLOCKS.register("layeredsteeljet", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> LAYEREDSTEELKAMPFGRAU = BLOCKS.register("layeredsteelkampfgrau", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> LAYEREDSTEELKAT = BLOCKS.register("layeredsteelkat", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> LAYEREDSTEELLEY = BLOCKS.register("layeredsteelley", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> LAYEREDSTEELOLIVE = BLOCKS.register("layeredsteelolive", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> LAYEREDSTEELPANZERGRAU = BLOCKS.register("layeredsteelpanzergrau", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> LAYEREDSTEELPARADE = BLOCKS.register("layeredsteelparade", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> LAYEREDSTEELPATTON = BLOCKS.register("layeredsteelpatton", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> LAYEREDSTEELPINE = BLOCKS.register("layeredsteelpine", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> LAYEREDSTEELROTA = BLOCKS.register("layeredsteelrota", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> LAYEREDSTEELSCALE = BLOCKS.register("layeredsteelscale", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> LAYEREDSTEELSENSHA = BLOCKS.register("layeredsteelsensha", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> LAYEREDSTEELSLATE = BLOCKS.register("layeredsteelslate", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> LAYEREDSTEELSNOW = BLOCKS.register("layeredsteelsnow", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> LAYEREDSTEELTYPE = BLOCKS.register("layeredsteeltype", ArmorBlock::new);

    // Riveted Steel
    public static final DeferredHolder<Block, Block> RIVETEDSTEEL_4BO = BLOCKS.register("rivetedsteel_4bo", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> RIVETEDSTEELALGAE = BLOCKS.register("rivetedsteelalgae", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> RIVETEDSTEELARDENNE = BLOCKS.register("rivetedsteelardenne", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> RIVETEDSTEELAZURE = BLOCKS.register("rivetedsteelazure", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> RIVETEDSTEELBLUSH = BLOCKS.register("rivetedsteelblush", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> RIVETEDSTEELCACTUS = BLOCKS.register("rivetedsteelcactus", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> RIVETEDSTEELCAMEL = BLOCKS.register("rivetedsteelcamel", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> RIVETEDSTEELCHARCOAL = BLOCKS.register("rivetedsteelcharcoal", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> RIVETEDSTEELCHERENKOV = BLOCKS.register("rivetedsteelcherenkov", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> RIVETEDSTEELCORAL = BLOCKS.register("rivetedsteelcoral", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> RIVETEDSTEELDESERT = BLOCKS.register("rivetedsteeldesert", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> RIVETEDSTEELDUST = BLOCKS.register("rivetedsteeldust", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> RIVETEDSTEELGARUPAN = BLOCKS.register("rivetedsteelgarupan", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> RIVETEDSTEELGELB = BLOCKS.register("rivetedsteelgelb", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> RIVETEDSTEELGINK = BLOCKS.register("rivetedsteelgink", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> RIVETEDSTEELGORGE = BLOCKS.register("rivetedsteelgorge", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> RIVETEDSTEELGRAVEL = BLOCKS.register("rivetedsteelgravel", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> RIVETEDSTEELGRIZZLY = BLOCKS.register("rivetedsteelgrizzly", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> RIVETEDSTEELHIDE = BLOCKS.register("rivetedsteelhide", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> RIVETEDSTEELHORIZON = BLOCKS.register("rivetedsteelhorizon", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> RIVETEDSTEELJET = BLOCKS.register("rivetedsteeljet", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> RIVETEDSTEELKAMPFGRAU = BLOCKS.register("rivetedsteelkampfgrau", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> RIVETEDSTEELKAT = BLOCKS.register("rivetedsteelkat", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> RIVETEDSTEELLEY = BLOCKS.register("rivetedsteelley", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> RIVETEDSTEELOLIVE = BLOCKS.register("rivetedsteelolive", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> RIVETEDSTEELPANZERGRAU = BLOCKS.register("rivetedsteelpanzergrau", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> RIVETEDSTEELPARADE = BLOCKS.register("rivetedsteelparade", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> RIVETEDSTEELPATTON = BLOCKS.register("rivetedsteelpatton", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> RIVETEDSTEELPINE = BLOCKS.register("rivetedsteelpine", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> RIVETEDSTEELROTA = BLOCKS.register("rivetedsteelrota", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> RIVETEDSTEELSCALE = BLOCKS.register("rivetedsteelscale", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> RIVETEDSTEELSENSHA = BLOCKS.register("rivetedsteelsensha", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> RIVETEDSTEELSLATE = BLOCKS.register("rivetedsteelslate", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> RIVETEDSTEELSNOW = BLOCKS.register("rivetedsteelsnow", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> RIVETEDSTEELTYPE = BLOCKS.register("rivetedsteeltype", ArmorBlock::new);

    // Slashed Steel
    public static final DeferredHolder<Block, Block> SLASHEDSTEEL_4BO = BLOCKS.register("slashedsteel_4bo", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> SLASHEDSTEELALGAE = BLOCKS.register("slashedsteelalgae", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> SLASHEDSTEELARDENNE = BLOCKS.register("slashedsteelardenne", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> SLASHEDSTEELAZURE = BLOCKS.register("slashedsteelazure", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> SLASHEDSTEELBLUSH = BLOCKS.register("slashedsteelblush", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> SLASHEDSTEELCACTUS = BLOCKS.register("slashedsteelcactus", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> SLASHEDSTEELCAMEL = BLOCKS.register("slashedsteelcamel", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> SLASHEDSTEELCHARCOAL = BLOCKS.register("slashedsteelcharcoal", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> SLASHEDSTEELCHERENKOV = BLOCKS.register("slashedsteelcherenkov", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> SLASHEDSTEELCORAL = BLOCKS.register("slashedsteelcoral", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> SLASHEDSTEELDESERT = BLOCKS.register("slashedsteeldesert", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> SLASHEDSTEELDUST = BLOCKS.register("slashedsteeldust", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> SLASHEDSTEELGARUPAN = BLOCKS.register("slashedsteelgarupan", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> SLASHEDSTEELGELB = BLOCKS.register("slashedsteelgelb", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> SLASHEDSTEELGINK = BLOCKS.register("slashedsteelgink", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> SLASHEDSTEELGOLD = BLOCKS.register("slashedsteelgold", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> SLASHEDSTEELGORGE = BLOCKS.register("slashedsteelgorge", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> SLASHEDSTEELGRAVEL = BLOCKS.register("slashedsteelgravel", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> SLASHEDSTEELGRIZZLY = BLOCKS.register("slashedsteelgrizzly", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> SLASHEDSTEELHIDE = BLOCKS.register("slashedsteelhide", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> SLASHEDSTEELHORIZON = BLOCKS.register("slashedsteelhorizon", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> SLASHEDSTEELJET = BLOCKS.register("slashedsteeljet", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> SLASHEDSTEELKAMPFGRAU = BLOCKS.register("slashedsteelkampfgrau", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> SLASHEDSTEELKAT = BLOCKS.register("slashedsteelkat", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> SLASHEDSTEELLEY = BLOCKS.register("slashedsteelley", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> SLASHEDSTEELNOTEX = BLOCKS.register("slashedsteelnotex", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> SLASHEDSTEELOLIVE = BLOCKS.register("slashedsteelolive", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> SLASHEDSTEELPANZERGRAU = BLOCKS.register("slashedsteelpanzergrau", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> SLASHEDSTEELPARADE = BLOCKS.register("slashedsteelparade", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> SLASHEDSTEELPATTON = BLOCKS.register("slashedsteelpatton", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> SLASHEDSTEELPINE = BLOCKS.register("slashedsteelpine", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> SLASHEDSTEELROTA = BLOCKS.register("slashedsteelrota", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> SLASHEDSTEELSCALE = BLOCKS.register("slashedsteelscale", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> SLASHEDSTEELSENSHA = BLOCKS.register("slashedsteelsensha", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> SLASHEDSTEELSLATE = BLOCKS.register("slashedsteelslate", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> SLASHEDSTEELSNOW = BLOCKS.register("slashedsteelsnow", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> SLASHEDSTEELTYPE = BLOCKS.register("slashedsteeltype", ArmorBlock::new);

    // Hatches
//    public static final DeferredHolder<Block, Block> HATCH_4BO = BLOCKS.register("hatch_4bo", HatchBlock::new);
//    public static final DeferredHolder<Block, Block> HATCHALGAE = BLOCKS.register("hatchalgae", HatchBlock::new);
//    public static final DeferredHolder<Block, Block> HATCHARDENNE = BLOCKS.register("hatchardenne", HatchBlock::new);
//    public static final DeferredHolder<Block, Block> HATCHAZURE = BLOCKS.register("hatchazure", HatchBlock::new);
//    public static final DeferredHolder<Block, Block> HATCHBLUSH = BLOCKS.register("hatchblush", HatchBlock::new);
//    public static final DeferredHolder<Block, Block> HATCHCACTUS = BLOCKS.register("hatchcactus", HatchBlock::new);
//    public static final DeferredHolder<Block, Block> HATCHCAMEL = BLOCKS.register("hatchcamel", HatchBlock::new);
//    public static final DeferredHolder<Block, Block> HATCHCHARCOAL = BLOCKS.register("hatchcharcoal", HatchBlock::new);
//    public static final DeferredHolder<Block, Block> HATCHCHERENKOV = BLOCKS.register("hatchcherenkov", HatchBlock::new);
//    public static final DeferredHolder<Block, Block> HATCHCORAL = BLOCKS.register("hatchcoral", HatchBlock::new);
//    public static final DeferredHolder<Block, Block> HATCHDESERT = BLOCKS.register("hatchdesert", HatchBlock::new);
//    public static final DeferredHolder<Block, Block> HATCHDUST = BLOCKS.register("hatchdust", HatchBlock::new);
//    public static final DeferredHolder<Block, Block> HATCHGARUPAN = BLOCKS.register("hatchgarupan", HatchBlock::new);
//    public static final DeferredHolder<Block, Block> HATCHGELB = BLOCKS.register("hatchgelb", HatchBlock::new);
//    public static final DeferredHolder<Block, Block> HATCHGINK = BLOCKS.register("hatchgink", HatchBlock::new);
//    public static final DeferredHolder<Block, Block> HATCHGORGE = BLOCKS.register("hatchgorge", HatchBlock::new);
//    public static final DeferredHolder<Block, Block> HATCHGRAVEL = BLOCKS.register("hatchgravel", HatchBlock::new);
//    public static final DeferredHolder<Block, Block> HATCHGRIZZLY = BLOCKS.register("hatchgrizzly", HatchBlock::new);
//    public static final DeferredHolder<Block, Block> HATCHHIDE = BLOCKS.register("hatchhide", HatchBlock::new);
//    public static final DeferredHolder<Block, Block> HATCHHORIZON = BLOCKS.register("hatchhorizon", HatchBlock::new);
//    public static final DeferredHolder<Block, Block> HATCHJET = BLOCKS.register("hatchjet", HatchBlock::new);
//    public static final DeferredHolder<Block, Block> HATCHKAMPFGRAU = BLOCKS.register("hatchkampfgrau", HatchBlock::new);
//    public static final DeferredHolder<Block, Block> HATCHKAT = BLOCKS.register("hatchkat", HatchBlock::new);
//    public static final DeferredHolder<Block, Block> HATCHLEY = BLOCKS.register("hatchley", HatchBlock::new);
//    public static final DeferredHolder<Block, Block> HATCHOLIVE = BLOCKS.register("hatcholive", HatchBlock::new);
//    public static final DeferredHolder<Block, Block> HATCHPANZERGRAU = BLOCKS.register("hatchpanzergrau", HatchBlock::new);
//    public static final DeferredHolder<Block, Block> HATCHPARADE = BLOCKS.register("hatchparade", HatchBlock::new);
//    public static final DeferredHolder<Block, Block> HATCHPATTON = BLOCKS.register("hatchpatton", HatchBlock::new);
//    public static final DeferredHolder<Block, Block> HATCHPINE = BLOCKS.register("hatchpine", HatchBlock::new);
//    public static final DeferredHolder<Block, Block> HATCHROTA = BLOCKS.register("hatchrota", HatchBlock::new);
//    public static final DeferredHolder<Block, Block> HATCHSCALE = BLOCKS.register("hatchscale", HatchBlock::new);
//    public static final DeferredHolder<Block, Block> HATCHSENSHA = BLOCKS.register("hatchsensha", HatchBlock::new);
//    public static final DeferredHolder<Block, Block> HATCHSLATE = BLOCKS.register("hatchslate", HatchBlock::new);
//    public static final DeferredHolder<Block, Block> HATCHSNOW = BLOCKS.register("hatchsnow", HatchBlock::new);
//    public static final DeferredHolder<Block, Block> HATCHTYPE = BLOCKS.register("hatchtype", HatchBlock::new);

    // Misc
    public static final DeferredHolder<Block, Block> SANDBAGGREEN = BLOCKS.register("sandbaggreen", ArmorBlock::new);
    public static final DeferredHolder<Block, Block> SANDBAGTAN = BLOCKS.register("sandbagtan", ArmorBlock::new);

    public static void initialize(IEventBus bus) {
        BLOCKS.register(bus);
    }
}