
package net.mcreator.mistterysmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.mistterysmod.item.FragmentcorruptedItem;
import net.mcreator.mistterysmod.MistterysModElements;

@MistterysModElements.ModElement.Tag
public class ItemsmisteryItemGroup extends MistterysModElements.ModElement {
	public ItemsmisteryItemGroup(MistterysModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabitems_mistery") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(FragmentcorruptedItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
