package cn.breadnicecat.candycraftce.registration.block.fabric;

import cn.breadnicecat.candycraftce.registration.block.BlockEntry;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

/**
 * Created in 2023/12/10 10:34
 * Project: candycraftce
 *
 * @author <a href="https://github.com/BreadNiceCat">Bread_NiceCat</a>
 * <p>
 */
public class CBlockBuilderImpl {
	public static <B extends Block> BlockEntry<B> register(ResourceLocation name, @NotNull Supplier<B> sup) {
		B b = Registry.register(BuiltInRegistries.BLOCK, name, sup.get());
		return new BlockEntry<>(name) {
			@Override
			public B getBlock() {
				return b;
			}
		};
	}
}
