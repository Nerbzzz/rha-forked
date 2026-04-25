package me.nerbzzz.com.common.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

public class ArmorBlock extends Block {
    public ArmorBlock() {
        super(BlockBehaviour.Properties.of()
                .instrument(NoteBlockInstrument.BASEDRUM)
                .mapColor(MapColor.METAL)
                .sound(SoundType.NETHERITE_BLOCK)
                .strength(3.0F, 20.F)
                .requiresCorrectToolForDrops());
    }
}