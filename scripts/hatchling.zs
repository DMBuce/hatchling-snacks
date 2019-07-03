
# ingredients
recipes.addShaped("CTNoodles", <contenttweaker:noodles>*4, [
	[ null,              <minecraft:wheat>, null              ],
	[ <minecraft:wheat>, <ore:egg>,         <minecraft:wheat> ],
	[ null,              <minecraft:wheat>, null              ]
]);
recipes.addShapeless(
	"CTCheese",
	<contenttweaker:cheese>*3,
	[<minecraft:milk_bucket>, <minecraft:sugar>|<minecraft:brown_mushroom>]
);
furnace.addRecipe(<contenttweaker:fried_egg>, <ore:egg>, 0.35);

# beverages
recipes.addShapeless(
	"CTAppleJuice",
	<contenttweaker:apple_juice>,
	[<minecraft:glass_bottle>, <minecraft:apple>, <minecraft:sugar>]
);
recipes.addShaped(
	"CTChocoMilk",
	<contenttweaker:chocolate_milk>*3,
	[ [<minecraft:dye:3>, <minecraft:milk_bucket>, <minecraft:dye:3>],
	  [<minecraft:glass_bottle>, <minecraft:glass_bottle>, <minecraft:glass_bottle>] ]
);
recipes.addShapeless(
	"CTMelonWine",
	<contenttweaker:melon_wine>,
	[<minecraft:glass_bottle>, <minecraft:melon>, <minecraft:fermented_spider_eye>]
);

# soup
recipes.addShapeless(
	"CTMacAndCheese",
	<contenttweaker:mac_and_cheese>,
	[<minecraft:bowl>, <contenttweaker:noodles>, <contenttweaker:cheese>]
);
recipes.addShapeless(
	"CTChickenNoodle",
	<contenttweaker:chicken_noodle_soup>,
	[<minecraft:bowl>, <minecraft:cooked_chicken>, <contenttweaker:noodles>, <minecraft:carrot>]
);

# dessert
recipes.addShapeless(
	"CTApplePie",
	<contenttweaker:apple_pie>,
	[<minecraft:apple>, <minecraft:sugar>, <ore:egg>, <minecraft:apple>]
);

# sandwiches
recipes.addShaped(
	"CTCheeseSandwich",
	<contenttweaker:sandwich_cheese>*2,
	[ [ null,                    <minecraft:bread>,       null ],
	  [ <contenttweaker:cheese>, <contenttweaker:cheese>, <contenttweaker:cheese> ],
	  [ null,                    <minecraft:bread>,       null ] ]
);
recipes.addShaped(
	"CTHamCheeseSandwich",
	<contenttweaker:sandwich_cheese_ham>*2,
	[ [<minecraft:bread>],
	  [<minecraft:cooked_porkchop>],
	  [<minecraft:bread>] ]
);
furnace.addRecipe(
	<contenttweaker:grilled_sandwich_cheese>,
	<contenttweaker:sandwich_cheese>,
	0.35
);
furnace.addRecipe(
	<contenttweaker:grilled_sandwich_cheese_ham>,
	<contenttweaker:sandwich_cheese_ham>,
	0.35
);
recipes.addShaped(
	"CTPhillyCheeseSteak",
	<contenttweaker:sandwich_cheese_steak>*2,
	[ [null,                    <minecraft:bread>,       null],
	  [<contenttweaker:cheese>, <minecraft:cooked_beef>, <contenttweaker:cheese>],
	  [null,                    <minecraft:bread>,       null] ]
);

# sandwiches on a bun
recipes.addShapeless(
	"CTChickenSandwich",
	<contenttweaker:burger_cheese_chicken>,
	[ <minecraft:bread>, <minecraft:cooked_chicken>, <contenttweaker:cheese>, <minecraft:tallgrass:1> ]
);
recipes.addShapeless(
	"CTFishBurger",
	<contenttweaker:burger_cheese_fish>,
	[ <minecraft:bread>, <minecraft:cooked_fish>, <contenttweaker:cheese>, <minecraft:tallgrass:1> ]
);
recipes.addShapeless(
	"CTBaconEggCheese",
	<contenttweaker:burger_cheese_bacon_egg>,
	[ <minecraft:bread>, <contenttweaker:fried_egg>, <contenttweaker:cheese>, <minecraft:cooked_porkchop> ]
);

# burgers
recipes.addShapeless(
	"CTBurger",
	<contenttweaker:burger>,
	[ <minecraft:bread>, <minecraft:cooked_beef> ]
);
recipes.addShapeless(
	"CTBaconCheeseburger",
	<contenttweaker:burger_cheese_bacon>,
	[ <minecraft:bread>, <minecraft:cooked_beef>, <contenttweaker:cheese>, <minecraft:cooked_porkchop> ]
);
recipes.addShapeless(
	"CTMushroomBurger",
	<contenttweaker:burger_mushroom>,
	[ <minecraft:bread>, <minecraft:cooked_beef>, <minecraft:brown_mushroom>, <minecraft:brown_mushroom> ]
);

