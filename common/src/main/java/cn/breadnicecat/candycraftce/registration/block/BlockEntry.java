package cn.breadnicecat.candycraftce.registration.block;

import cn.breadnicecat.candycraftce.registration.RegistryEntry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

/**
 * Created in 2023/12/10 10:10
 * Project: candycraftce
 *
 * @author <a href="https://github.com/BreadNiceCat">Bread_NiceCat</a>
 * <p>
 */
public abstract class BlockEntry<B extends Block> extends RegistryEntry implements ItemLike {

	public BlockEntry(ResourceLocation id) {
		super(id);
	}


	public abstract B getBlock();

	public BlockState defaultBlockState() {
		return getBlock().defaultBlockState();
	}


	@Override
	public @NotNull Item asItem() {
		return getBlock().asItem();
	}
}
