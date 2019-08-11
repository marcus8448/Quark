package vazkii.quark.decoration.feature;

import net.minecraft.block.Block;
import vazkii.quark.base.moduleloader.Config;
import vazkii.quark.base.moduleloader.LoadModule;
import vazkii.quark.base.moduleloader.Module;
import vazkii.quark.base.moduleloader.ModuleCategory;
import vazkii.quark.decoration.block.CharcoalBlock;

@LoadModule(category = ModuleCategory.DECORATION)
public final class CharcoalBlockFeature extends Module {

	@Config public static boolean burnsForever = true; 
	
	public static Block charcoal_block;
	
	@Override
	public void start() {
		charcoal_block = new CharcoalBlock();
	}
	
}