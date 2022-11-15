package fox.photon.tutorial.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public class TutorialItem extends Item {
    public TutorialItem() {
        super(new Properties().tab(CreativeModeTab.TAB_MISC));
    }
}