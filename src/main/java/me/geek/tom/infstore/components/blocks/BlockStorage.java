package me.geek.tom.infstore.components.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.EnumFacing;

public class BlockStorage extends Block {

    public static final DirectionProperty FACING = BlockHorizontal.HORIZONTAL_FACING;

    public BlockStorage(Block.Properties builder, String regName) {
        super(builder);
        this.setRegistryName(regName);
        System.out.println("!!! IMPORTANT !!!");
        System.out.println("BLOCK IS: " + this.toString());
        System.out.println("!!! IMPORTANT !!!");
        this.setDefaultState(this.stateContainer.getBaseState().with(FACING, EnumFacing.NORTH));
    }

    public IBlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
    }

    protected void fillStateContainer(StateContainer.Builder<Block, IBlockState> builder) {
        builder.add(FACING);
    }
}
