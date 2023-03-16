
package net.mcreator.mistterysmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.mistterysmod.block.OremisteryBlock;
import net.mcreator.mistterysmod.MistterysModElements;

@MistterysModElements.ModElement.Tag
public class BlocksmisteryItemGroup extends MistterysModElements.ModElement {
	public BlocksmisteryItemGroup(MistterysModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabblocksmistery") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(OremisteryBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
