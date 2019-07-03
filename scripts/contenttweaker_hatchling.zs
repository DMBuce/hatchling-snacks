
#loader contenttweaker

import mods.contenttweaker.ItemFood;

# ingredients
var noodles       = mods.contenttweaker.VanillaFactory.createItem("noodles");
var cheese        = mods.contenttweaker.VanillaFactory.createItemFood("cheese", 3);
var egg           = mods.contenttweaker.VanillaFactory.createItemFood("fried_egg", 3);
cheese.saturation = 0.6;
egg.saturation    = 0.6;

# beverages
var applejuice        = mods.contenttweaker.VanillaFactory.createItemFood("apple_juice", 2);
var chocomilk         = mods.contenttweaker.VanillaFactory.createItemFood("chocolate_milk", 2);
var wine              = mods.contenttweaker.VanillaFactory.createItemFood("melon_wine", 1);
applejuice.saturation = 0.1;
chocomilk.saturation  = 0.1;
wine.saturation       = 0.1;

# soups
var maccheese            = mods.contenttweaker.VanillaFactory.createItemFood("mac_and_cheese", 6);
var chickennoodle        = mods.contenttweaker.VanillaFactory.createItemFood("chicken_noodle_soup", 6);
maccheese.saturation       = 0.6;
maccheese.maxStackSize     = 1;
chickennoodle.saturation   = 0.6;
chickennoodle.maxStackSize = 1;

# desserts
var applepie        = mods.contenttweaker.VanillaFactory.createItemFood("apple_pie", 8);
applepie.saturation = 0.3;

# sandwiches
var cheese_sandwich        = mods.contenttweaker.VanillaFactory.createItemFood("sandwich_cheese", 6);
var grilled_cheese         = mods.contenttweaker.VanillaFactory.createItemFood("grilled_sandwich_cheese", 7);
var ham_sandwich           = mods.contenttweaker.VanillaFactory.createItemFood("sandwich_cheese_ham", 8);
var ham_melt               = mods.contenttweaker.VanillaFactory.createItemFood("grilled_sandwich_cheese_ham", 10);
var philly_steak           = mods.contenttweaker.VanillaFactory.createItemFood("sandwich_cheese_steak", 10);
cheese_sandwich.saturation = 0.6;
grilled_cheese.saturation  = 0.6;
ham_sandwich.saturation    = 0.8;
ham_melt.saturation        = 0.8;
philly_steak.saturation    = 0.8;

# sandwiches on a bun
var chicken_sandwich        = mods.contenttweaker.VanillaFactory.createItemFood("burger_cheese_chicken", 8);
var fishburger              = mods.contenttweaker.VanillaFactory.createItemFood("burger_cheese_fish", 8);
var baconeggcheese          = mods.contenttweaker.VanillaFactory.createItemFood("burger_cheese_bacon_egg", 10);
chicken_sandwich.saturation = 0.6;
fishburger.saturation       = 0.6;
baconeggcheese.saturation   = 0.8;

# burgers
var burger                   = mods.contenttweaker.VanillaFactory.createItemFood("burger", 8);
var baconcheeseburger        = mods.contenttweaker.VanillaFactory.createItemFood("burger_cheese_bacon", 10);
var mushroomburger           = mods.contenttweaker.VanillaFactory.createItemFood("burger_mushroom", 9);
burger.saturation            = 0.8;
baconcheeseburger.saturation = 0.8;
mushroomburger.saturation    = 0.8;

## eat animations
#cheese.itemUseAction = "EAT";
#egg.itemUseAction = "EAT";
#applejuice.itemUseAction = "DRINK";
#chocomilk.itemUseAction = "DRINK";
#wine.itemUseAction = "DRINK";
#maccheese.itemUseAction = "EAT";
#chickennoodle.itemUseAction = "EAT";
#applepie.itemUseAction = "EAT";
#cheese_sandwich.itemUseAction = "EAT";
#grilled_cheese.itemUseAction = "EAT";
#ham_sandwich.itemUseAction = "EAT";
#ham_melt.itemUseAction = "EAT";
#philly_steak.itemUseAction = "EAT";
#chicken_sandwich.itemUseAction = "EAT";
#fishburger.itemUseAction = "EAT";
#baconeggcheese.itemUseAction = "EAT";
#burger.itemUseAction = "EAT";
#baconcheeseburger.itemUseAction = "EAT";
#mushroomburger.itemUseAction = "EAT";

# register items
noodles.register();
cheese.register();
egg.register();
applejuice.register();
chocomilk.register();
wine.register();
maccheese.register();
chickennoodle.register();
applepie.register();
cheese_sandwich.register();
grilled_cheese.register();
ham_sandwich.register();
ham_melt.register();
philly_steak.register();
chicken_sandwich.register();
fishburger.register();
baconeggcheese.register();
burger.register();
baconcheeseburger.register();
mushroomburger.register();

