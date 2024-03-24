package cn.breadnicecat.candycraftce.block;

import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

import static cn.breadnicecat.candycraftce.utils.ResourceUtils.prefix;

/**
 * Created in 2023/12/31 8:36
 * Project: candycraftce
 *
 * @author <a href="https://github.com/Bread-Nicecat">Bread_NiceCat</a>
 * <p>
 */
public class CBlockTags {
	public static final TagKey<Block> CARAMEL_PORTAL_FRAME = bind("caramel_portal_frame");
	public static final TagKey<Block> CANDY_PLANT_CAN_ON = bind("candy_plant_can_on");
	public static final TagKey<Block> CANDY_LOGS = bind("candy_logs");
	public static final TagKey<Block> CANDY_PLANKS = bind("candy_planks");
	public static final TagKey<Block> JELLIES = bind("jellies");
	public static final TagKey<Block> ICE_CREAMS = bind("ice_creams");
	public static final TagKey<Block> CHOCOLATES = bind("chocolates");
	public static final TagKey<Block> GEN_REPLACEABLE = bind("gen_replaceable");

	private static TagKey<Block> bind(String name) {
		return TagKey.create(Registries.BLOCK, prefix(name));
	}
}
