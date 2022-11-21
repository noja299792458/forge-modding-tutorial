package fox.photon.tutorial;

import fox.photon.tutorial.item.TutorialItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod(Constants.MOD_ID)
public class SimpleItemBlockMod {
    public SimpleItemBlockMod() {
        //step0 : TutorialItemクラスのインスタンスを作成
        //TutorialItem tutorialItem = new TutorialItem(); //error

        //step1 : DeferredRegisterの定義
        DeferredRegister<Item> defRegItems
                = DeferredRegister.create(ForgeRegistries.ITEMS,Constants.MOD_ID);

        //step2 : DeferredRegisterにアイテムを登録
        RegistryObject<Item> regObjTutorialItem
                = defRegItems.register("tutorial_item",()->new TutorialItem());

        //step3 : DeferredRegisterにModのEventBusを登録
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        defRegItems.register(modEventBus);
    }
}